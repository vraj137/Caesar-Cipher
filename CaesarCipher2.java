/* 

Name: Vraj Bhavsar
Date: November 11, 2021

Description: 
This program asks the user for a message they would like to 
encode and the amount of shifts they would like to apply to the message. 
After that the program uses the ASCII table as reference to shift the given
message a set amount of times(provided by the user) and prints it in blocks
of five letters, ten blocks per line. (Note: Punctuation Marks, Digits, and Blanks will be ignored)

This file below is the brains of the entire program where it runs the calculations
with reference to the ASCII table and shifts each value accordingly from A-Z.

*/

public class CaesarCipher2 {
    
    //Declaring the instance message
    private String message;
    private int shift; 

    //Gets the values from the users (Constructor)
    public CaesarCipher2(String messageGiven, int shiftAmount){
        this.message = messageGiven;
        this.shift = shiftAmount; 
    }
    
    public void encode(){
        
        // Sets the message to upper case letters
        message = message.toUpperCase();
        
        // Empty string to allow for new encrypted message
        String newMessage = " ";
        
        // For loop to encode the message given
        for(int i = 0; i < message.length(); i++){
            char findChar = message.charAt(i);
            
            // Checks to see if there is a alphabet in the message 
            if (Character.isAlphabetic(findChar)) {
                int shiftedLetter = (int)findChar + ((shift%26) - 65); 
                
                // When shifted x negative amount of times it adds 26 to make it convert back to the range of the ASCII table
                if(shiftedLetter < 0){
                    shiftedLetter = (((shiftedLetter % 26) + 26) + 65);
                }
                // When shift value is a positive value it will run as it is in range of the ASCII table 
                 else {
                    shiftedLetter = ((shiftedLetter % 26) + 65); 
                }
                // Converts the message from int to char
                newMessage += (char) shiftedLetter; 
            }
        }
        // Prints the final encrypted message
        System.out.println(helper(newMessage));
    }
    // Helps creating spacing after 5 letters and 10 blocks in a row
    public String helper(String newMessage){
        
        // Empty string to store the new message
        String helpSpace = "";
        
        // For loop to check the length of the newMessage
        for(int i = 1; i < newMessage.length(); i++){
            helpSpace += newMessage.charAt(i);
            
            // Creates a space in between block after 5 letters
            if (i % 5 == 0){
                helpSpace += " ";
            }
            // Creates a new row when row has 10 blocks of letters
            if (i % 50 == 0) {
                helpSpace += "\n";
            }
    } 
        // Returns the new characters in correct formatting 
        return helpSpace;
    }
    
    // Getter for the shift value
    public int getShift(){
        return this.shift;
    } 
    
    // Getter of the message
    public String getMessage(){
        return this.message;
    }
    // Sets the shift value
    public void setShift(int shiftValue){
        this.shift = shiftValue;
    }
    // Sets the message
    public void setMes(String messageUser){
        this.message = messageUser;
    }
    
    
 
}