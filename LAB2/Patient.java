/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB2;

/**
 *
 * @author harsh
 */
public class Patient {
    private String NIC;
    private String name;
    private int age;
    private String gender;
    private String address;
    private int contactNumber;
    private String medicalHistory;
    
    public Patient() {
        System.out.println("Dafault constructor called");
        NIC = "";
        age = 0;
        gender = "Female or Male";
        address = "";
        contactNumber = 0;
        medicalHistory = "";
    }
    
    public void setNIC(String sNIC) {
        NIC = sNIC; 
    }
     public void setName(String sname) {
        name = sname; 
    }
      public void setAge(int sAge) {
        age = sAge; 
    }
       public void setGender(String sGender) {
        if (sGender.equals("M")) {
            gender = "Male";
        } 
        else if (sGender.equals("F")) {
            gender = "Female";
        } else {
            gender = "Please insert M or F";
        }
    }
        public void setAddress(String sAddress) {
        address = sAddress; 
    }
         public void setContactNumber(int sContactNumber) {
        contactNumber = sContactNumber; 
    }
          public void setMedicalHistory(String sMedicalHistory) {
        medicalHistory = sMedicalHistory; 
    }
    public String getNIC() {
        return NIC;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getGender() {
        return gender;
    }
    public String getAddress() {
        return address;
    }
     public int getContactNum() {
        return contactNumber;
    }
    public String getMedicalHistory() {
        return medicalHistory;
    }
   
    
}
