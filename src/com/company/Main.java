package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        System.out.println("Would you like to guess a number or would you want me to guess the number you are thinking? If you want to play game 1, enter '1' and for game 2, enter '2'");
        String firstAns= input.next();
        if (firstAns.equals("1")) {


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
            System.out.println("You have guessed my number in " + guessCounter + " attempt(s)! That's great!" );

        }
        else
        {
            if(firstAns.equals("2")) {
                System.out.println("Hello, I am an AI and this is my game. What is your name?");
                String name = input2.nextLine();

                System.out.println(name + " , I can guess number, but first select a difficulty level, but each increasing number will add a zero to max number.");
                System.out.println("Enter '1' for numbers in ranges 1-10");
                System.out.println("Enter '2' for numbers in ranges 1-100");
                System.out.println("Enter '3' for numbers in ranges 1-1000");
                System.out.println("Enter '4' for numbers in ranges 1-10000");
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

                System.out.println("The Range You have Chosen is from 0 to " + maxValue);
                while (!secondGame) {


                    System.out.println(name + " , The number im guessing now is " + middleNumber + ", is your number higher, lower, or correct?");
                    String GuessingCheck = input.next();
                    if (GuessingCheck.equalsIgnoreCase("Higher")) {

                    if(!firstTime) {
                        gMin = middleNumber;
                    }

                        middleNumber = (gMin + gMax) / 2;

                       lMax = middleNumber;
                       lMin = gMin;
                       counterKey++;

                        firstTime = false;
                        
                    } else {
                        if (GuessingCheck.equalsIgnoreCase("Lower")) {
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
                            if(GuessingCheck.equalsIgnoreCase(("Correct")))
                            {
                                System.out.println("Wow i found your answer! That's Impressive " + name+ " , It only took you " + counterKey + " tries. " );
                                secondGame = true;
                            }
                            else
                            {
                                System.out.println("ENTER ONE OF THE FOLLOWING: HIGHER,LOWER, CORRECT");
                            }
                        }
                    }


                }



            }
            else
            {
             System.out.println("Please enter the appropriate number");
            }
        }
    }
}
