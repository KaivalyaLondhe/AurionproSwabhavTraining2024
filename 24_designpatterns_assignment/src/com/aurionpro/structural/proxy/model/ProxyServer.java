package com.aurionpro.structural.proxy.model;

import java.util.ArrayList;
import java.util.List;

public class ProxyServer implements Internet{
	  private static final List<String> bannedSites;
	    private final Internet internet = new ActualInternet();

	    static {
	        bannedSites = new ArrayList<>();
	        bannedSites.add("youtube.com");
	    }

	    @Override
	    public void connectTo(String host) {
	        if (bannedSites.contains(host)) {
	            System.out.println("Access Denied to " + host);
	            return;
	        }
	        internet.connectTo(host);
}
}
