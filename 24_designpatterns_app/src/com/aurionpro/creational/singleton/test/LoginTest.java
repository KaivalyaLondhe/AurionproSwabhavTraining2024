package com.aurionpro.creational.singleton.test;

import com.aurionpro.creational.singleton.model.Login;

public class LoginTest {
	public static void main(String[] args) {
		Login login1 = Login.getLogin();
		login1.status();
		Login login2 =Login.getLogin();
		login2.status();
		Login login3 =Login.getLogin();
		login3.status();
	}
}