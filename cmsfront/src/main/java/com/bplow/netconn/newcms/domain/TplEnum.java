package com.bplow.netconn.newcms.domain;

public enum TplEnum {
	
	CATALOG("catalog","dc_cms/contentlist"),CONTENT("content","dc_cms/contentpage");
	
	private String name;
	
	private String tmlPath;

	private TplEnum(String name, String tmlPath) {
		this.name = name;
		this.tmlPath = tmlPath;
	}
	
	public static TplEnum create(int num){
		if(num <= 1){
			return TplEnum.CONTENT;
		}
		return TplEnum.CATALOG;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTmlPath() {
		return tmlPath;
	}

	public void setTmlPath(String tmlPath) {
		this.tmlPath = tmlPath;
	}
	
	
	

}
