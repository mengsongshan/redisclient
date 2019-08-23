package com.mengmiao.model;

public abstract class Model {
	MODEL_TYPE type;
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MODEL_TYPE getType() {
		return type;
	}

	public void setType(MODEL_TYPE type) {
		this.type = type;
	}

	static enum MODEL_TYPE {
		MENUBAR, MENU, MENUITEM
	}
}

