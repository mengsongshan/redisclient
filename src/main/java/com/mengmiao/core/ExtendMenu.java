package com.mengmiao.core;

import java.awt.Menu;
import java.awt.MenuItem;
import java.awt.event.ActionListener;
import java.util.List;

import org.springframework.util.CollectionUtils;

public class ExtendMenu extends Menu {

	private List<MenuItem> items;

	public void setItems(List<MenuItem> items) {
		this.items = items;
		if (CollectionUtils.isEmpty(items)) {
			return;
		}
		for (MenuItem menuItem : this.items) {
			add(menuItem);
		}
	}

	public ExtendMenu(String lable) {
		super(lable);
	}

	public ExtendMenu(String lable, boolean tearOff) {
		super(lable, tearOff);
	}

	@Override
	public synchronized void addActionListener(ActionListener l) {
		// TODO Auto-generated method stub
		super.addActionListener(l);
	}
}
