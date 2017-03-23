package cn.itcast.bean;

public class Province {

	private Integer id;
	
	private String pname;

	public Province(Integer id, String pname) {
		this.id = id;
		this.pname = pname;
	}
	
	public Province() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}
	
}
