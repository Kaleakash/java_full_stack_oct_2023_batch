package com;

public class Customer {
private int cid;
private String cname;
private int age;
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	if(age<0) {
		this.age  =19;
	}else {
		this.age = age;
	}
	
}

}
