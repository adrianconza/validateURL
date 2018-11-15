package com.adrianconza.validateURL;

import java.net.MalformedURLException;
import java.net.URL;

public class URLWrapper {

	private String message;
	private String scheme;
	private String protocol;
	private String authority;
	private String host;
	private String hostName;
	private int port;
	private String subdomain;
	private String domain;
	private String tld;
	private String resource;
	private String directory;
	private String path;
	private String fileName;
	private String fileSuffix;

	public URLWrapper(String url) {
		try {
			URL myURL = new URL(url);
			this.scheme = myURL.getProtocol();
			this.protocol = myURL.getProtocol();
			this.authority = myURL.getAuthority();
			this.host = myURL.getAuthority();
			this.hostName = myURL.getHost().split(":")[0];
			this.port = myURL.getPort() == -1 ? 0 : myURL.getPort();
			this.subdomain = this.hostName.substring(0, this.hostName.indexOf("."));
			this.domain = this.hostName.substring(this.hostName.indexOf(".") + 1);
			this.tld = this.hostName.substring(this.hostName.lastIndexOf(".") + 1);
			this.resource = myURL.getPath();
			this.directory = this.resource.substring(0, this.resource.lastIndexOf("/"));
			this.path = myURL.getPath();
			this.fileName = this.resource.lastIndexOf("/") == -1 ? ""
					: this.resource.substring(this.resource.lastIndexOf("/") + 1);
			this.fileSuffix = this.resource.indexOf(".") == -1 ? ""
					: this.resource.substring(this.resource.indexOf(".") + 1);
			this.message = "";
		} catch (MalformedURLException e) {
			this.message = "La URL no es correcta";
		}
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getScheme() {
		return scheme;
	}

	public void setScheme(String scheme) {
		this.scheme = scheme;
	}

	public String getProtocol() {
		return protocol;
	}

	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
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

	public String getSubdomain() {
		return subdomain;
	}

	public void setSubdomain(String subdomain) {
		this.subdomain = subdomain;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getTld() {
		return tld;
	}

	public void setTld(String tld) {
		this.tld = tld;
	}

	public String getResource() {
		return resource;
	}

	public void setResource(String resource) {
		this.resource = resource;
	}

	public String getDirectory() {
		return directory;
	}

	public void setDirectory(String directory) {
		this.directory = directory;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileSuffix() {
		return fileSuffix;
	}

	public void setFileSuffix(String fileSuffix) {
		this.fileSuffix = fileSuffix;
	}

}
