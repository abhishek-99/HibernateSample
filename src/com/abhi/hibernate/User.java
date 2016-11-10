package com.abhi.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity(name="users")
//@Table(name = "users")
public class User {

@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="id")
int id;

@Column(name="Name")
String username;

@Column(name="EmailId")
String EmailId;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

public String getEmailId() {
	return EmailId;
}

public void setEmailId(String emailId) {
	EmailId = emailId;
}

}
