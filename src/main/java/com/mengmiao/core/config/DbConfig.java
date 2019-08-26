package com.mengmiao.core.config;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.mengmiao.util.FileUtils;

public class DbConfig {
	private static String APP_CONFIG = "appConfig.db";
	private static List<String> dbs = new ArrayList();

	public static void loadDbs() {
		File appconFile = new File(FileUtils.getAppWorkRoot() + File.pathSeparator + APP_CONFIG);

	}

	public static void saveDbConfig() {

	}
}
