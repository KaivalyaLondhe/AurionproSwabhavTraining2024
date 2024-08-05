package com.aurionpro.model;

import java.util.concurrent.Callable;

public class CallableTask implements Callable<Integer>{

	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		return (int)(Math.random()*Math.pow(10, 1));
	}

}
