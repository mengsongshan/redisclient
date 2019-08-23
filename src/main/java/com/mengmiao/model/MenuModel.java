package com.mengmiao.model;

import java.awt.MenuItem;
import java.awt.event.ActionListener;
import java.util.List;

public class MenuModel extends Model {

	private boolean tearOff;

	private List<MenuItem> menuItems;

	private ActionListener listener;

	public boolean isTearOff() {
		return tearOff;
	}

	public void setTearOff(boolean tearOff) {
		this.tearOff = tearOff;
	}

	public List<MenuItem> getMenuItems() {
		return menuItems;
	}

	public void setMenuItems(List<MenuItem> menuItems) {
		this.menuItems = menuItems;
	}

	public ActionListener getListener() {
		return listener;
	}

	public void setListener(ActionListener listener) {
		this.listener = listener;
	}

}
