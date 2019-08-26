package com.mengmiao.model.connect;

public class SSHConnect extends Connect {

	public SSHConnect(String connectName) {
		super(connectName);
	}

	private boolean useSSHTunnel;

	public boolean isUseSSHTunnel() {
		return useSSHTunnel;
	}

	public void setUseSSHTunnel(boolean useSSHTunnel) {
		this.useSSHTunnel = useSSHTunnel;
	}

}
