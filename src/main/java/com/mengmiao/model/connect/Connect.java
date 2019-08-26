package com.mengmiao.model.connect;

public class Connect {

	private String connectName;

	private String hostName;

	private int port;

	private String user;

	private String password;

	private int dbIndex;

	private String keysPattern;

	private String namespaceSeparator;

	private int connectTimeout;

	private int executeTimeout;

	public Connect(String connectName) {
		this.connectName = connectName;
	}

	public Connect(String connectName, String hostName, int port) {
		this(connectName, hostName, port, null, 60, 60, -1, null, null);
	}

	public Connect(String connectName, String hostName, int port, String password) {
		this(connectName, hostName, port, password, 60, 60, -1, null, null);
	}

	public Connect(String connectName, String hostName, int port, String password, int connectTimeout,
			int executeTimeout, int dbIndex, String keyPattern, String namespaceSeparator) {
		this.connectName = connectName;
		this.hostName = hostName;
		this.port = port;
		this.password = password;
		this.connectTimeout = connectTimeout;
		this.executeTimeout = executeTimeout;
		this.dbIndex = dbIndex;
		this.keysPattern = keyPattern;
		this.namespaceSeparator = namespaceSeparator;
	}

	public Connect(String connectName, String hostName, int port, String password, int dbIndex) {
		this(connectName, hostName, port, null, 60, 60, dbIndex, null, null);
	}

	public String getConnectName() {
		return connectName;
	}

	public void setConnectName(String connectName) {
		this.connectName = connectName;
	}

	public String getHostName() {
		return hostName;
	}

	public void setHostName(String hostName) {
		this.hostName = hostName;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getDbIndex() {
		return dbIndex;
	}

	public void setDbIndex(int dbIndex) {
		this.dbIndex = dbIndex;
	}

	public String getKeysPattern() {
		return keysPattern;
	}

	public void setKeysPattern(String keysPattern) {
		this.keysPattern = keysPattern;
	}

	public String getNamespaceSeparator() {
		return namespaceSeparator;
	}

	public void setNamespaceSeparator(String namespaceSeparator) {
		this.namespaceSeparator = namespaceSeparator;
	}

	public int getConnectTimeout() {
		return connectTimeout;
	}

	public void setConnectTimeout(int connectTimeout) {
		this.connectTimeout = connectTimeout;
	}

	public int getExecuteTimeout() {
		return executeTimeout;
	}

	public void setExecuteTimeout(int executeTimeout) {
		this.executeTimeout = executeTimeout;
	}

}
