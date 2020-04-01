
/**
 * Tests the user class along with any specific file to make sure a combination of user/password are correctly input and will tell whats in the file.
 * 
 * @author (David Proia) 
 * @version (Assignment 7)
 */
import java.io.File;
import java.io.IOException;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;
public class Tester
{   
    //main method    
    public static void main(String[] args)
    {   
        //variables used in main method
        String answer;
        ArrayList<User> userArray;        
        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        Scanner scan3 = new Scanner(System.in);
        
        //statement to run first then continue depending on if user wishes to continue
        do
            {
            //boolean method to always be incorrect unless user enters correct combination
            boolean message = false;
            userArray = new ArrayList(fillArrayList());
            printArrayList(userArray);
            System.out.print("What is your username: ");
            String username = scan2.next();
            System.out.print("What is your password: ");
            String password = scan3.next();
            
            //user array list that checks password and username
            for (User user : userArray)
            {
                String username2 = user.getUsername();
                String password2 = user.getPassword();
   
                if(username.equalsIgnoreCase(username2) && password.equals(password2))
                {
                    message = true;
                    System.out.println("Welcome, " + user.getOwner() + ", you are logged in..");
                }                
            }
            if (message == false)
            {
                System.out.println("You have entered something wrong!!");
            }
           
            
            //statement that allows program to constantly run unless user types in no to quit
            System.out.print("Would you like to run this program again? Please type yes | no: ");
            answer = scan.next();
        }while(answer.equalsIgnoreCase("yes"));
            
    }
    
    //new method to find and fill an arraylist
    private static ArrayList<User> fillArrayList()
    {
        {   
            //arraylist varaibles for this method
            Scanner scan1 = new Scanner(System.in);
            String choice;
            ArrayList<User> userArray = new ArrayList<User>();
            try
            {   
                //command to enter name of file
                System.out.print("Enter the name of your file: ");
                choice = scan1.next();
                String fileName = choice; 
                File dataFile = new File(fileName);
                Scanner scan = new Scanner(dataFile);

                String line;
                
                //cycles through username/password combination
                while (scan.hasNextLine())
                {
                    line = scan.nextLine();                
                    userArray.add(parseLine(line));
                }
            }
            //tells me if file wasn't opened correctly
            catch (IOException exception)
            {
                JOptionPane.showMessageDialog(null, "file not opened");
            }
            return userArray;
        }
    }
    
    //method for determining and saving the correct username/password/owner id to the list
    private static User parseLine(String line) 
    {
        Scanner lineScanner;
        User usr = new User();
      
        lineScanner = new Scanner(line);
        lineScanner.useDelimiter(",");
      
        usr.setUsername(lineScanner.next().trim());
        usr.setPassword(lineScanner.next().trim());
        usr.setOwner(lineScanner.next().trim());
                        
        return usr;
    }
    
    //print method for sending out the array
    private static void printArrayList(ArrayList userArray)
    {
        int i = 0;
        while (i<userArray.size())
        {
            System.out.println(userArray.get(i));
            i++;
        }
    }
}