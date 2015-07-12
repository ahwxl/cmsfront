package com.bplow.netconn.newcms.domain;

public class TplDecisionDomain {
	
	private TplEnum tplEnum;
	private int     num;
	private String  id;
	
	
	public TplDecisionDomain(TplEnum tplEnum, int num) {
		super();
		this.tplEnum = tplEnum;
		this.num = num;
	}
	

	public TplDecisionDomain() {
		super();
	}




	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public TplEnum getTplEnum() {
		return tplEnum;
	}


	public void setTplEnum(TplEnum tplEnum) {
		this.tplEnum = tplEnum;
	}


	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
	}
	
	
	

}
