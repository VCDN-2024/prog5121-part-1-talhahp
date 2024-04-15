package prog.assignment.part.pkg1.st10456550;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Talhah
 */



public class LoginManager {
    
    private String username;
    private String password ;
    private String firstname;
    private String lastname;
    public LoginManager(){
        
    }

    

    public boolean checkUserName(String username) {
      if (username == null){
          return false;
      } 
      //username format check
       if (username.length () <= 5 && username.matches(".*[_].*")){
          return true;
      } else {
        return   false;
       }
      
      
    }

    public boolean checkPasswordComplexity(String password) {
       if (password == null){
           return false;
           
       }
       //password complexity check 
       if (password.length () >= 8 && password.matches(".*[a-z].*") && password.matches(".*[A-Z].*") && password.matches(".*[!@#$%^&*?].*")&& password.matches(".*[0-9].*")){
          return true;
      } else {
        return   false;
       }
    
    }

    public String registerUser(String username, String password, String firstName, String lastName) {
         boolean isPasswordValid = checkPasswordComplexity(password);
          boolean isUsernameValid = checkUserName(username) ;

if(isPasswordValid == true && isUsernameValid == true) {
this.username = username;
this.password = password;
this.firstname = firstName;
this.lastname = lastName;
return("Successfully captured");

}else if(isPasswordValid == true && isUsernameValid == false ) {//if username format is wrong only

return("Username is not correctly formatted, " + "\nplease ensure that your username contains"

+ "\nan underscore and is no more than"

+ "\n5 characters in length");

}else if(isPasswordValid == false && isUsernameValid == true ) {//if password format is wrong only

return("Password is not correctly formatted, " + "\nplease ensure that the password contains" + "\nat least & characters,"

+ "\na capital letter, \na number and\na special character");

        }else{ 

return("Username AND password not correctly formatted"); 
        
        }
        

    }

    public boolean loginUser(String username, String password) {
        return username.equals(this.username) && password.equals(this.password);
    }

    public String returnLoginStatus(boolean equalTo) {
        if (equalTo) {
            return "Welcome " + firstname + " " + lastname + ", it is great to see you.";
        } else {
            return "Username or password incorrect, please try again.";
        }
    }
}
    

