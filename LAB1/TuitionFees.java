/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB1;
import javax.swing.JOptionPane;


/**
 *
 * @author harsh
 */
public class TuitionFees {
    public int fees_id;
    public String payment_date;
    public int amount_paid;
    public int amount_due = 500;
    
    public void setFeesId() {
        String inputId = JOptionPane.showInputDialog("Insert fee id");
        fees_id = Integer.parseInt(inputId);   
    }
    public void setPaymentDate() {
        payment_date = "28/10/25";
    }
    public int getFeesId() {
        return fees_id;
    }
    public String getPaymentDate() {
        return payment_date;
    } 
    public void pay_tuition_fees( int amttoPay) {
        if (amttoPay >= amount_due) {
            JOptionPane.showMessageDialog(null, "You are paying more than required");
        } else {
            amount_due = amount_due - amttoPay;
            JOptionPane.showMessageDialog(null, "Payment successfull, due amount = " + amount_due);
        }
    }
}
