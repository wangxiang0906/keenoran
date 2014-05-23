package com.wgw.model.card.base;

public class UserCard {
	
	private String openId;//买家微信侧标识
	private String cardLevelId;//消费金额
	private String cardNo;//积分
	private String expiryDate;//过期日期
	private String storeId;//门店ID
	private String storeName;// 门店名称
	private String cardVersion;// 信息版本
	
	public String getOpenId() {
		return openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getCardLevelId() {
		return cardLevelId;
	}
	public void setCardLevelId(String cardLevelId) {
		this.cardLevelId = cardLevelId;
	}
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public String getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	public String getStoreId() {
		return storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public String getCardVersion() {
		return cardVersion;
	}
	public void setCardVersion(String cardVersion) {
		this.cardVersion = cardVersion;
	}
}
