package com.zumba.bean;

public class Participants {
private int participantid;
private String pname;
private int age;
private String phonenumber;
private Integer batchid;		// it can hold null value. for FK
public int getParticipantid() {
	return participantid;
}
public void setParticipantid(int participantid) {
	this.participantid = participantid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getPhonenumber() {
	return phonenumber;
}
public void setPhonenumber(String phonenumber) {
	this.phonenumber = phonenumber;
}
public Integer getBatchid() {
	return batchid;
}
public void setBatchid(Integer batchid) {
	this.batchid = batchid;
}
public Participants() {
	super();
	// TODO Auto-generated constructor stub
}
public Participants(int participantid, String pname, int age, String phonenumber, Integer batchid) {
	super();
	this.participantid = participantid;
	this.pname = pname;
	this.age = age;
	this.phonenumber = phonenumber;
	this.batchid = batchid;
}


}
