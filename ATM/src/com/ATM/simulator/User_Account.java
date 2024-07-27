
package com.ATM.simulator;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class User_Account {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        BankAccount user= null;
        while (true ){
            
        
        System.out.println("\n \n Welcome to the ATM");
        System.out.println("-----------------MAIN MENU-----------------");
        System.out.println("1-Register an Account\n2-Deposite\n3-Withdraw\n4-CheckBalance\n5-Quit");
        System.out.println("Choose an option :");
        int option = scanner.nextInt ();
        
        List<BankAccount> Users =new ArrayList<>();
        switch(option){
            case 1:
                System.out.println("--------------Register an Account---------------");
                System.out.println("Enter your fullname : ");
                String name = scanner.next ();
                System.out.println("Enter your phone number : ");
                String phonenum = scanner.next();
                System.out.println("Enter your Email : ");
                String email = scanner.next ();
                System.out.println(" 1-Enter a passcode : \n 2-Generate a random passcode  ");
                System.out.println("Choose an option : ");
                int option2=scanner.nextInt();
                String passcode2 = randompasswod(4);
                System.out.println("Enter balance you want to add");
                double balance = scanner.nextDouble ();
                
                switch(option2){
                    case 1: 
                        System.out.println("Enter a passcode of 4 digits ");
                        String passcode = scanner.next();
                        System.out.println("Your password is : " + passcode);
                        user = new BankAccount (name,phonenum,email, passcode,balance);
                        System.out.println("Account created succesfully");
                        Users.add(user); 
                    case 2: 
                        System.out.println("The random passcode is : "+ passcode2);
                        user = new BankAccount (name,phonenum,email, passcode2,balance);
                        System.out.println("Account created succesfully");
                        Users.add(user); 
                        
                        
                        
                }
                continue ;
            case 2:
                if (user != null) {
                System.out.println("-----------------Deposite------------------");
                System.out.println("Enter the value you want to deposite ");
                double deposite = scanner.nextDouble();
                user.Deposite(deposite);
                break;
                }
                else {
                    System.out.println("No accounts found please create one ");
                    break;
                }
            case 3: 
                if (user != null) {
                System.out.println("-----------------Withdraw------------------");
                System.out.println("Enter the value you want to withdraw ");
                double withdraw = scanner.nextDouble();
                user.withdraw(withdraw);
                break;
                }
                else {
                    System.out.println("No accounts found please create one ");
                    break;
                }
            case 4:
                System.out.println("--------------------------CheckBalance---------------------");
                if (user!=null){
                user.checkbalance();
                break;
                }else {
                    System.out.println("Sorry! No account Found , Create one first ");
                    break;
                }
            case 5:    
                System.out.println("Are you sure you want to exit?");
                System.out.println("Y for yes , N for no");
                String response = scanner.next();
                if (response.charAt(0)=='y' || response.charAt(0)=='Y'){
                    System.out.println("Good bye ! Have a great Day ");
                    break;
                }
                else if (response.charAt(0)=='n' || response.charAt(0)=='N'){
                    continue;
                }
        }
       
    }
   
    }
    public static String randompasswod (int length ){
        String passwordset = "123456789";
        char[ ] password = new char[length]; // this is an array to store the characters of the array 
        for (int i =0 ;i<length;i++){
            int rand = (int )(Math.random() * passwordset.length()) ; // this willgenerate a random number from the lenth of the string 
            password[i]= passwordset.charAt(rand); // here is will the take the character at the index generated randomly and store it in the char array 
            
        }
        return new String (password);
    }
}
