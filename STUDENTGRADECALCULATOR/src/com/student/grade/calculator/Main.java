
package com.student.grade.calculator;

import java.util.Scanner ;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of Subjects ");
        int subject = scanner.nextInt ();
        double grade [] = new double [subject];
        int sum=0;
        for (int i =0;i<subject;i++){
            System.out.println("Enter the grade of subject " + (i+1));
             grade[i] = scanner.nextDouble();
             while(true ){
            if (grade[i] >100 || grade[i] <0){
                System.out.println("Please enter a valid grade (over 100)");
                grade[i]=scanner.nextDouble ();
            }
            else{
                break;
            }
            
        }
        sum+=grade[i];
    }
        double averagepercentage = (int)(sum/subject);
        System.out.println("--------------------------------------------------------------------");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("The total grade is : " + sum + "/" +(subject*100));
        System.out.println("The average percentage is : " + averagepercentage + "% ");
        
        
        if (averagepercentage >=60  ){
            if (averagepercentage >=90){
                System.out.println("Grade : A ");
            }
            else if (averagepercentage >=80){
                System.out.println("Grade : B ");
            }
            else if (averagepercentage >=70){
                System.out.println("Grade : C ");
            }
            else if (averagepercentage >=60){
                System.out.println("Grade : D ");
            }
            
            
            System.out.println("Result  : Pass " );
        }
        else{
            System.out.println("Grade : F ");
            System.out.println("Result  : Fail");
        }
        scanner.close();
    }
}
