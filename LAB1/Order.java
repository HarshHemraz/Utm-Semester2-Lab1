/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB1;

/**
 *
 * @author harsh
 */
public class Order {
   
    public int totalPrice; //global
    
    public void setNormalOrderPrice() {
        int cb = 290; int ff = 75; int cp= 210; int sd= 50; int scp = 110;
        int total = cb+ff+cp+sd+scp ;
        totalPrice = total;
  
    }
    public int getOrder() {
      return totalPrice;
                
    }
    
   
}
