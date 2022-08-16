package com.bean;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Subject {
@Id
private int subid;
private String subname;
private Integer tsubid;
public Integer getTsubid() {
	return tsubid;
}
public void setTsubid(Integer tsubid) {
	this.tsubid = tsubid;
}
public int getSubid() {
	return subid;
}
public void setSubid(int subid) {
	this.subid = subid;
}
public String getSubname() {
	return subname;
}
public void setSubname(String subname) {
	this.subname = subname;
}
}

