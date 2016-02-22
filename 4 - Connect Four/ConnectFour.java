/**
 * Write a description of class ConnectFour here.
 * 
 * @author Gabriel Nicholas
 * @version 11 February 2016
 */

import java.io.*;

public class ConnectFour
{
    int rows = 6;
    int columns = 7;
   
    public ConnectFour()
    {
        /**
         * Set up the initial values for whatever properties you have (such as your
         * 2D array of characters) here.
         */
    }

    public static void main()
    {
        ConnectFour c = new ConnectFour();
        c.gameLoop();
    }
    
    private void gameLoop()
    {
        /**
         * Write your game code here.
         * 
         * You're going to have to use a lot of different functions in this project.
         * You'll at least need one to draw the board, one to update the matrix, one to
         * get user input, and one to check to see whether or not someone has won. I would
         * also recommend having either a function or a property of the class to check to
         * see whose turn it is.
         * 
         * The biggest hint I can give you is that you should move any code find yourself
         * copy and pasting into a function. This is always true in programming and will
         * help your code writing greatly if you follow it.
         * 
         * Now why is this called a game loop? Well, in it you'll have a loop that gets
         * called over and over again until either the game is won or it's a draw (i.e.
         * the board gets filled up and no one wins.)
         * 
         */
        
    }
}
