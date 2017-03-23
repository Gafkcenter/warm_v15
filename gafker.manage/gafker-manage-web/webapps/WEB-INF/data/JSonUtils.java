package com.medishare.manis.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.commons.lang3.ObjectUtils;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.medishare.manis.domain.finance.Coupon;
import com.medishare.manis.domain.finance.Money;

/**
 * 处理Object与String的表现
 * 
 * @author laurence
 *
 */
public class JSonUtils {

	final static ObjectMapper mapper = new ObjectMapper();
	static{
		mapper.setSerializationInclusion(Include.NON_NULL);
	}

	public static String toJsonString(Object obj) {
		try {
			return mapper.writeValueAsString(obj);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static String toTinyJsonString(Object obj) {
		try {
			return mapper.setSerializationInclusion(Include.NON_NULL).writeValueAsString(obj);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return "{}";
	}

	public static <T> T toObject(String json, Class<T> clazz) {
		try {
			return mapper.readValue(json, clazz);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static Map<String, Money> fromMoneyString(String json) {
		Map<String, Money> ret = new HashMap<String, Money>();
		try {
			Map m = JSonUtils.toObject(json, Map.class);
			if (m != null) {
				Set<Entry> sss = m.entrySet();
				for (Entry en : sss) {
					Map mm = (Map) en.getValue();
					Money mn = new Money(Double.valueOf(mm.get("amount").toString()));
					mn.setMemo(ObjectUtils.identityToString(mm.get("memo")));
					ret.put(en.getKey().toString(), mn);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ret;
	}

	public static String fromMoney(Map<String, Money> data) {
		try {
			return JSonUtils.toJsonString(data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "{}";
	}

	public static String fromCouponList(List<Coupon> coupons) {
		if (coupons == null || coupons.isEmpty()) {
			return "[]";
		}
		List ret = new ArrayList();
		for (Coupon c : coupons) {
			Map r = new HashMap();
			r.put("id", c.getId());
			Money m = c.getAmt();
			r.put("amt", m == null ? 0 : m.getAmount());
			String accId = c.getAccountId();
			r.put("acctid", accId == null ? null : accId);
			ret.add(r);
		}
		return JSonUtils.toJsonString(ret);
	}

	public static List<Coupon> fromCouponJSon(String json) {
		List all = JSonUtils.toObject(json, List.class);
		if (all == null || all.isEmpty()) {
			return Collections.emptyList();
		}
		List<Coupon> ret = new ArrayList<Coupon>();
		for (Object o : all) {
			Map m = (Map) o;
			Coupon cc = new Coupon();
			Object id = m.get("id");
			cc.setId(id == null ? null : id.toString());
			Object amt = m.get("amt");
			cc.setAmt(new Money(Double.valueOf(amt == null ? "0" : amt.toString())));
			Object accid = m.get("accid");
			cc.setAccountId(accid == null ? null : accid.toString());
			ret.add(cc);
		}
		return ret;
	}

	public static Long getLong(Date date) {
		if (date != null) {
			return date.getTime();
		}
		return null;
	}

}
