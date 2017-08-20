package com.gafker.manage.service.utils;

import java.util.Date;

import com.gafker.common.utils.HttpClientUtil;
import com.gafker.manage.datatype.Data360;
import com.gafker.manage.datatype.PhoneMobile;
import com.gafker.manage.entity.Phoneseven;
import com.gafker.manage.enums.PhoneprefixFinished;
import com.gafker.manage.pojo.PhonesevenForm;

public class ThirdPartyRestApi {
	public static PhonesevenForm getPhonePlaceFromAll3rdApi(Phoneseven phone, String mobileRest1, String mobileRest2,
			String mobileRest3) {
		PhonesevenForm phoneNew = new PhonesevenForm();
		phoneNew.setId(phone.getId());
		phoneNew.getFromPhoneseven(phone);
		// httpclient 对phoneseven 设置归属地
		String phoneseven = String.valueOf(phoneNew.getPhoneseven());
		String mobleRestTemp = mobileRest1;
		mobleRestTemp = mobleRestTemp.replace("%", phoneseven);
		String stringGeo = HttpClientUtil.httpGetRequest(mobleRestTemp);
		PhoneMobile phoneTemp = JSonUtils.toObject(stringGeo, PhoneMobile.class);
		Data360 data2 = phoneTemp.getData();
		if (phoneTemp != null && data2 != null && "".equals(data2.getProvince())) {
			mobleRestTemp = mobileRest2;
			mobleRestTemp = mobleRestTemp.replace("%", phoneseven);
			stringGeo = HttpClientUtil.httpGetRequest(mobleRestTemp + "8888");
			stringGeo = stringGeo.replace("__GetZoneResult_ =", "").replace("\r\n\t", "\"").replace("\r\n ", "\"")
					.replace(":'", "\":\"").replace("'", "\"").replace(" ", "");
			if (stringGeo.contains("province\":\"\"")) {
				mobleRestTemp = mobileRest3;
				mobleRestTemp = mobleRestTemp.replace("%", phoneseven);
				stringGeo = HttpClientUtil.httpGetRequest(mobleRestTemp);
				if (stringGeo.contains("<html>"))
					return null;
			}
		}
		stringGeo = stringGeo.replaceAll("ID", "id");
		PhoneMobile phoneInfo =null;
		if(stringGeo !=null && !"".equals(stringGeo)){
		phoneInfo = JSonUtils.toObject(stringGeo, PhoneMobile.class);
		}
		if (phoneInfo != null && ("0".equals(phoneInfo.getRet()) || "0".equals(phoneInfo.getCode())||!"".equals(phoneInfo.getProvince()))) {
			phoneNew.setFinished(PhoneprefixFinished.START.getValue());
			String phoneString = JSonUtils.toJsonString(phoneInfo);
			Data360 data = phoneInfo.getData();
			phoneNew.setRemarks(phoneInfo.getAreaCode() + "_" + phoneInfo.getZip() + "_" + phoneInfo.getAreaVid() + "_"
					+ phoneInfo.getMts());
			if (data != null && !"".equals(data.getProvince()))
				phoneNew.setRemarks(phoneInfo.getData().getProvince() + phoneInfo.getData().getCity());
			phoneNew.setGeoposition(phoneString);
			phoneNew.setUpdatetime(new Date());
		}
		if ("null_null_null_null".equals(phoneNew.getRemarks())){
			phoneNew.setFinished("nodate");
		}else{
			phoneNew.setFinished("nodate");
		}
		return phoneNew;
	}
}
