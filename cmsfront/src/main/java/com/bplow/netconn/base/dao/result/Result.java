package com.bplow.netconn.base.dao.result;

/**
 * 数据操作结果集
 * @author qian
 *
 */
public class Result {
	
	public boolean isSuccess;
	public String  resultCode;
	public String  resultMessage;
	public Object  resultObj;
	
	public Result() {
		super();
		this.isSuccess = true;
	}
	
	public Result(Object resultObj) {
		super();
		this.resultObj = resultObj;
		this.isSuccess = true;
	}



	public boolean isSuccess() {
		return isSuccess;
	}

	public void setSuccess(boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

	public String getResultCode() {
		return resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public Object getResultObj() {
		return resultObj;
	}

	public void setResultObj(Object resultObj) {
		this.resultObj = resultObj;
	}
	
	
	

}
