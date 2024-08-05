package com.aurionpro.test;

import com.aurionpro.model.GoldenHat;
import com.aurionpro.model.IHat;
import com.aurionpro.model.PremiumHat;
import com.aurionpro.model.RibonHat;
import com.aurionpro.model.StandardHat;

public class HatTest {
	public static void main(String[] args) {
		IHat standardHat = new StandardHat();
		System.out.println(standardHat.getName());
		standardHat = new GoldenHat(standardHat);
		System.out.println(standardHat.getName());
		IHat premiumHat = new PremiumHat();
		System.out.println(premiumHat.getName());
		premiumHat = new RibonHat(premiumHat);
		System.out.println(premiumHat.getPrice());
}
}
