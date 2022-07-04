package com.apaar;

import java.util.Scanner;

public class calcprog {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Take the input from user until the user does not presss x or X;
        int ans=0;
        while (true){
            //take the operator as input
            System.out.println("Enter the operator");
            char op = in.next().trim().charAt(0);
            System.out.println();
            if(op =='+' || op == '-' || op =='/' || op == '%'){
                //input the two numbers
                System.out.println("Input the first number");
                int num1 = in.nextInt();
                System.out.println("Input the second number");
                int num2 = in.nextInt();
                System.out.println();
                if (op == '+'){
                    ans=num1+num2;
                }
                if (op == '-'){
                    ans=num1-num2;
                }
                if (op == '*'){
                    ans=num1*num2;
                }
                if (op == '/'){
                    if (num2 !=0)
                    ans=num1/num2;
                }
                if (op == '%'){
                    ans=num1%num2;
                }
                else if (op == 'x' || op == 'X'){
                    break;

                }else {
                    System.out.println("INVALID");
                }

                }
                System.out.println("Your answer is " +ans);
            }
        }


    }


