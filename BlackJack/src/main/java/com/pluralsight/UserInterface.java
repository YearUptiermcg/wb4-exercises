package com.pluralsight;


import java.util.ArrayList;

public class UserInterface {


    private  BlackJackGame game;

    public UserInterface(){

        game = new BlackJackGame();

        System.out.println("Welcome to Blackjack!");

        int numberOfPlayers = Console.PromptForInt("How many players (not including the dealer):");

        AddPlayersToGame(numberOfPlayers);

        game.DealCards();

        DisplayGame();
    }

    public void AddPlayersToGame(int numberOfPlayers){
        for (int i = 1 ; i <= numberOfPlayers ; i++){
            String playerName = Console.PromptForString("Please enter the name of player " + i + ": ");
            game.AddPlayer(playerName);
        }
    }

    public void DisplayGame(){
        System.out.println(game.getDealer());
        ArrayList<Player> players = game.getPlayers();
        for(Player player: players){
            System.out.println(player);
        }
    }
}