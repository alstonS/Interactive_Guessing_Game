package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args)
    {
         int ranNum =(int)((Math.random()*(10)));
         String randomNum = Integer.toString(ranNum);
         Scanner input = new Scanner(System.in);
         System.out.println("I am thinking of a number 0-10. Guess my Number");
         boolean GUESS = false;
         while(!GUESS){
        String inputName = input.next();
        if (randomNum.equals(inputName)) {
            System.out.println("Wow you have successfully guessed my number!");
            GUESS = true;
        } else {
            System.out.println("Sorry that number isn't what I had in mind. Please try again");
        }


        }


    }
}
