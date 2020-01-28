package com.company;

import java.util.Scanner;

public class Employee {
    private  int id = 0;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String address;
    private static int year = 2020;
    public void setId(int id) {
        this.id = id;
        System.out.println(" Add Employee id- " + year + this.id);
    }


    public String addEmployee() {

        System.out.println("Enter first Name");
        Scanner sc1 = new Scanner(System.in);
        this.firstName = sc1.next();

        System.out.println("Enter last name");
        Scanner sc2 = new Scanner(System.in);
        this.lastName = sc2.next();

        System.out.println("Enter DOB mm/dd/yyyy");
        Scanner sc3 = new Scanner(System.in);
        this.dateOfBirth = sc3.next();

        System.out.println("Enter Address");
        Scanner sc4 = new Scanner(System.in);
        this.address = sc4.next();
        return this.firstName + this.lastName + this.dateOfBirth + this.address;

    }


    public int update() {

        System.out.println("Insert id you want to update: ");
        Scanner in = new Scanner(System.in);
        id = in.nextInt();
        return id-1;
    }
     public int delete(){
         System.out.println("Enter student id you want to delete: ");
         Scanner in=new Scanner(System.in);
         int id= in.nextInt();
         return id-1;

     }

    public String toString() {
        return " Hi - " + firstName + " " + lastName + " "+ "Your id is: "+ id+
                " Your dob is -" + dateOfBirth +
                " Your address is -" + address;
    }




    }



