/**
* PROGRAM SPECIFICATIONS
* NARRATIVE DESCRIPTION:  User class that is setup to grab specific parts of this class and bring back and forth with the Tester.java program
*
* @author (David Proia) 
* @version (Assignment 7)
*/
import java.io.File;
import java.io.IOException;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class User
{
    // instance variables
    private String username, password, owner;    

    /**
     * Constructor for objects of class User
     */
    public User(String nUsername, String nPassword, String nOwner)
    {
    	// initialise instance variables 
    	username = nUsername;
    	password = nPassword;
    	owner = nOwner;
    }
    
    public User()
    {
    	// initialise instance variables
    	username = null;
        password = null;
        owner = null;
    }

    /**
     * setUsername - updates username
     * 
     * @param  nUsername   new value of username
     */
    public void setUsername(String nUsername)
    {
        username = nUsername;
    }
    
    /**
     * setPassword - updates password
     * 
     * @param  nPassword   new value of password
     */
    public void setPassword(String nPassword)
    {
        password = nPassword;
    }
    
    /**
     * setOwner - updates owner
     * 
     * @param  nOwner   new value of owner
     */
    public void setOwner(String nOwner)
    {
        owner = nOwner;
    }
    
    
    /**
     * getUsername - returns username
     * 
     * @return     username 
     */
    public String getUsername()
    {
        return username;
    }
    
    /**
     * getPassword - returns password
     * 
     * @return     password
     */
    public String getPassword()
    {
        return password;
    }
    
    /**
     * getOwner - returns owner
     * 
     * @return     owner
     */
    public String getOwner()
    {
        return owner;
    }

   
    /**
     * toString - returns contents of object
     * 
     * @return    result
     */
    public String toString()
    {
        String result;
        result = "Username = " + username;
        result += ", Password = " + password;
        result += ", MainID = " + owner;
                
        return result;
    }   
}