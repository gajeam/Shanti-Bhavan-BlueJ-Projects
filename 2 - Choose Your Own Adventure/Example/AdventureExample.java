
/**
 * @author Gabriel Nicholas
 * @version 9 February 2016
 */

import java.lang.*;
import java.util.Scanner;

public class AdventureExample
{

    /**
     * Put the properties that you want here.
     */
    boolean hasMagicBox;

    /**
     * Set the initial values for your properties here
     */
    public AdventureExample()
    {
        hasMagicBox = false;
    }
    
    public static void main()
    {
        AdventureExample a = new AdventureExample();
        a.start();
    }
        
    private void start()
    {
        /**
         *  Call your first function in here ;)
         */
        ninthGradeClassroom();
    }
    
    private void ninthGradeClassroom()
    {
        System.out.println("You are in the 9th grade classroom. The entire ground is covered\nwith poisonous snakes, each one four meters long. You are standing\nat the doorway of the classroom.\n");
        System.out.println("What do you do?\n");
        System.out.println("1) Go to the 11th grade classroom.");
        System.out.println("2) Squish the snakes.");
        
        if (hasMagicBox == true)
        {
            System.out.println("3) Unleash the power of the magic box.");
        }
        int input = getUserInput();

        switch (input) {
            case 1:
                eleventhGradeClassroom();
                break;
            case 2:
                squishSnakes();
                break;
            case 3:
                if (hasMagicBox == true) {
                    unleashMagicBox();
                }
                else {
                    ninthGradeClassroom();
                }
                break;
            default:
                System.out.println("Invalid input :(");
                ninthGradeClassroom();
        }
    }
    
    private void squishSnakes()
    {
        System.out.println("You attempt to squish the snakes, but as soon as you step on one\nof their heads, another grabs your leg. Then another constricts\nyour neck. As your life slowly seeps away, your last thought is,\n\"If only I had spent more time learning about computers!\"\n");
        System.out.println("YOU LOSE");
        
    }
    
    private void eleventhGradeClassroom()
    {
        System.out.println("You are at the doorway of the 11th grade classroom. Much to your dismay,\nthere are just as many snakes in the here as there were in 9th grade.\n");
        if (hasMagicBox == false) {
            System.out.println("On the ground, there is a magic box.\n");
        }
        
        System.out.println("What do you do?\n");
        System.out.println("1) Go to the 9th grade classroom.");
        System.out.println("2) Squish the snakes.");
        if (hasMagicBox == false) {
            System.out.println("3) Pick up the magic box");
        }
        else {
            System.out.println("3) Unleash the power of the magic box.");
        }
        
        int input = getUserInput();
        
        switch (input) {
            case 1:
                ninthGradeClassroom();
                break;
            case 2:
                squishSnakes();
                break;
            case 3:
                if (hasMagicBox == true) {
                    unleashMagicBox();
                }
                else {
                    System.out.println("You pick up the magic box. It is light in your hands.\n");
                    hasMagicBox = true;
                    eleventhGradeClassroom();
                }
                break;
            default:
                System.out.println("Invalid input :(");
                eleventhGradeClassroom();
            }
        System.out.println();
    }
    
    private void unleashMagicBox()
    {
        System.out.println("As you open the magic box, the ground begins to shake. The sky\nturns blood red, rain begins to fall, and the earth opens up,\nsucking the snakes down into the infernal hole from whenst they\ncame.\n");
        System.out.println("YOU WIN");
  
    }
    
    private int getUserInput()
    {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println();
        return input;
    }
    
}
