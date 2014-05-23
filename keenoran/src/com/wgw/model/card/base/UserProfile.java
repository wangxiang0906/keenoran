package com.wgw.model.card.base;
/**
 * 
 * @ClassName: UserProfile 
 * @Description: 用户信息同步的实体
 * @author 王翔   wangxiang0906@foxmail.com
 * @date 2014年5月21日 上午11:45:18 
 *
 */
public class UserProfile {
	
	private String openId;//买家微信侧标识
	private String name;//买家名称
	private String birthday;//
	private String mobile;//
	private String email;//买家email
	private String sex;//买家性别（F/M）
	private String idCardNo;//买家身份证号
	private String cardVersion;//信息版本
	
	public String getOpenId() {
		return openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getIdCardNo() {
		return idCardNo;
	}
	public void setIdCardNo(String idCardNo) {
		this.idCardNo = idCardNo;
	}
	public String getCardVersion() {
		return cardVersion;
	}
	public void setCardVersion(String cardVersion) {
		this.cardVersion = cardVersion;
	}

}
