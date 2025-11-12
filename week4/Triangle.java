/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4;

/**
 *
 * @author SPACE4
 */
public class Triangle extends Shape {
    protected double base;
    protected double height;
    
    public Triangle() {
        System.out.println("Triangle Created successfully");
    }
    public void setBase(double dodo) {
        base = dodo;
    }
    public void setHeight(double toto) {
        height = toto;
    }
    
    public double getBase() {
        return base;
    }
    public double getHeight() {
        return height;
    }
    
}
