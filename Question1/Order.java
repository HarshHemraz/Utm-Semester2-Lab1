/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab1;

/**
 *
 * @author SPACE4
 */
public class Order {
    private String orderMeal;
    public Order() {
        System.out.println("Order has been successfully created");
    }
    public void setOrderMeal() {
        orderMeal = "Combo Meal: Chicken Burger + French Fries + Chicken Salad Pasto + Soft Drink + Chicken Spicy Piece";
    }
    
    public String getOrderMeal() {
        return orderMeal;
    }
    
    
}
