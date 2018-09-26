package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to guess a number or would you want me to guess the number you are thinking? If you want to play game 1, enter '1' and for game 2, enter '2'");
        if (input.next().equals("1")) {


            int ranNum = (int) ((Math.random() * (10)));
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
                }

            }
        }
        else
        {
            if(input.next().equals("2"))
            {
                System.out.println("youmadeit");

            }
            else
            {
             System.out.println("Please enter the appropriate number");
            }
        }
    }
}
