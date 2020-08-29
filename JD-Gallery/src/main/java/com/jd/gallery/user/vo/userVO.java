package com.jd.gallery.user.vo;

import org.apache.ibatis.type.Alias;

@Alias("userVO")
public class userVO {
	private String userType;
	private int userNum;
	private String userToken;
	private int userAuth;
	private String userId;
	private String userPw;
	private String userEmail;
	private String userStatus;
	private String userNickname;
	private String userIp;
	private String userLoginTime;
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public int getUserNum() {
		return userNum;
	}
	public void setUserNum(int userNum) {
		this.userNum = userNum;
	}
	public String getUserToken() {
		return userToken;
	}
	public void setUserToken(String userToken) {
		this.userToken = userToken;
	}
	public int getUserAuth() {
		return userAuth;
	}
	public void setUserAuth(int userAuth) {
		this.userAuth = userAuth;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserStatus() {
		return userStatus;
	}
	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}
	public String getUserNickname() {
		return userNickname;
	}
	public void setUserNickname(String userNickname) {
		this.userNickname = userNickname;
	}
	public String getUserIp() {
		return userIp;
	}
	public void setUserIp(String userIp) {
		this.userIp = userIp;
	}
	public String getUserLoginTime() {
		return userLoginTime;
	}
	public void setUserLoginTime(String userLoginTime) {
		this.userLoginTime = userLoginTime;
	}
	@Override
	public String toString() {
		return "userVO [userType=" + userType + ", userNum=" + userNum + ", userToken=" + userToken + ", userAuth="
				+ userAuth + ", userId=" + userId + ", userPw=" + userPw + ", userEmail=" + userEmail + ", userStatus="
				+ userStatus + ", userNickname=" + userNickname + ", userIp=" + userIp + ", userLoginTime="
				+ userLoginTime + ", getUserType()=" + getUserType() + ", getUserNum()=" + getUserNum()
				+ ", getUserToken()=" + getUserToken() + ", getUserAuth()=" + getUserAuth() + ", getUserId()="
				+ getUserId() + ", getUserPw()=" + getUserPw() + ", getUserEmail()=" + getUserEmail()
				+ ", getUserStatus()=" + getUserStatus() + ", getUserNickname()=" + getUserNickname() + ", getUserIp()="
				+ getUserIp() + ", getUserLoginTime()=" + getUserLoginTime() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
