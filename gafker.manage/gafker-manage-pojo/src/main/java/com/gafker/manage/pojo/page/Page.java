package com.gafker.manage.pojo.page;

import java.util.List;

import com.gafker.manage.pojo.Happayteachersdays;

public class Page extends BasePage<Happayteachersdays>{
List<Happayteachersdays> data;

public List<Happayteachersdays> getData() {
	return data;
}

public void setData(List<Happayteachersdays> data) {
	this.data = data;
}

}
