package com.workshop;
import java.util.Scanner;

//Write a Java program to create an abstract class BankAccount with
//  abstract methods deposit() and withdraw(). Create subclasses: SavingsAccount and CurrentAccount that extend the BankAccount
//class and implement the respective methods to handle deposits and withdrawals for each account type.
abstract public class BankAccount {

    public abstract void deposit(int dep);
    public abstract  void withdraw(int with);

}

class SavingAccount extends BankAccount{


    private int accountNo;
    private int balance;

    public SavingAccount(int accountNo, int balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public void deposit(int dep) {
        balance=balance+dep;
    }

    @Override
    public void withdraw(int with) {
        balance=balance-with;
    }

    public void displayInfo(){
        System.out.println("Account No : "+this.getAccountNo()+" Balance: "+this.getBalance());
    }
}


class CurrentAccount extends BankAccount{

    int accountNo;
    int balance;

    public CurrentAccount(int accountNo, int balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }


    @Override
    public void deposit(int dep) {
        balance=balance+dep;
        System.out.println("Balance is ");
    }

    @Override
    public void withdraw(int with) {
        balance=balance-with;

    }
    public void display(){
        System.out.println("Account No : "+this.getAccountNo()+" Balance: "+this.getBalance());
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dep=sc.nextInt();
        int with = sc.nextInt();
        SavingAccount  s = new SavingAccount(1254,3000);
        s.displayInfo();
        System.out.println("Enter the amount you want to deposit ");
        s.deposit(dep);
        s.displayInfo();
        CurrentAccount c = new CurrentAccount(5487,5000);
        c.display();
        c.withdraw(with);
        System.out.println("Enter the amount you want to withdraw ");
        c.display();
    }
}

