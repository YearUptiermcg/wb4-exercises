package com.pluralsight;

public class Main {
    public static void main(String[] args) {

        Deck deck = new Deck();
        deck.shuffle();


        Hand dealerHand = new Hand();


        Hand player1Hand = new Hand();

        System.out.println("Welcome to Blackjack!");
        String player1Name = Console.PromptForString("Player 1, enter your name: ");

        System.out.println("Dealing cards... 2 cards to each player!");

        Card dealerCard1 = deck.deal();
        Card dealerCard2 = deck.deal();

        Card player1Card1 = deck.deal();
        Card player1Card2 = deck.deal();

        dealerCard1.flip();
        dealerCard1.DisplayCard();


    }
}