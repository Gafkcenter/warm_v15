package com.gafker.common.utils.vcf;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.apache.commons.lang3.StringUtils;

public class MainMock {
	public static void main(String[] args) {
		String fileName ="D:/fileUpload/vcf/test"+StringUtils.replace(UUID.randomUUID().toString(), "-", "")+".vcf";
		String fileNameIn ="D:/fileUpload/vcf/2017-04-22 19-12-14.vcf";
//		ImportVcf.exportVcf(fileName , setMockAddressList());
		ImportExportVcf.importVcf(fileNameIn);
	}
	public static  List<AddressBean> setMockAddressList() {
		List<AddressBean> addressBeans = new ArrayList<AddressBean>();
		AddressBean addressBean = new AddressBean();
		addressBean.setTrueName("zhangjie");
		addressBean.setMobile("18255963695");
		addressBeans.add(addressBean);

		addressBean = new AddressBean();
		addressBean.setTrueName("张三");
		addressBean.setMobile("15255963695");
		addressBeans.add(addressBean);
		return addressBeans;
	}
}
