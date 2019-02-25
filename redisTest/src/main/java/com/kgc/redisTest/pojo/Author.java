package com.kgc.redisTest.pojo;

public class Author {
	public String name;
	public String intro_l;
	public String getIntro_l() {
		return intro_l;
	}
	public void setIntro_l(String intro_l) {
		this.intro_l = intro_l;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Author(String name, String intro_l) {
		super();
		this.name = name;
		this.intro_l = intro_l;
	}
	public Author() {
		super();
	}
	@Override
	public String toString() {
		return "Author [name=" + name + ", intro_l=" + intro_l + "]";
	}
	
}

