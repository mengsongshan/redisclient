package com.mengmiao.core;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.Panel;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.ScrollPane;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;

import org.springframework.util.CollectionUtils;

public class Dashboard extends Frame {

	private static final long serialVersionUID = 1L;

	private List<Menu> menus;

	private ScrollPane dashWest = new ScrollPane();

	private Panel dashNorth = new Panel();

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
		init();
	}

	public Dashboard(String dashboardName, List<Menu> menus) {
		this(dashboardName);
		setMenus(menus);
	}

	private void init() {
		initWest();
		initNorth();
		addWindowListener(new WinListener(this));
		setMenuBar(new MenuBar());
		add(dashWest, BorderLayout.WEST);
		add(dashNorth, BorderLayout.NORTH);
	}

	private void initWest() {
		java.awt.List root = new java.awt.List();

		root.add("DB1");
		root.add("DB2");
		dashWest.add(root);
	}

	private void initNorth() {

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
