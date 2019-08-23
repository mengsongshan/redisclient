package com.mengmiao.util;

import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

import org.springframework.util.CollectionUtils;

import com.mengmiao.core.model.MenuItemModel;
import com.mengmiao.core.model.MenuModel;

public class ComponentUtils {
	
	public static MenuBar makeMenuBar() {
		return new MenuBar();
	}

	public static Menu makeMenu(MenuModel model) {
		Menu menu = new Menu(model.getName(), model.isTearOff());
		menu.addActionListener(model.getListener());
		if (!CollectionUtils.isEmpty(model.getMenuItems())) {
			for (MenuItem item : model.getMenuItems()) {
				menu.add(item);
			}
		}
		
		return menu;
	}

	public static MenuItem makeMenuItem(MenuItemModel model) {
		MenuItem item = new MenuItem(model.getName(),model.getShortcut());
		item.setEnabled(model.isEnable());
		item.addActionListener(model.getListener());
		return item;
	}
}
