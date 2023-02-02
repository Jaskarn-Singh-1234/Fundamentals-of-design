/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package jaskarn.singh.ex1;
import java.util.*;
/**
 *


 * @author $ Jaskarn Singh
 */
public class CardTrick {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Card[] hand = new Card[7];
        Random random = new Random();
        for (int i = 0; i < hand.length; i++)
        {
            Card card = new Card();
            card.setValue((int) Math.ceil(Math.random() * (13)));

            card.setSuit(Card.SUITS[random.nextInt(4)]);
            
            hand[i] = card;

        }

        // insert code to ask the user for Card value and suit, create their card
        Card userCard = new Card();
        System.out.println("Enter your card value (between 1 and 13)");
        userCard.setValue(scanner.nextInt());
        System.out.println("Enter your card suit (between 1 and 4)");
        userCard.setSuit(Card.SUITS[scanner.nextInt()]);

        System.out.println("Your card is" + userCard.getSuit() + userCard.getValue());
        
    for (Card hand1 : hand) {
        if (userCard.getSuit() == hand1.getSuit() && userCard.getValue() == hand1.getValue()) {
            printInfo();
            break;
        } else {
            System.out.println("No match found");
        }
    }
       
           
        }

       
       
        
    

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     */
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Paul, but you can call me prof, Paul or sir");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Be more active on LinkedIn");
        System.out.println("-- Have a semester with no violations of academic integrity!");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Investing");
        System.out.println("-- Cooking");
        System.out.println("-- Reading/Watching TV");
        System.out.println("-- Riding my motorcycle");

        System.out.println();
        
    
    }
}
