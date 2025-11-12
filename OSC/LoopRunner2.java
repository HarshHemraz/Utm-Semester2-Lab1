/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OSC;

/**
 *
 * @author SPACE4
 */
public class LoopRunner2 extends Thread { 
       public void run2 () {
            System.out.println("Running second loop (thread2): ");
            for (int i=1;i<=100000;i++) {
            System.out.println("Second iteration: " + i);
        
    }
        }
    
}
