package com.gafker.manage.pojo;

import com.gafker.manage.entity.Phoneseven;

public class PhonesevenForm  extends Phoneseven{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6907159303791628283L;
	public PhonesevenForm getFromPhoneseven(Phoneseven f){
		this.setId(f.getId());
		this.setNameen(f.getNameen());
		this.setNamecn(f.getNamecn());
		this.setPhoneseven(f.getPhoneseven());
		this.setFinished(f.getFinished());
		this.setStartposition(f.getStartposition());
		this.setGeoposition(f.getGeoposition());
		this.setCount(f.getCount());
		this.setRemarks(f.getRemarks());
		this.setIdx(f.getIdx());
		this.setWeburls(f.getWeburls());
		this.setAdsidsFk(f.getAdsidsFk());
		this.setPrefixFk(f.getPrefixFk());
		this.setUpdatetime(f.getUpdatetime());
		this.setUpdateby(f.getUpdateby());
		return this;
	}

}
