package com.aurionpro.test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.aurionpro.model.Account;

public class AccountList {
	public static void main(String[] args) {
		List<Account> accountList = Arrays.asList((new Account(124,"Kaivalya", 40)), new Account(345,"Sarvesh", 3409), new Account(45,"Ashish", 234));
		
		System.out.println("For minimum balance: ");
//		
//		List<Account> accountListSorted = accountList.stream()
//													.sorted((account1,account2)->(int)(account1.getBalance()-account2.getBalance()))
//													.limit(1)
//													.collect(Collectors.toList());
//		accountListSorted.stream()
//						.forEach((account)->System.out.println(account));
//		
//		List<Account> accountListReverseSorted = accountList.stream()
//													.sorted(Collections.reverseOrder())
//													.limit(1)
//													
//													.collect(Collectors.toList());
//		
//		accountListReverseSorted.stream()
//								.forEach((account)->System.out.println(account));
//		
//		List<Account> NameContainsMoreThanSixCharacters = accountList.stream()
//				 													.filter((account)->account.getName().length()>=6)
//				 													.collect(Collectors.toList());
//
//		NameContainsMoreThanSixCharacters.stream()
//											.forEach((student)->System.out.println(student));
//		
//		
		Optional<Account>minimumBalanceAccount = accountList.stream()
					.min((Account account1, Account account2)->(int)(account1.getBalance()-account2.getBalance()));
		if(minimumBalanceAccount.isPresent())
			System.out.println("The account with minimum balance is : " + minimumBalanceAccount);
		
		
		Optional<Account>maximumBalanceAccount = accountList.stream()
															.max((account1, account2)->(int)(account1.getBalance()-account2.getBalance()));
		
		if(maximumBalanceAccount.isPresent())
			System.out.println("The account with the maximum balance is : " + maximumBalanceAccount);
		
		List<Account> namesGreaterThanSixCharacters = accountList.stream().filter((account)->account.getName().length()>6).collect(Collectors.toList());											
				
		namesGreaterThanSixCharacters.stream().forEach((account)->System.out.println(account));
		
		double totalBalance = accountList.stream().mapToDouble((account)->account.getBalance()).reduce(0,(balance1,balance2)->balance1+balance2);
		System.out.println(totalBalance);
		
		int a1=5;
		double a2=(float)a1;
		
				
	}
}
