package com.gafker.manage.format;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.gafker.manage.pojo.Userattribute;

public abstract class FormatExchangeAbstract implements FormatExchange<Userattribute>{
	
	public Userattribute toObject(String entity) {
		Userattribute user = null;
		if(!entity.isEmpty()){
			JSONObject parseObject = JSON.parseObject(entity);
			user =  JSONObject.toJavaObject(parseObject, Userattribute.class);
		}
		return user;
	}

	public String toJsonString(Userattribute entity) {
		String userString = null;
		if(entity!=null){
			userString = JSON.toJSONString(entity);
		}
		return userString;
	}
}
