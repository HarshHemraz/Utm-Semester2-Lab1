/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB1;

/**
 *
 * @author harsh
 */
public class JobApplication {
    public String applicantName;
    public String jobTitle;
    public String output ;
    public boolean isAccepted;
    public String outputAccepted;
    public String reqPayment;
    public int monthsPassed = 0;
    public boolean isBlocked;
    public String blockedMsg;
    
    
 public void setName(String name) {
     applicantName = name;    
     
 }
 
 public void setJobTitle(String title) {
     jobTitle = title;
 }
 
 public void setApplication(String name, String title) { 
     name = applicantName;
     title= jobTitle;
    output =  name +" applied for the job " + title; 
 }
 
 public void acceptApplication() {
     isAccepted = true;
     
     if (isAccepted == true) {
         outputAccepted = "Application is accepted for interview";
     } 
 }
 
 public void setRequestPayment() {
     reqPayment = "Please pay the nominal fee of Rs 150";

 }
 
 public void checkAccountStatus() {
     if (monthsPassed > 3) {
         isBlocked = true;
     }
    if (isBlocked == true) {
         blockedMsg = "Account blocked, please upgrade qualifications";
    } else {
        blockedMsg = "Account is not blocked";
    }
 }
 
 public String getName() {
     return applicantName;
 }
 public String getJobTitle() {
     return jobTitle;
 }
 public String getApplication() {
     return output;
 }
 public String getAcceptApplication() {
     return outputAccepted;
 }
 public String getRequestPaymnet() {
     return reqPayment;
 }
 public String getAccountStatus() {
     return blockedMsg;
 }
}
