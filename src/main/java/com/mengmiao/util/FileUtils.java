package com.mengmiao.util;

public class FileUtils {

	public static String getAppWorkRoot() {
		String userDir = System.getProperty("user.dir");
		return userDir;
	}
}
