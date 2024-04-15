/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prog.assignment.part.pkg1.st10456550;
import java.util.Scanner;



/**
 *
 * @author Talhah
 */
public class PROGAssignmentPart1St10456550 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
boolean success = false;
           Scanner scanner = new Scanner(System.in);
           LoginManager loginManager = new LoginManager();
while(success == false){ // start of while loop- will keep running until user enters correctly formatted username and password
        // Take input for username
        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        // Take input for password
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        // Take input for first name
        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();

        // Take input for last name
        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();

       

        
        
        
        String status = loginManager.registerUser(username, password, firstName, lastName);
        System.out.println(status);
        if(loginManager.checkPasswordComplexity(password) == true && loginManager.checkUserName(username) == true){
            success = true;
        }
         
                
}//end of while loop
       //login code
          
       Scanner login = new Scanner(System.in);
        System.out.println("Log In Details");
        boolean equalTo = false;
        while (equalTo == false){
        
       
        System.out.println("Enter Username:");
        String Username = login.nextLine();
         
        System.out.println("Enter Password");
        String Password = login.nextLine();
        
        equalTo = loginManager.loginUser(Username, Password);
        System.out.println(loginManager.returnLoginStatus(equalTo));

        }  
        scanner.close();
        login.close();
                
       
       

       
  
    }
      
    
    }
    
