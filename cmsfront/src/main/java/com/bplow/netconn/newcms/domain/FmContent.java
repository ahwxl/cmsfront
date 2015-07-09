package com.bplow.netconn.newcms.domain;
// default package
// Generated 2015-7-5 19:49:47 by Hibernate Tools 4.0.0

import java.util.Arrays;
import java.util.Date;

/**
 * FmContentId generated by hbm2java
 */
public class FmContent implements java.io.Serializable {

	private String id;
	private String cntCaption;
	private String secondCaption;
	private byte[] content;
	private String operateUserId;
	private Date operateDate;
	private Character isDeleteFlag;
	private Integer orderId;
	private Integer clickNum;
	private String catalogId;

	public FmContent() {
	}

	public FmContent(String id, String cntCaption, String secondCaption,
			byte[] content, String operateUserId, Date operateDate,
			Character isDeleteFlag, Integer orderId, Integer clickNum,
			String catalogId) {
		this.id = id;
		this.cntCaption = cntCaption;
		this.secondCaption = secondCaption;
		this.content = content;
		this.operateUserId = operateUserId;
		this.operateDate = operateDate;
		this.isDeleteFlag = isDeleteFlag;
		this.orderId = orderId;
		this.clickNum = clickNum;
		this.catalogId = catalogId;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCntCaption() {
		return this.cntCaption;
	}

	public void setCntCaption(String cntCaption) {
		this.cntCaption = cntCaption;
	}

	public String getSecondCaption() {
		return this.secondCaption;
	}

	public void setSecondCaption(String secondCaption) {
		this.secondCaption = secondCaption;
	}

	public byte[] getContent() {
		return this.content;
	}

	public void setContent(byte[] content) {
		this.content = content;
	}

	public String getOperateUserId() {
		return this.operateUserId;
	}

	public void setOperateUserId(String operateUserId) {
		this.operateUserId = operateUserId;
	}

	public Date getOperateDate() {
		return this.operateDate;
	}

	public void setOperateDate(Date operateDate) {
		this.operateDate = operateDate;
	}

	public Character getIsDeleteFlag() {
		return this.isDeleteFlag;
	}

	public void setIsDeleteFlag(Character isDeleteFlag) {
		this.isDeleteFlag = isDeleteFlag;
	}

	public Integer getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Integer getClickNum() {
		return this.clickNum;
	}

	public void setClickNum(Integer clickNum) {
		this.clickNum = clickNum;
	}

	public String getCatalogId() {
		return this.catalogId;
	}

	public void setCatalogId(String catalogId) {
		this.catalogId = catalogId;
	}

}
