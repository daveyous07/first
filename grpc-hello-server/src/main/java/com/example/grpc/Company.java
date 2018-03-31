
package com.example.grpc;


public class Company {
private String name;
private int age;
private String address;
	
public Company(String name,int age,String address){
    this.setName(name);
    this.setAge(age);
    this.setAddress(address);
}



public String getName() {

	return name;
}

public void setName(String name) {

	this.name = name;
}



public int getAge() {

	return age;
}



public void setAge(int age) {

	this.age = age;
}



public String getAddress() {

	return address;
}



public void setAddress(String address) {

	this.address = address;
}
}
