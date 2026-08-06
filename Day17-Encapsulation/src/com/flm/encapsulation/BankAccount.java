package com.flm.encapsulation;

public class BankAccount {
	private long accountNum;
	private String userName;
	private String ifSCCode;
	private String branch;
	private String bank;
	private double balance;
	
	
	public long getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(long accountNum) {
		this.accountNum = accountNum;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getIfSCCode() {
		return ifSCCode;
	}
	public void setIfSCCode(String ifSCCode) {
		this.ifSCCode = ifSCCode;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		if(balance >=0) {
			this.balance = balance;
		}
		else {
			System.out.println("balance should not be negetive...");
		}
	}
	public BankAccount(long accountNum, String userName, String ifSCCode, String branch, String bank, double balance) {
		this.accountNum=accountNum;
		this.userName=userName;
		this.ifSCCode=ifSCCode;
		this.branch=branch;
		this.bank=bank;
		this.balance=balance;
	}
}
