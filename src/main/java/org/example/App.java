import java.util.Scanner;
import java.lang.Math;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 julian londono
 */

public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner (System.in);
        int month;

        System.out.println( "Enter the number of the month" );
        month = input.nextInt();

        switch(month) {
            case 1 :
                System.out.println("The name of the month is January");
                break;
            case 2 :
                System.out.println(" The name of the month is February");
                break;
            case 3 :
                System.out.println(" The name of the month is March");
                break;
            case 4 :
                System.out.println(" The name of the month is April");
            case 5:
                System.out.println("The name of the month is May ");
                break;
            case 6:
                System.out.println("The name of the month is June");
                break;
            case 7:
                System.out.println(" The name of the month is July");
                break;
            case 8:
                System.out.println(" The name of the month is August");
                break;
            case 9:
                System.out.println(" The name of the month is September");
                break;
            case 10:
                System.out.println("The name of the month is October");
                break;
            case 11:
                System.out.println("The name of the month is November");
                break;
            case 12:
                System.out.println(" The name of the month is December");
                break;


            }
        }
    }
