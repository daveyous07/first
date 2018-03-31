/*
 *
 * Copyright (c) 1999-2018 NetDimensions Ltd.
 *
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * NetDimensions Ltd. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with NetDimensions.
 */
package com.example.grpc;


public class Person {
	
	private String name;
	private int age;
	private String address;
	private String password;
	
public Person(String name, int age,String address) {
    this.setName(name);
    this.setAge(age);
    this.setAddress(address);
}

public String getPassword() {

	return password;
}

public void setPassword(String password) {

	this.password = password;
}

public String getName() {

	return name;
}

public void setName(String name) {

	this.name = name;
}

public String getAddress() {

	return address;
}

public void setAddress(String address) {

	this.address = address;
}

public int getAge() {

	return age;
}

public void setAge(int age) {

	this.age = age;
}

}
