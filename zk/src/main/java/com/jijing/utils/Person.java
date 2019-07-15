package com.jijing.utils;

public class Person {
   private Integer id;
   private String name;
   private String hobby;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getHobby() {
	return hobby;
}
public void setHobby(String hobby) {
	this.hobby = hobby;
}
public Person(Integer id, String name, String hobby) {
	super();
	this.id = id;
	this.name = name;
	this.hobby = hobby;
}
public Person() {
	super();
}
   
}
