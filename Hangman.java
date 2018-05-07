import java.util.*;
public class Hangman
{
    static int drawCount = 0;
    static int x = 0;
    static DrawMan myMan = new DrawMan();
    /**
     * Draws hanger for hangman with myMan.draw, puts words to guess, intializes variables
     * @param String[] args
     */
    public static void main(String[] args) 
    {
        myMan.drawGallow();
        String[] words = {"mountain","ocean","testing"};
        int randomWordNumber = (int) (Math.random() * words.length);
        char[] enteredLetters = new char[words[randomWordNumber].length()];
        int triesCount = 0;
        boolean wordIsGuessed = false;
        do 
        {
        switch (enterLetter(words[randomWordNumber], enteredLetters)) 
        {
            case 0:
                triesCount++;
                break;
            case 1:
                triesCount++;
                break;
            case 2:
                break;
            case 3:
                wordIsGuessed = true;
               break;
        }//Ends switch statement
        } while (! wordIsGuessed); //Ends while loop
        System.out.println("\nThe word is " + words[randomWordNumber] +
            " You missed " + (triesCount -findEmptyPosition(enteredLetters)) +
            " time(s)");
    }//Ends static method main
    /**
     * Asks user to guess word and draws hangman if wrong
     * @param String word
     * @param enteredLetters
     * @return 2,1,drawCount
     */
    public static int enterLetter(String word, char[] enteredLetters)    
    {
        System.out.print("(Guess) Enter a letter in word ");
        if (! printWord(word, enteredLetters))
        return 3;
        System.out.print(" > ");
        Scanner input = new Scanner(System.in);
        int emptyPosition = findEmptyPosition(enteredLetters);
        char userInput = input.nextLine().charAt(0);
        if (drawCount == 0)
        {
            myMan.drawGallow();
        }
        if (inEnteredLetters(userInput, enteredLetters)) 
        {
            System.out.println(userInput + " is already in the word");
            return 2;
        }//Ends if statement
        if (word.contains(String.valueOf(userInput))) 
        {
            enteredLetters[emptyPosition] = userInput;
            return 1;
        }//Ends else if statement
        if (x != 1)
        {
            drawCount++;
            System.out.println(userInput + " is not in the word");
            if (drawCount == 1)
            {
                myMan.drawGallow();
                myMan.drawHead();
                //System.exit(0);
            }//Ends if statement
            if (drawCount == 2)
            {
                myMan.drawGallow();
                myMan.drawHead();
                myMan.drawBody();
            }//Ends if statement
            if (drawCount == 3)
            {
                myMan.drawGallow();
                myMan.drawHead();
                myMan.drawBody();
                myMan.drawLeftArm();
            }//Ends if statement
            if (drawCount == 4)
            {
                myMan.drawGallow();
                myMan.drawHead();
                myMan.drawBody();
                myMan.drawLeftArm();
                myMan.drawRightArm();
            }//Ends if statement
            if (drawCount == 5)
            {
                myMan.drawGallow();
                myMan.drawHead();
                myMan.drawBody();
                myMan.drawLeftArm();
                myMan.drawRightArm();
                myMan.drawLeftLeg();
            }//Ends if statement
            if (drawCount == 6)
            {
                myMan.drawGallow();
                myMan.drawHead();
                myMan.drawBody();
                myMan.drawLeftArm();
                myMan.drawRightArm();
                myMan.drawLeftLeg();
                myMan.drawRightLeg();
                return 3;
            }//Ends if statement
            return 0;
        }//Ends else statement
        return drawCount;
    }//Ends enterLetter method
    /**
     * Prints letter out to show how many user has revealed
     *
     * @param String word
     * @param char[] enteredLetters
     * @return asteriskPrinted
     */
    public static boolean printWord(String word, char[] enteredLetters) 
    {
        boolean asteriskPrinted = false;
        for (int i = 0; i < word.length(); i++) 
        {
            char letter = word.charAt(i);
            if (inEnteredLetters(letter, enteredLetters))
                System.out.print(letter);
            else {
                System.out.print('*');
                asteriskPrinted = true;
            }//Ebnds if statement
        }//Ends for loop
        return asteriskPrinted;
    }//Ends printWord method
    /**
     * Method inEnteredLetters
     *
     * @param letter 
     * @param char[] enteredLetters
     * @return String(enteredLetters).contains(String.valueOf(letter))
     */
    public static boolean inEnteredLetters(char letter, char[] enteredLetters) 
    {
        return new String(enteredLetters).contains(String.valueOf(letter));
    }//Ends inEnteredLetters method
    /**
     * Method findEmptyPosition used to clear screen
     *
     * @param char[] enteredLetters
     * @return i
     */
    public static int findEmptyPosition(char[] enteredLetters) 
    {
        int i = 0;
        while (enteredLetters[i] != '\u0000') i++;
        return i;
    }//Ends findEmptyPosition method
}//Ends Hangman class