package com.gafker.manage.datatype;

import com.gafker.common.utils.vcf.AddressBean;
import com.gafker.manage.entity.Phoneseven;

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
