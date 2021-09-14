package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Daniel Ragusa
 */

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        System.out.print("What is your name? ");
        String StudentName;
        Scanner input=new Scanner(System.in);
        StudentName=input.next();

        String Out="Hello, "+(StudentName)+", nice to meet you!";

        System.out.println(Out);
    }
}
