package com.springFrame.lc.api;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UserInfoDTO {

	@NotBlank(message = " * Your Name can't be blank")
	@Size(min = 3,max = 15,message = " * Your Name Should have char between 3-15")
	private String userName ;
	
	@NotBlank(message = " * Crush Name can't be blank")
	@Size(min = 3,max = 15,message = " * Crush Name Should have char between 3-15")
	private String crushName ;
	
	@AssertTrue(message = "Agree to use our app")
	private boolean termAndCondition;
	
	public UserInfoDTO() {
		System.out.println("User info DTO contr called...");
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getCrushName() {
		return crushName;
	}
	public void setCrushName(String crushName) {
		this.crushName = crushName;
	}
	
	public boolean isTermAndCondition() {
		return termAndCondition;
	}
	public void setTermAndCondition(boolean termAndCondition) {
		this.termAndCondition = termAndCondition;
	}
	@Override
	public String toString() {
		return "UserInfoDTO [userName=" + userName + ", crushName=" + crushName + ", termAndCondition="
				+ termAndCondition + ", getUserName()=" + getUserName() + ", getCrushName()=" + getCrushName()
				+ ", isTermAndCondition()=" + isTermAndCondition() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	 
}
