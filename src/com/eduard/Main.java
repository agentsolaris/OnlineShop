package com.eduard;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    public static void main(String[] args) {
        /*ArrayList <Product> Products= new ArrayList<Product>();
        ArrayList <User> Users= new ArrayList<User>();
        System.out.println("1.Logare");
        System.out.println("2.Creare cont");
        int sw=0;
        Scanner sc=new Scanner(System.in);
        sw=sc.nextInt();
        while (sw!=1)
        switch (sw)
        {
            case 1:
            {

                break;
            }
            case 2:
            {
                User newUser= new User();
                newUser.create_user();

                break;
            }
            case default:
        {
            System.out.println("Invalid input!");
        }
        }
        */
        User u=new User();
        u.login();
    }

}
