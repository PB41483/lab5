/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labv4;

/**
 *
 * @author pb41483
 */
public class Student {
    private String emailAddress;
    private String firstName;
    private String lastName;
    
    public Student(String firstName, String lastName, String emailAddress) {
    
        this.emailAddress = emailAddress;
        this.firstName  = firstName;
        this.lastName = lastName;
    }
    public String getFirstName(){
        return firstName;
    }
	
    public String getLastName(){
	return lastName;
    }
	
    public String getemailAddress(){
	return emailAddress;
    }
    

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
     public void setemailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    
}
