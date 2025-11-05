/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB1;

/**
 *
 * @author harsh
 */
public class Student {
    private int student_id;
    private String student_name;
    private String student_address;
    private int student_number;
    
    public void setStudentId(int id) {
        student_id = id;
    }
    public void setStudentName(String name) {
        student_name = name;
    }
    public void setStudentAddress(String address) {
        student_address = address;
    }
    public void setStudentNumber(int number) {
        student_number = number;
    }
    
    public int getStudentId(){
        return student_id;
    }
    public String getStudentName(){
        return student_name;
    }
    public String getStudentAddress(){
        return student_address;
    }
    public int getStudentNumber(){
        return student_number;
    }
}
