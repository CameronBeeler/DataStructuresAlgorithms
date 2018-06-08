package com.cambeeler;

import java.util.LinkedList;
import java.util.List;

import java.util.Scanner;


public class Main {
    static public Scanner scan = new Scanner(System.in);
    static public int printCount = 0;
//    static public int iterateCount = 0;

    public static void main(String[] args) {
        EmployeeLinkedList ell = new EmployeeLinkedList();
//        int[] intArray = {20, 35, -15, 7, 55, -1, 22, 1, 18, 99, 4, 99, 27, -8, 45, 17, 29, 93, -88, -17};
//        printArray(intArray);
        String first, last;
        Integer id=0;
        while(true){
            System.out.println("Please enter first name");
            first = scan.nextLine();
            if((first.equalsIgnoreCase("q")))break;

            System.out.println("Please enter last name");
            last = scan.nextLine();
            if((last.equalsIgnoreCase("q")))break;

            System.out.println("Please enter ID");
            id = Integer.parseInt(scan.nextLine());
            if((id == -1))break;

            System.out.println("First: " + first  + "\nLast: " + last + "\nID:  " + id);
            ell.addToFront(new Employee(first, last, id));
        }
            ell.addToFront(new Employee("Sean", "Slocum", 123987));
        ell.addToFront(new Employee("Tim", "Hale", 1111111));
        ell.addToFront(new Employee("Eric", "Letson", 8675309));
        ell.addToFront(new Employee("Bryce", "Bolton", 4443322));


        printLinkedList(ell);

        System.out.println("Pleasure doing business with you");
    }


    public static void printLinkedList(EmployeeLinkedList ELL){
        EmployeeNode en=ELL.getHead();
        int nodeNbr = 0;

        while(en != null){
            nodeNbr += 1;
            System.out.println(
                      "Node #    " + nodeNbr +
                    "\nFirstName " + en.getEmployee().getFirstname() +
                    "\nLastName  " + en.getEmployee().getLastname() +
                    "\nID        " + en.getEmployee().getId() + "\n");
            en = en.getNextNode();
        }
        System.out.println(") - print count#" + ELL.getSize());

    }

    public static void printArray(int[] array) {
        System.out.print("Array Element (");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.print(array[i]);
            } else {
            System.out.print(array[i] + ", ");

            }
        }
        System.out.println(") - print count#" + printCount++);
    }

    public static void printArray(int[] array, int start, int end) {
        System.out.print("Array Element (");
        for (int i = start; i < end; i++) {
            if (i == end - 1) {
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + ", ");

            }
        }
    System.out.println(") - print count#" + printCount++);

    }

}