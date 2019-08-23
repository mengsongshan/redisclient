package com.mengmiao.model;

import java.awt.MenuShortcut;

public class MenuItemModel extends MenuModel {

	private MenuShortcut shortcut;
	
	private boolean enable = true;

	public MenuShortcut getShortcut() {
		return shortcut;
	}

	public void setShortcut(MenuShortcut shortcut) {
		this.shortcut = shortcut;
	}

	public boolean isEnable() {
		return enable;
	}

	public void setEnable(boolean enable) {
		this.enable = enable;
	}
	
	
	
}
