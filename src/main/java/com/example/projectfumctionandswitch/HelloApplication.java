package com.example.projectfumctionandswitch;
import java.util.Scanner;
public class HelloApplication  {
//hola 1
    public static void print(String data){
        System.out.println(data);
    }
    public static int sumTwoNumbers(int num1, int num2){

        return  num1+num2 ;
    }
    public static void main(String[] args) {
        int num1=0, num2=0;
        String option="";
        System.out.println("Enter an option : A,B,C");
        Scanner keyboard= new Scanner(System.in);
        option= keyboard.nextLine();
        switch (option.toLowerCase()){
            case "a":
                System.out.println("Enter integer1");
                num1=keyboard.nextInt();
                System.out.println("Enter integer2");
                num2=keyboard.nextInt();
                int sumResult=sumTwoNumbers(num1,num2);
                print("The result of the sum is"+sumResult );
                break;
            case "b":
                Scanner scanner= new Scanner(System.in);
                System.out.println("Enter String1");
                String number1=scanner.nextLine();
                print("The result of the sum is"+number1);
                break;
            case "c":
        }
    }
}