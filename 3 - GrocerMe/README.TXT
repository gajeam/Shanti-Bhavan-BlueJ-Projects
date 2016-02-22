-------------------------
GROCERME PROJECT

Author: Gabriel Nicholas
Date: 21 February, 2016
-------------------------

OVERVIEW

It's time for you to create your very first app. It's called GrocerMe and it's going to
revolutionize the world. The premise is simple——GrocerMe allows users to keep track of
items in a grocery list. It allows them to add, remove, and sort items as well as see
all the items that they added to the list.

If you do this assignment right, you can sell your company for millions to Google.


REQUIREMENTS

As previously stated, your app should be able to present, add, remove, and sort the
items in a grocery list. I have already implemented for you the reading in of input.
All you have to do is write the functions I have provided. Specifics about the
requirements for each function can be found in the function's comments.

The main thing is that, under no circumstances should your app crash. The user should
be able to put in any input and the app can handle it. Google isn't going to buy your
app if they can make it crash!


GETTING STARTED

The very first thing you should do is copy this folder and change the name of it
to the following:

YourName_GradeNumber_GrocerMe

For example, were I a very smart fifth grader I would change the name to this:

Gabe_5_GrocerMe

Then, you will write the necessary code for each of the functions. You'll first need
to start by initializing your array in the constructor GrocerMe(). Then I recommend
doing present, add, remove, and sort, in that order.

To test out present before you have add is a little tricky. What I recommend doing is
filling it with fake values first. You can do that by doing something like this:

groceryList = new String []{"dog", "hog", "bog"};

Obviously, you'll want to remove this for the actual project.

To test your program, you can compile the whole project (Ctrl-K), right click on the GrocerMe
class,and call main function.


LOOKING FOR MORE?

If you have built the GrocerMe project and are looking for more, you can add the
ability to save the list by entering "v". This would allow the user to have the
same grocery list load if they exit the program.

But how would you do this? Look at the file input/output list in your chapter.
Basically though, you would have to write the array out to a text file. Then,
when the program runs, first automatically check to see if there is a text file
to load. If so, load it. Otherwise, have an empty list.

Another thing you can do is implement a more difficult sorting algorithm than
bubble sort. If you don't have to look at your book to do this assignment, try
not to!

Of course, if you have any questions about this assignment, don't hesitate to
email me at gabe.nicholas@gmail.com
