package com.mengmiao.model.connect;

public class SSLConnect extends Connect {

	private boolean useSSLProtocol;

	private String publicKey;

	private String privateKey;

	public SSLConnect(String connectName, String publicKey, String privateKey) {
		this(connectName, publicKey, privateKey, false);
	}

	public SSLConnect(String connectName, String publicKey, String privateKey, boolean useSSLProtocol) {
		super(connectName);
		this.publicKey = publicKey;
		this.privateKey = privateKey;
		this.useSSLProtocol = useSSLProtocol;
	}

	public boolean isUseSSLProtocol() {
		return useSSLProtocol;
	}

	public void setUseSSLProtocol(boolean useSSLProtocol) {
		this.useSSLProtocol = useSSLProtocol;
	}

	public String getPublicKey() {
		return publicKey;
	}

	public void setPublicKey(String publicKey) {
		this.publicKey = publicKey;
	}

	public String getPrivateKey() {
		return privateKey;
	}

	public void setPrivateKey(String privateKey) {
		this.privateKey = privateKey;
	}

}
