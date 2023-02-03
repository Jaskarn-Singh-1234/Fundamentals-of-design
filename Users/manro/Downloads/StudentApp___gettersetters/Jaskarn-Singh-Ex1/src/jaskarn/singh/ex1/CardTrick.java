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
        
        Card[] hand = new Card[7];

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            int randomValue = (int) (Math.random() *  13);
            int randomSuit = (int) (Math.random() *  4);
            card.setValue(randomValue);
            card.setSuit(Card.SUITS[randomSuit]);
            hand[i] = card;
            //card.setValue(insert call to random number generator here)
            // 
            //card.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this point
        }
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value for card 1-10 and 11 for jack, 12 for queen and 13 for King: ");
        int userValue = input.nextInt();
        System.out.print("Enter the value for suit ie. 1 for Hearts, 2 for Diamonds, 3 for Spade and 4 for Club: ");
        String userSuit = Card.SUITS[input.nextInt()];
        
        for(int i = 0; i < hand.length; i++){
            if(hand[i].getSuit() == userSuit && hand[i].getValue() ==userValue){
                printInfo();
            }else{
                System.out.println("No match found");
            }
        }
        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here. 
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        // 
        // Then loop through the cards in the array to see if there's a match.
        
        // If the guess is successful, invoke the printInfo() method below.
        
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

