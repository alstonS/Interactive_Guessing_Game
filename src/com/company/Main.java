package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to guess a number or would you want me to guess the number you are thinking? If you want to play game 1, enter '1' and for game 2, enter '2'");
        if (input.next().equals("1")) {


            int ranNum = (int) ((Math.random() * (10)));
            int guessCounter=0;
            String randomNum = Integer.toString(ranNum);
            System.out.println("I am thinking of a number 0-10. Guess my Number");
            boolean GUESS = false;
            while (!GUESS) {
                String inputName = input.next();
                if (randomNum.equals(inputName)) {
                    System.out.println("Wow you have successfully guessed my number!");
                    GUESS = true;
                } else {
                    System.out.println("Sorry that number isn't what I had in mind. Please try again");
                    guessCounter++;
                }

            }
            System.out.println("You have guessed my number in " + guessCounter + " attempt(s)! That's great!");

        }
        else
        {
            if(input.next().equals("2")) {

                System.out.println("I can try to guess your number, but first select a difficulty level by entering '1' for numbers in ranges 1-10, '2' for numbers in range 1-100, '3' for numbers in range 1-1000, '4' for numbers in range 1-10000");

                int maxValue = (int) Math.pow(10, Integer.parseInt(input.next()));
                int minValue = 1;
                int middleNumber = maxValue/2;
                int firstMid = (maxValue + minValue) / 2;

                int gMax=0;
                int gMin=0;

                int lMax=0;
                int lMin=0;
                int counterKey=0;

                gMin = firstMid;
                gMax = maxValue;
                lMax= firstMid;
                lMin=1;


                boolean secondGame = false;
                boolean startGame = false;
                boolean firstTime = true;
                System.out.println(maxValue);
                while (!secondGame) {
                    if(!startGame) {
                        System.out.println("The number I am guessing is " + firstMid + ", is your number higher, lower, or correct?");
                        startGame = true;
                    }

                    if (input.next().equalsIgnoreCase("Higher")) {

                    if(!firstTime) {
                        gMin = middleNumber;
                    }

                        middleNumber = (gMin + gMax) / 2;

                       lMax = middleNumber;
                       lMin = gMin;
                       counterKey++;

                        firstTime = false;
                        
                    } else {
                        if (input.next().equalsIgnoreCase("Lower")) {
                            if(!firstTime) {
                                lMax = middleNumber;

                            }
                            middleNumber = (lMin + lMax) / 2;

                            gMax = lMax;
                            gMin = middleNumber;
                            counterKey++;
                            firstTime = false;
                        }
                        else
                        {
                            if(input.next().equalsIgnoreCase(("Correct")))
                            {
                                System.out.println("Wow i found your answer! It only took you " + counterKey + " tries.");
                                secondGame = true;
                            }
                            else
                            {
                                System.out.println("ENTER ONE OF THE FOLLOWING: HIGHER,LOWER, CORRECT");
                            }
                        }
                    }
                    System.out.println("The number I am guessing now is " + middleNumber + ", is this number higher, lower, or correct?");
                }



            }
            else
            {
             System.out.println("Please enter the appropriate number");
            }
        }
    }
}
