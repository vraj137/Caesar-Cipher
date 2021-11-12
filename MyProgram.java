/* 

Name: Vraj Bhavsar
Date: November 11, 2021

Description: 
This program asks the user for a message they would like to 
encode and the amount of shifts they would like to apply to the message. 
After that the program uses the ASCII table as reference to shift the given
message a set amount of times(provided by the user) and prints it in blocks
of five letters, ten blocks per line. (Note: Punctuation Marks, Digits, and Blanks will be ignored)

This file below asks the user for the message they would like to shift,
the amount and then prints it with the shifted letters.

*/

import java.util.Scanner;
public class MyProgram
{
    public static void main(String[] args)
    {
        //Initate the scanner
        Scanner input = new Scanner(System.in);
    
        //Design and displays the creator of code
        System.out.println("**************************************************");
        System.out.println("  // Welcome to Ceasar Cipher By Vraj Bhavsar //");
        System.out.println("**************************************************\n");
        
        //Asks user to enter a message to shift
        System.out.println("Enter a Message to Shift: ");
        String message = input.nextLine();
        
        //Asks user how many shifts they would like to apply
        System.out.println("");
        System.out.println("Amount to Shift: ");
        int shift = input.nextInt(); 
        
        //Displays the text 'Encoded Message is: '
        System.out.println();
        System.out.println("Encoded Message is: ");
        
        //Calls the method to print final message
        CaesarCipher2 messageShift = new CaesarCipher2(message, shift);
        messageShift.encode();
        
        
        // Set and Getter values if needed
        /*
        System.out.println("");
        messageShift.setShift(4);
        messageShift.setMes("message");
        messageShift.encode();
        */
        
    }
}