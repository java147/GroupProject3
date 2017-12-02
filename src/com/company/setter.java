package com.company;

import java.util.Random;
import java.util.Scanner;

public class setter
{
    public static void thesetter() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String firstname = input.next();
        System.out.println("Enter your last name: ");
        String lastname = input.next();
        System.out.println("Enter your gender: ");
        String gender = input.next();
        gender = gender.toLowerCase();
        if (!gender.equals("male") && !gender.equals("female")) {
            do {
                System.out.println("Invalid, enter either male or female: ");
                gender = input.next();
            } while(!gender.equals("male") && !gender.equals("female"));
        }

        byte count = 1;
        new employee (firstname, lastname, gender, count);
        String[] position = new String []{"Store Manager", "Branch Manager", "Executive VP", "Register"};
        int index = (new Random()).nextInt(position.length);
        System.out.println(position[index]);
        String job = position[index];
        int salary;
        switch (job) {
            case "Executive VP":
                System.out.println("You are the Executive VP");
                ExecutiveVP E = new ExecutiveVP(firstname, lastname, gender, count);
                salary = E.returnSalary();


                break;
            case "Register":
                System.out.println("You are the Executive VP with a salary of $950,000");
        }
    }
}
