package com.bean;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
@Entity
public class Trainer {
@Id
private int tid;
private String tname;
private String tech;
@OneToMany
@JoinColumn(name="tsid")
private List<Student> listOfstd;
@OneToMany
@JoinColumn(name="tsubid")
private List<Subject> listOfSub;
public List<Student> getListOfstd() {
	return listOfstd;
}
public void setListOfstd(List<Student> listOfstd) {
	this.listOfstd = listOfstd;
}
public List<Subject> getListOfSub() {
	return listOfSub;
}
public void setListOfSub(List<Subject> listOfSub) {
	this.listOfSub = listOfSub;
}
public int getTid() {
	return tid;
}
public void setTid(int tid) {
	this.tid = tid;
}
public String getTname() {
	return tname;
}
public void setTname(String tname) {
	this.tname = tname;
}
public String getTech() {
	return tech;
}
public void setTech(String tech) {
	this.tech = tech;
}
}
