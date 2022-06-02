package com.bl.bird_scentury;

import java.util.Scanner;

public class UserInterface {
    int showMainMenu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 1. Add Bird 2. Remove Bird 3. Update Bird 4.Print Bird 5. Exit");
        System.out.println("Enter your name");
        int choice = scan.nextInt();
        return choice;
    }

   /* public Bird createBird() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the bird name you want to add.");
        Bird newBird = new Bird() {
            @Override
            void eat() {

            }

            @Override
            void fly() {

            }

            @Override
            void swim() {

            }
        }

        Bird Bird;
        return Bird;

    }*/
}

