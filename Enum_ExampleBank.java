package com.awsravi.enume;
//Define an enum for different types of bank accounts
enum AccountType {
 SAVINGS,
 CHECKING,
 LOAN
}

//A class representing a bank account
class BankAccount {
 private String accountNumber;
 private double balance;
 private AccountType accountType;

 public BankAccount(String accountNumber, double balance, AccountType accountType) {
     this.accountNumber = accountNumber;
     this.balance = balance;
     this.accountType = accountType;
 }

 public String getAccountNumber() {
     return accountNumber;
 }

 public double getBalance() {
     return balance;
 }

 public AccountType getAccountType() {
     return accountType;
 }

 public void deposit(double amount) {
     balance += amount;
     System.out.println("Deposited $" + amount + " into " + accountType + " account. New balance: $" + balance);
 }

 public void withdraw(double amount) {
     if (balance >= amount) {
         balance -= amount;
         System.out.println("Withdrawn $" + amount + " from " + accountType + " account. New balance: $" + balance);
     } else {
         System.out.println("Insufficient funds in " + accountType + " account.");
     }
 }
}

public class Enum_ExampleBank {
 public static void main(String[] args) {
     // Create bank accounts with different types
     BankAccount savingsAccount = new BankAccount("SAV123", 1000.0, AccountType.SAVINGS);
     BankAccount checkingAccount = new BankAccount("CHK456", 2000.0, AccountType.CHECKING);
     BankAccount loanAccount = new BankAccount("LN789", 5000.0, AccountType.LOAN);

     // Perform transactions
     savingsAccount.deposit(500.0);
     checkingAccount.withdraw(1000.0);
     loanAccount.withdraw(2000.0);

     // Print account information
     System.out.println("Savings Account: " + savingsAccount.getAccountNumber() + ", Balance: $" + savingsAccount.getBalance());
     System.out.println("Checking Account: " + checkingAccount.getAccountNumber() + ", Balance: $" + checkingAccount.getBalance());
     System.out.println("Loan Account: " + loanAccount.getAccountNumber() + ", Balance: $" + loanAccount.getBalance());
 }
}
