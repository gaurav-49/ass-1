package com.company.models;

public class Account {
    private String accountNumber;
    private String IFSCcode;
    private double balance;

    public Account() {
    }

    public Account(String accountNumber, String IFSCcode, double balance) {
        this.accountNumber = accountNumber;
        this.IFSCcode = IFSCcode;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getIFSCcode() {
        return IFSCcode;
    }

    public void setIFSCcode(String IFSCcode) {
        this.IFSCcode = IFSCcode;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void depositAmount(double amt){
        this.balance += amt;
        System.out.println("Amount deposited");
    }




    public void withdrawAmount(double amt){
        if(this.balance-amt<0)
            throw new RuntimeException("Not enough balance");

        this.balance -= amt;
        System.out.println("Amount withdraw, current balance is: "+this.balance);
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", IFSCcode='" + IFSCcode + '\'' +
                ", balance=" + balance +
                '}';
    }
}
