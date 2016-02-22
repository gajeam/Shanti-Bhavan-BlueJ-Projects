/**
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.io.*;

public class GrocerMe
{
    // instance variables - replace the example below with your own
    String groceryList[];
    BufferedReader br;
    
    public GrocerMe()
    {
        /**
         * Initialize the grocery list here
         */
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    public static void main()
    {
        System.out.println("Welcome to GrocerMe!\n");
        GrocerMe g = new GrocerMe();
        g.mainMenu();
    }
    
    private void mainMenu()
    {
        System.out.println("Please input a command:");
        System.out.println("p: Present list");
        System.out.println("a: Add an item");
        System.out.println("r: Remove an item");
        System.out.println("s: Sort the list");
        System.out.println("q: Quit GrocerMe"); // This  has been implemented for you ;)
    
        String input;
        try {
            input = br.readLine();
            if (input.equals("p")) {
                presentList();
            }
            else if (input.equals("a")) {
                addItem();
            }
            else if (input.equals("r")) {
                removeItem();
            }
            else if (input.equals("s")) {
                sortList();
            }
            else if (input.equals("q")) {
                System.out.println("Thank you for using GrocerMe!");
                return;
            }
            else {
                System.out.println("Invalid input: " + input);
            }
        }
        catch (Exception e) {        
            System.out.println("Invalid input");
        }
        
        mainMenu();
    }

    private void presentList()
    {
        /**
         * Write your list presentation code here!
         * 
         * When you write the list, it should be presented in exactly the following way:
         * 
         * 1) Figs
         * 2) Saffron
         * 3) Oranges
         * 
         * Make sure to handle the case where the list is empty and print a message
         * like "Your grocery list is empty"
         */
    }
    
    private void addItem()
    {
        /**
         * Write your add item code here!
         * 
         * After the item has been added, you should print out "Added X to your list". 
         * You don't need to check to see if the item has already been added--duplicates
         * are allowed. However, make sure your item is added to the end of the list.
         */
    }
    
    private void removeItem()
    {
        
        /**
         *  Write your remove item code here!
         *  
         *  Have the user input the number associated with an item in the list they
         *  want to delete, not the name of the item itself.
         *  
         *  You'll want to present the list to the user (you can just reuse the
         *  presentList() function!) and print out a message like, "Please input
         *  an item to remove: " to prompt the user for a number
         *  
         *  It should check for the following edge cases:
         *  a)  The number is not associated with a valid value in the list (print a
         *      failure message like, "Failed to remove item at index X")  
         *  b)  Your list is empty and there are no items to remove (print a failure
         *      message like "No items to remove!" This message should print before
         *      the user even has the chance to enter input.
         */
    }
    
    private void sortList()
    {
        /**
         * Write your list sorting code here!
         * 
         * I recommend using bubble sort although you can use whatever you like.
         * 
         * You'll need to find a string method that compares strings to see if they are in
         * alphabetical order. Make sure that it works irrelevant of capitalization--"Dosas"
         * should not appear before "apples" in the list.
         * 
         * Afterwards, call your presentList() function to show the user that it has been
         * sorted.
         */
    }
}
   