package com.gafker.manage.pojo.page;

public class BasePage <T>{
int pageSize=10;
int pageStart=0;
public int getPageSize() {
	return pageSize;
}
public void setPageSize(int pageSize) {
	this.pageSize = pageSize;
}
public int getPageStart() {
	return pageStart;
}
public void setPageStart(int pageStart) {
	this.pageStart = pageStart;
}


}
