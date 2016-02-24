-------------------------
CONNECT FOUR PROJECT

Author: Gabriel Nicholas
Date: 22 February, 2016
-------------------------

OVERVIEW

In this assignment,you will build the game Connect Four. For those who don't know,
Connect Four (also known as Four Up or Four in a Row) is a game in which two players
take turns dropping discs down a suspended grid. Each player is trying to get four of
their color disc in a row, either vertically, horizontally, or diagonally.

If you still don't understand the game, check out the Wikipedia article about it
here: https://en.wikipedia.org/wiki/Connect_Four

Take note that this assignment is a college level assignment. It will take a long
time to complete and may be infuriating at times but keep at it. The end result
is rewarding.


REQUIREMENTS

The two players in your game should be X and O. The user should be able to input the
column that they want to input their piece into. If their input is invalid (such
as a number too high or low or a character), the program should print "Invalid input"
and allow that player to go again. If the whole board is filled up, the game is a
draw.

When the board is drawn, it should look something like this:

| - - - - - - - |
| - - - - - - - |
| - - - - - - - |
| - - - X - - - |
| - - - X O - - |
| O - X O O X - |
-----------------
  1 2 3 4 5 6 7  
Your move, X: 


GETTING STARTED

The very first thing you should do is copy this folder and change the name of it
to the following:

YourName_GradeNumber_ConnectFour

For example, were I a very smart fifth grader I would change the name to this:

Gabe_5_ConnectFour

To test your program, you can compile the whole project (Ctrl-K) right click on the
ConnectFour class, and call the main() function.


HINT & TIPS

This is a tough assignment, so I'm going to give you some pointers to get started.

* You're going to need a 2D array of characters to keep track whether a square has
  X, O, or is empty.
* See how I gave you two variables called rows and columns? Use those instead of saying
  6 and 7. It'll make your code much easier to read later on.
* Don't copy and paste code. If you find yourself copy and pasting code, put it into a
  function. I know what you're thinking--"but I need some code for X and some code for O!"
  Changing turns and checking whose turn it is should take very little code.
* In general, make your variable names descriptive. You're going to definitely 

LOOKING FOR MORE?

There are two features you can add that can improve your game. First, you can add
the ability for the player to enter "q" at any time and quit the game. This will
actually be useful for you to implement so you don't have to reset the virtual
machine every time.

The other feature you can add is the asking the player whether or not they want
to play again after a tie or win.

Of course, you can also move onto the next assignment where you'll be adding some
cool features to your Connect Four code.

If you have any questions about this assignment, feel free to email me at
gabe.nicholas@gmail.com
