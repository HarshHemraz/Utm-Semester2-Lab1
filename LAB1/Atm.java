/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB1;

/**
 *
 * @author harsh
 */
public class Atm {
    public double balance = 0;
 
    public String outputMsg;
    
    public void setDeposit(int amount) {
        balance = balance + amount;
    }
    
    public void setWithdraw(int amount) {
        if (amount > balance) {
            outputMsg = "Not enough balance";
            
        } else {
          balance =  balance - amount;
          outputMsg = "Amount has been withdrawn successfully";
        }
    }
    
    public double getBalance() {
        return balance;
    }
    public String getWithdrawStatus() {
        return outputMsg;
    }
    public double getDeposit(){
        return balance;
    }
}
