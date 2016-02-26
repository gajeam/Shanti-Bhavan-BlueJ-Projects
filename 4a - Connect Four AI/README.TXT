-------------------------
CONNECT FOUR AI PROJECT

Author: Gabriel Nicholas
Date: 26 February, 2016
-------------------------

OVERVIEW

Once you have completed the Connect Four project, you can move on to creating a program that makes the computer play you. In computers, we call this "artificial
intelligence" or "AI." Maybe the computer will even beat you! How very exciting!


REQUIREMENTS

This project has two basic aspects. First, you have to get the computer to
automatically make moves. If you already have the Connect Four game built (and built
well) this should be very simple. All you need is to check whose turn it is (assume
the computer is always O) and if it is the computer's turn, have it come up with a
move. Sounds like a basic function that returns an integer, right?

In the beginning you can have the computer make a random move (you'll need to use
Math.random(). But how will you give it a maximum value?)

Building the computer's strategy is the difficult part. There are three basic
strategies you can have the computer employ:

1) If the computer get four in a row the next turn, make that move.
2) If the human player can win next turn, block them from winning
3) If a move that the computer would make would allow the human to win
next turn, don't make that move.

Otherwise, make a random move.

At the very end, ask yourself this question—if the computer has no good moves to
make, how does it avoid entering an infinite loop?

This assignment is very difficult, so best of luck to you!


GETTING STARTED

The very first thing you should do is copy this folder and change the name of it
to the following:

YourName_GradeNumber_ConnectFourAI

For example, were I a very smart fifth grader I would change the name to this:

Gabe_5_ConnectFourAI

To test your program, you can compile the whole project (Ctrl-K) right click on the
ConnectFour class, and call the main() function.

If you have any questions about this assignment, feel free to email me at
gabe.nicholas@gmail.com. Or since you don't have access to email, just shout really loudly ;)
