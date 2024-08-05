package com.aurionpro.creational.abstractfactory.model;

public interface IAccountFactory {
	IAccount makeAccount(long accountNumber, String name, double balance, double x);
}
