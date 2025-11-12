/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2;


/**
 *
 * @author SPACE4
 */


public class Animal {
    private String animalName;
    private String animalType;
    //define the default constructor 
    public Animal() {
        //default message for a constructor
        System.out.println("A new animal has been created");
    }
public void setAnimalName(String name) {
    animalName = name;
}
public void setAnimalType(String type) {
    animalType = type;
}

public String getAnimalName() {
    return animalName;
}
public String getAnimalType() {
    return animalType;
}
    
}
