package com.company;

import javax.management.StringValueExp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        System.out.println("Please Select the Task you want to Perform:");
        System.out.println("Enter 1 to add employee.");
        System.out.println("Enter 2 to update employee.");
        System.out.println("Enter 3 to delete employee.");
        System.out.println("Enter 4 to view all employees.");
        Scanner in= new Scanner(System.in);
        int a= in.nextInt();
        int id=1;
        ArrayList<Employee> employees= new ArrayList<>();

        switch(a) {
            case 1: {
                do {
                    System.out.println(" Enter Y to add more Employees.Hit (Q to quit)");
                    Scanner scan = new Scanner(System.in);
                    String course = in.nextLine();
                    if (!course.equalsIgnoreCase("Q")) {
                        Employee e = new Employee();
                        e.setId(id++);
                        e.addEmployee();
                        employees.add(e);
                    } else {
                        break;
                    }
                }
                while (1 != 0);
                }
            case 2:
                Employee obj= new Employee();
                int l= obj.update();
                obj.addEmployee();
                employees.set(l,obj);

            case 3:
                Employee obj2=new Employee();
                int m=obj2.delete();
                employees.remove(m);

            case 4:
            {
                for (Employee e :employees)
                {
                    System.out.println(e.toString());
                }
            }
                }

        }
}











	// write your code here

