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
            if(input.next().equals("2"))
            {

                System.out.println("I can try to guess your number, but first select a difficulty level by entering '1' for numbers in ranges 1-10, '2' for numbers in range 1-100, '3' for numbers in range 1-1000, '4' for numbers in range 1-10000");

                int maxValue= (int) Math.pow(10,Integer.parseInt(input.next()));

                System.out.println(maxValue);
                System.out.println("The number I am guessing is " + maxValue/2 + ", is this number higher, lower, or correct?");
                if(input.next().equalsIgnoreCase("Greater"))
                {
                    int secValue = (maxValue / 2)+ maxValue / 4;
                    System.out.println("The number I am guessing now is " + secValue + ", is this number higher, lower, or correct?");
                }
                else
                {
                    if(input.next().equalsIgnoreCase("Lower"))
                    {
                        

                    }
                }


                System.out.println("youmadeit");

            }
            else
            {
             System.out.println("Please enter the appropriate number");
            }
        }
    }
}
