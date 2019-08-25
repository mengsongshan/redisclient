package com.mengmiao.core;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;

import org.springframework.util.CollectionUtils;

public abstract class Dashboard extends Frame {

	private static final long serialVersionUID = 1L;

	private List<Menu> menus;

	public void setMenus(List<Menu> menus) {
		if (CollectionUtils.isEmpty(menus)) {
			return;
		}
		this.menus = menus;
		for (Menu menu : this.menus) {
			getMenuBar().add(menu);
		}
	}

	public Dashboard(String dashboardName) {
		super(dashboardName);
		setVisible(true);
		setBounds(getLocalHostRectangle());
		addWindowListener(new WinListener(this));
		setMenuBar(new MenuBar());
	}

	public Dashboard(String dashboardName, List<Menu> menus) {
		this(dashboardName);
		setMenus(menus);
	}

	private Rectangle getLocalHostRectangle() {

		Toolkit toolkit = getToolkit();
		Dimension dimension = toolkit.getScreenSize();
		Point point = new Point(0, 0);
		return new Rectangle(point, dimension);
	}

	private class WinListener extends WindowAdapter {

		private Frame frame;

		public WinListener(Frame frame) {
			this.frame = frame;
		}

		@Override
		public void windowClosing(WindowEvent e) {
			super.windowClosing(e);
			frame.dispose();
			// System.exit(0);
		}

		@Override
		public void windowActivated(WindowEvent e) {
			// TODO Auto-generated method stub
			super.windowActivated(e);
			frame.setVisible(true);
		}

	}
}
