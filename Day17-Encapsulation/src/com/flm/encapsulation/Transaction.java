package com.flm.encapsulation;

public class Transaction {
	public static void main(String[] args) {
		BankAccount bank=new BankAccount(203878956,"pavan","SBI0123","Guntur","SBI",230000);
		long num=bank.getAccountNum();
		System.out.println(num);
		String name=bank.getUserName();
		System.out.println(name);
		String ifScCode=bank.getIfSCCode();
		System.out.println(ifScCode);
		String branch=bank.getBranch();
		System.out.println(branch);
		String bankName=bank.getBank();
		System.out.println(bankName);
		double amount=bank.getBalance();
		System.out.println(amount);
		bank.setBalance(34000.00);
		amount=bank.getBalance();
		System.out.println(amount);
		bank.setBalance(-1000);
		amount=bank.getBalance();
		System.out.println(amount);
	}
}
