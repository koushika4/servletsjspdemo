package com.bean;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Classes {
@Id
private int cid;
private String cname;
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
}
