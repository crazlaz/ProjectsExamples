package com.companyCode;
import java.util.Scanner;

public class Main {



        public static void main(String[] args) {

                Scanner ask = new Scanner(System.in);
                System.out.println("Enter First Number ");


                int x = ask.nextInt();
                System.out.println("Enter Secound Number");
                int y = ask.nextInt();

                if (x >= y) {
                        System.out.println("first input is larger ");
                }
                else {


                        System.out.println("second input was larger");


                }



        }

}





