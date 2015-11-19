package com.w.text;

public class CodeLanguage {
	private String id;
	private String text;
	private String desc;

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

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public CodeLanguage(String id, String text, String desc) {
		super();
		this.id = id;
		this.text = text;
		this.desc = desc;
	}

	public CodeLanguage() {
		super();
	}

}
