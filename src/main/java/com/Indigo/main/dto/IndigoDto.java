package com.Indigo.main.dto;

import java.io.Serializable;

public class IndigoDto implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
    
    private String firstName;
    private String lastName;
    private int age;
    private String sex;
    private String userName;
    private String password;
    private String email;
    private long id;
    public String getFirstName() {
    	return firstName;
    }
    public void setFirstName(String firstName) {
    	this.firstName = firstName;
    }
    public String getLastName() {
    	return lastName;
    }
    public void setLastName(String lastName) {
    	this.lastName = lastName;
    }
    public int getAge() {
    	return age;
    }
    public void setAge(int age) {
    	this.age = age;
    }
    public String getSex() {
    	return sex;
    }
    public void setSex(String sex) {
    	this.sex = sex;
    }

    public String getUserName() {
    	return userName;
    }
    public void setUserName(String userName) {
    	this.userName = userName;
    }
    public String getPassword() {
    	return password;
    }
    public void setPassword(String password) {
    	this.password = password;
    }
    public String getEmail() {
    	return email;
    }
    public void setEmail(String email) {
    	this.email = email;
    }

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

}
