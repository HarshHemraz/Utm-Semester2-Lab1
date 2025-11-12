/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package OSC;

/**
 *
 * @author SPACE4
 */
public class MultiThreadRunner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        LoopRunner1 runner1 = new LoopRunner1();
        LoopRunner2 runner2 = new LoopRunner2();
        
        long startTime = System.currentTimeMillis();
        runner2.start();
        runner1.start();
        
        
        try {
            runner1.join();
            runner2.join();
        
        } catch (InterruptedException e) {
            e.printStackTrace();
            
        }
        long endTime = System.currentTimeMillis();
        
        long totalTime = endTime - startTime;
        System.out.println("\nTotal exceution time: " + totalTime + " milliseconds");
      

    }
    
}
