package com.w.pojo;

import java.util.List;

public class Files {
	private String id;
	private String text;
	private String state;
	private List<Files> children;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public List<Files> getChildren() {
		return children;
	}

	public void setChildren(List<Files> children) {
		this.children = children;
	}

	public Files(String id, String text, String state, List<Files> children) {
		super();
		this.id = id;
		this.text = text;
		this.state = state;
		this.children = children;
	}

	public Files() {
		super();
	}

}
