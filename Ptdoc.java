package com.cetc28.persistent;

import java.sql.Timestamp;

/**
 * Ptdoc entity. @author MyEclipse Persistence Tools
 */

public class Ptdoc implements java.io.Serializable {

	// Fields

	private Integer id;
	private String title;
	private String type;
	private String description;
	private String user;
	private Timestamp ctime;
	private String linkstr;
    
    

	//onstructors
    
	/** default constructor */
	public Ptdoc() {
	}

	/** full constructor */
	public Ptdoc(String title, String type, String description, String user,
			Timestamp ctime, String linkstr) {
		this.title = title;
		this.type = type;
		this.description = description;
		this.user = user;
		this.ctime = ctime;
		this.linkstr = linkstr;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUser() {
		return this.user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public Timestamp getCtime() {
		return this.ctime;
	}

	public void setCtime(Timestamp ctime) {
		this.ctime = ctime;
	}

	public String getLinkstr() {
		return this.linkstr;
	}

	public void setLinkstr(String linkstr) {
		this.linkstr = linkstr;
	}

}