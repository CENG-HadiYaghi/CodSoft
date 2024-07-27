
package com.ATM.simulator;



public class BankAccount {
    
    private String name ;
    private String phonenum ;
    private String email ;
    private String password ;
    private double balance;
    
    

    public BankAccount(String name, String phonenum, String email, String password,double balance) {
        this.name = name;
        this.phonenum = phonenum;
        this.email = email;
        this.password = password;
        this.balance = balance;
        
    }

   

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public  void withdraw (double withdraw ){
        
        if (this.balance >withdraw){
            this.balance-=withdraw ; 
            System.out.println("Withdraw succesfull \nRemaining balance : " + this.balance+"$");
        }
        else {
            System.out.println("Insuffecient balance ! ");
        }
    }
    public void Deposite (double deposite ){
        this.balance += deposite ;
        System.out.println("Deposite successful \n New balance : " + this.balance + "$");
    }
    public void checkbalance(){
        System.out.println(" name : " +name );
        System.out.println(" Phone number : " +phonenum);
        System.out.println(" Email :" + email);
        System.out.println(" Balance :" + this.balance +"$");
    }
    
   
    
    
    
    
}
