/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2;

/**
 *
 * @author SPACE4
 */
public class BankAccount {
    
    private String accountName;
    private int accountNumber;

    public BankAccount() {
        System.out.println("Bank Account Constructor");
    }
    public BankAccount(String customerName) {
        accountName = customerName;
        System.out.println("Overloaded constructor 1 parameter");
        
    }
    public BankAccount (String dodo, int toto) {
        accountName = dodo;
        accountNumber = toto;
        System.out.println("Overloaded constructor 2 parameter");
    }
    public void setAccountName(String s1) {
        accountName = s1;
    }
    public void setAccountNumber(int s2) {
        accountNumber = s2;
    }

    public String getAccountName() {
        return accountName;
    }
    public int getAccountNumber() {
        return  accountNumber;
    }
}
    

