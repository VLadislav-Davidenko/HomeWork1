package com.company.test;

import java.util.Scanner;

public class Module2 {
    public static void main(String[] args) {
/*        System.out.println("Hello");
        System.out.print("Hello");
        System.out.printf("value = %f, str = %s", 1.3d, "World"); //value = 1,300000

        Scanner scanner = new Scanner(System.in);
        String writtenText = scanner.nextLine();
        System.out.println("Tou input -> " + writtenText);
        System.out.print("Start\n");

        int a = 10;
        int b = 15;

        if(a > b){ //false
            int c = b - a;
            if(c < a) {
                System.out.println("LOL");
            }
        } else {
            System.out.println("b bigger than a");
        }
        System.out.println("End");*/
        System.out.println("Enter your age");
        Scanner scanner = new Scanner(System.in);
        int writtenNum = scanner.nextInt();
        System.out.println("Your age -> " + writtenNum);
        if (writtenNum <= 18) {
            System.out.println("You are a child");
        } else  {
            System.out.println("Quite good");
        }
        System.out.print("Your name: ");
        Scanner scanner1 = new Scanner(System.in);
        String writtenText = scanner1.nextLine();
        if ("Vlad".equals(writtenText)) {
            System.out.println("Hello my dear " + writtenText);
        } else {
            System.out.println("Who are you ?");
        }
        System.out.printf("Thank you %s for code testing\n", writtenText );

        System.out.print("Enter your first number: ");
        Scanner num = new Scanner(System.in);
        int a = num.nextInt();
        System.out.print("Enter your second number: ");
        int b = num.nextInt();
        System.out.println("What do you want to do with them ? (-,+,/,*,<>)");
        Scanner reader = new Scanner(System.in);
        String arg = reader.nextLine();
        int c;
        switch (arg) {
            case "-" -> {
                c = a - b;
                System.out.println(a + " - " + b + " = " + c);
            }
            case "+" -> {
                c = a + b;
                System.out.println(a + " + " + b + " = " + c);
            }
            case "/" -> {
                c = a / b;
                System.out.println(a + " / " + b + " = " + c);
            }
            case "*" -> {
                c = a * b;
                System.out.println(a + " * " + b + " = " + c);
            }
            case "<>" -> {
                if (a > b){
                    System.out.println(a + " > " + b);
                } else if (a < b){
                    System.out.println(a + " < " + b);
                } else{
                    System.out.println(a + " = " + b);
                }

            }
            default -> System.out.println("Error");
        }
    }
}
