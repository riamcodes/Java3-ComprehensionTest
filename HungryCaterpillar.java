//NAME: Ria Mukherji
//SMU ID: 48877496
//LAB: Lab 3-fall 2022
//INSTRUCTOR: Dixit,Paarul Howard,Ken

import java.util.Scanner;

public class HungryCaterpillar
{
  
//static variables
static Scanner scan = new Scanner(System.in);
static int score = 0;


  //main method
  public static void main(String[] args)
  {
   int numberOfQuestions = 6;

   //store things as strings
   String story = getStory();

   //print story and menu and score 
   System.out.print(story);
  
  //while loop
  while (true)
  {
   //print displayMenuGetOption() and store return as choice
   int choice = displayMenuGetOption();
 
  // go through all possible inputs
  if(choice == 1)
  {
    multipleChoice();
  } 
  else if (choice == 2)
  {
   trueFalse();
  }
else if(choice == 3)
  {
 fillInTheBlank();
  }
else if (choice == 4)
  {
   displayScore(numberOfQuestions);
  }
else if(choice == 5)
  {
   break;
  }
else
  {
   System.out.println("\nTry again!");
  }

  }//end while

System.out.println("\nGood-bye.");

  }//end main


//method that contains the story
public static String getStory() { 
        String copyright = "\nCopyright 1969, 1987 by Eric Carle LLC.\n\n"; 
        String titleAuthor = "\nTHE VERY HUNGRY CATERPILLAR by Eric Carle\n\n"; 
        String story = "\"In the light of the moon a little egg lay on a leaf." 
                + "\nOne Sunday morning the warm sun came up and -pop!- out of the egg came a tiny and very hungry caterpillar." 
                + "\nHe stared to look for some food." 
                + "\nOn Monday he ate through one apple. But he was still hungry." 
                + "\nOn Tuesday he ate through two pears, but he was still hungry." 
                + "\nOn Wednesday he ate through three plums, but he was still hungry." 
                + "\nOn Thursday he ate through four strawberries, but he was still hungry." 
                + "\nOn Friday he ate through five oranges, but he was still hungry." 
                + "\nOn Saturday he ate through one piece of chocolate cake, one ice-cream cone, one pickle, one slice of Swiss cheese, " 
                + "one slice of salami, \none lollipop, one piece of cherry pie, one sausage, one cupcake, and one slice of watermelon." 
                + "\nThat night he had a stomachache!" 
                + "\nThe next day was Sunday again. The caterpillar ate through one nice green leaf, and after that he felt much better." 
                + "\nNow he wasn't hungry anymore - and he wasn't a little caterpillar anymore." 
                + "\nHe was a big, fat caterpillar." 
                + "\nHe built a small house, called a cocoon, around himself. He stayed inside for more than two weeks. " 
                + "Then he nibble a hole in the cocoon, pushed his way out and...he was a beautiful butterfly!\""; 
        String theEnd = "\n\nThe End.\n"; 
        return copyright + titleAuthor + story + theEnd; 
}//end getStory
 

//method displays a menu to the user and returns the users choice as an int
public static int displayMenuGetOption()
{

//print out the options string
String options = "\nChoose the type of questions (5 to exit):" + "\n1) Multiple Choice" + "\n2) True/False" + "\n3) Fill in the blank" + "\n4) Display score" + "\n5) Exit ";
System.out.println(options);

//Scanner name
Scanner scan = new Scanner(System.in);

//store users choice
int userChoice = scan.nextInt();

return userChoice;
} 

//method creating multiple choice questions 
public static void multipleChoice()
{
System.out.println("\nAnswer the following Multiple Choice Questions. Each correct answer is worth 1 point." +
"\n-------------------------------------------------------------------------------------" + "\nWhat did the caterpillar eat first?" + "\n1) a green leaf" + "\n2) a lollipop" + "\n3) an apple" + "\n4) a plum"); 

Scanner scan = new Scanner(System.in);
int userAnswer = scan.nextInt();

compareIntAnswers(3, userAnswer);

System.out.println("\nWhat did the caterpillar become?" + "\n1) a beautiful dragonfly" + "\n2) a beautiful fly" + "\n3) a beautiful ladybug" + "\n4) a beautiful butterfly");

userAnswer = scan.nextInt();
compareIntAnswers(4, userAnswer);

}//end multipleChoice

//method creating true or false questions 
public static void trueFalse()
{
System.out.print("\nAnswer the following True/False Questions. Each correct answer is worth 1 point." + "\n--------------------------------------------------------------------------------" + "\nA tiny and very hungry caterpillar came out of the little egg." + "\n0 = false; 1 = true\n");

Scanner scan = new Scanner(System.in);

int userAnswer = scan.nextInt();

compareIntAnswers(1, userAnswer);

System.out.print("\nA strawberry made the caterpillar feel much better." + "\n0 = false; 1 = true\n");

userAnswer = scan.nextInt();

compareIntAnswers(0, userAnswer);
}//end trueFalse

//method creating fill in the blank questions
public static void fillInTheBlank()
{
System.out.println("\nAnswer the following Fill in the Blank Questions. Each correct answer is worth 1 point." + "\n---------------------------------------------------------------------------------------" + "\nThe caterpillar built a _______ around himself.");
 
Scanner scan = new Scanner(System.in);

String userAnswer = scan.next();

compareStringAnswers("cocoon", userAnswer);

System.out.println("\nThe caterpillar ate through _______ pears.");

userAnswer = scan.next();

compareStringAnswers("two", userAnswer);

}//end fillInTheBlank
 
public static void compareIntAnswers(int answer, int correctAnswer)
{
 String result;
 if (answer == correctAnswer)
  {
   result = "That's correct!";
   score++;
  }
  else 
  {
   result = "That's incorrect!";
  }
System.out.println(result);
}//end compareIntAnswers

//method compares answers for the fill in the blank questions
public static void compareStringAnswers(String strAnswer, String correctStrAnswer)
{
String result;
if (correctStrAnswer.equals(strAnswer))
{
result = "That's correct!";
score++;
}
else
{
result = "That's incorrect!";
}
System.out.println(result);
}//end compareStrings

//method displays score
public static void displayScore(int num)
{
System.out.printf("\nYou scored %d out of %d.\n", score, num);
 if (score >= 5)
{
System.out.println("\nExcellent!");
}
 else if (score == 3 || score == 4)
{
System.out.println("\nVery good!");
}
 else
{
System.out.println("\nTry taking the test again.");
}
}


}//end class
