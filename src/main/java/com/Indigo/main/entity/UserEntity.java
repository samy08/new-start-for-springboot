package com.Indigo.main.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="IndigoAirwaysUsers")
public class UserEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@GeneratedValue
	@Id
	private long id;
     @Column(name="firstName",nullable=false,length=100)
		private String firstName;
	    
	@Column(name="lastName", nullable=false,length=100)
	private String lastName;
	
    @Column(name="age", nullable=false,length=50)
	private int age;
    
    @Column(name="sex", nullable=false,length=50)
	private String sex;
    
    @Column(name="userName",nullable=false,length=100)
	private String userName;
    
    @Column(name="password",nullable=false,length=100)
	private String password;
    
   
	
    @Column(name="email",nullable=false,length=100) 
	private String email;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
	public String getUsername() {
		return userName;
	}
	public void setUsername(String username) {
		this.userName = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
