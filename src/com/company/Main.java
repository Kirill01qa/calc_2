package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter num1: ");
        double num1 = reader.nextDouble();

        System.out.println("Enter num2: ");
        double num2 = reader.nextDouble();

        System.out.println("Enter operator (+,-,*,/) ");
        char operator = reader.next().charAt(0);

        double result;
        switch (operator){
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
                result = num1/num2;
                break;
            default:
                System.out.println("Sorry! Operator is incorrect");
                return;
        }
        System.out.println(num1 + "" + operator + "" + num2 + " = " + result + "     Yeah Bitch!!!");

    }
}
