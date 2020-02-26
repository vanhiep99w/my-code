package model;

import java.io.Serializable;

public class Request implements Serializable{
	private int type;
	private String content;

	public Request() {
	}

	public Request(int type, String content) {
		super();
		this.type = type;
		this.content = content;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
