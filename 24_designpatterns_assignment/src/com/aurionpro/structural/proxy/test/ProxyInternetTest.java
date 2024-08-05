package com.aurionpro.structural.proxy.test;

import com.aurionpro.structural.proxy.model.Internet;
import com.aurionpro.structural.proxy.model.ProxyServer;

public class ProxyInternetTest {
	public static void main(String[] args) {
		 Internet internet = new ProxyServer();
	        internet.connectTo("google.com");
	        internet.connectTo("youtube.com");
	}
}
