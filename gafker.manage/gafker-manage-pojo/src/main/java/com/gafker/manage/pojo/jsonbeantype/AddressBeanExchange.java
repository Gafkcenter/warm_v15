package com.gafker.manage.pojo.jsonbeantype;

import com.gafker.common.utils.vcf.AddressBean;
import com.gafker.manage.pojo.Phoneseven;

public class AddressBeanExchange  extends AddressBean{
public AddressBean fromPhonesevenToAddressBean(Phoneseven a){
	this.setTrueName(a.getRemarks());
	this.setMobile(a.getPhoneseven()+"");
	this.setEmail("");
	this.setTelePhone("");
	this.setWorkMobile("");
	return this;
}
}
