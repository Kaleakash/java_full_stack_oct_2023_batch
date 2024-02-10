package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Gpay {
@Id
private int gpayid;
private String emailid;
public int getGpayid() {
	return gpayid;
}
public void setGpayid(int gpayid) {
	this.gpayid = gpayid;
}
public String getEmailid() {
	return emailid;
}
public void setEmailid(String emailid) {
	this.emailid = emailid;
}
@Override
public String toString() {
	return "Gpay [gpayid=" + gpayid + ", emailid=" + emailid + "]";
}

}
