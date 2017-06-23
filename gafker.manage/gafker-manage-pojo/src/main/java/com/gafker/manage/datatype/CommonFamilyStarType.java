package com.gafker.manage.datatype;

import com.gafker.manage.enums.CommonType;

/**
 * 任务综合评分
 * 
 * @author gafker
 *
 */
public class CommonFamilyStarType {
	//功能类型
	private CommonType dotype;
	// 家庭成员
	private int memberStar;
	// 家庭
	private int familyStar;
	// 代
	private int generationStar;
	// 分支
	private int branchStar;
	// 同姓
	private int surnameStar;
	// 区域
	private int areaStar;
	// 亲戚
	private int kinsfolkStar;
	// 大众评分
	private int publicStar;

	public int getMemberStar() {
		return memberStar;
	}

	public void setMemberStar(int memberStar) {
		this.memberStar = memberStar;
	}

	public int getFamilyStar() {
		return familyStar;
	}

	public void setFamilyStar(int familyStar) {
		this.familyStar = familyStar;
	}

	public int getGenerationStar() {
		return generationStar;
	}

	public void setGenerationStar(int generationStar) {
		this.generationStar = generationStar;
	}

	public int getBranchStar() {
		return branchStar;
	}

	public void setBranchStar(int branchStar) {
		this.branchStar = branchStar;
	}

	public int getSurnameStar() {
		return surnameStar;
	}

	public void setSurnameStar(int surnameStar) {
		this.surnameStar = surnameStar;
	}

	public int getPublicStar() {
		return publicStar;
	}

	public void setPublicStar(int publicStar) {
		this.publicStar = publicStar;
	}

	public int getAreaStar() {
		return areaStar;
	}

	public void setAreaStar(int areaStar) {
		this.areaStar = areaStar;
	}

	public int getKinsfolkStar() {
		return kinsfolkStar;
	}

	public void setKinsfolkStar(int kinsfolkStar) {
		this.kinsfolkStar = kinsfolkStar;
	}

	public CommonType getDotype() {
		return dotype;
	}

	public void setDotype(CommonType dotype) {
		this.dotype = dotype;
	}

}
