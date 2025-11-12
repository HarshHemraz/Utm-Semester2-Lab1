/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OSC;


/**
 *
 * @author SPACE4
 */
public class Threads {
 public static void main(String[] args) {
     
        LoopRunner runner = new LoopRunner();
        long startTime = System.currentTimeMillis();
        
        runner.firstLoop();
        runner.secondLoop();
        
        long endTime = System.currentTimeMillis();
        
        long totalTime = endTime - startTime;
        System.out.println("\nTotal exceution time: " + totalTime + " milliseconds");
      
}
}
