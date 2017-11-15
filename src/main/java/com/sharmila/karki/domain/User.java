package com.sharmila.karki.domain;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotNull;

/**
 * @author Sharmila Karki
 *
 */
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	private String id;
	@NotNull
	private String email;
	private String password;
	private Date createdDate;
	private Date modifiedDate;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

}
