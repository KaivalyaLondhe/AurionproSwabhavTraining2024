package com.aurionpro.test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.aurionpro.model.CallableTask;

public class ExecutorServiceDemoForCallable {
	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(10);
		
		Future<Integer> future = service.submit(new CallableTask());
		
		List<CallableTask> tasks = new ArrayList<CallableTask>();
		
		tasks.add(new CallableTask());
		tasks.add(new CallableTask());
		tasks.add(new CallableTask());
		tasks.add(new CallableTask());
		tasks.add(new CallableTask());
		
		
		try {
//			System.out.println(future.get());
//			int number = service.invokeAny(tasks);
//			System.out.println(number);
			List<Future<Integer>> futures = service.invokeAll(tasks);
			for(Future<Integer>newFuture : futures )
				System.out.println(newFuture.get());
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}
}
