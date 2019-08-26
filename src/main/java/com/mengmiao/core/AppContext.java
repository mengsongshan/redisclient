package com.mengmiao.core;

import com.mengmiao.core.config.DbConfig;

public class AppContext {

	static {
		DbConfig.loadDbs();
	}

}
