/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB3;

/**
 *
 * @author harsh
 */
public class BankAccount {
    private int accountNumber;
    private String accountType;
    private double accountBalance;
    private String customerID;
    
public BankAccount() {
    accountNumber = 0;
    accountType = "";
    accountBalance = 0.0;
    customerID = ""; //default constructor
    System.out.println("Default Constructor");
}

public BankAccount(int acctNum, String acctType, double acctBal, String cusID) {
    System.out.println("Overloaded constructor");
    accountNumber = acctNum;
    accountType = acctType;
    accountBalance = acctBal;
    customerID= cusID;
    
}

public void setAccountNumber(int actNum) {
    accountNumber = actNum;
}
public void setAccountType(String actType) {
    accountType = actType;
}
public void setAccountBalance(double actBalance) {
    accountBalance = actBalance;
}
public void setCustomerID(String ID) {
    customerID = ID;
}
public int getAccountNumber() {
    return accountNumber;
}
public String getAccountType() {
    return accountType;
}
public double getAccountBalance() {
    return accountBalance;
}
public String getCustomerID() {
    return customerID;
}
}
