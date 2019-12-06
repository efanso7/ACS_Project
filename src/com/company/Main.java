package com.company;
import java.util.Scanner;
public class Main {



    public static double pickcard(){
        double x = (Math.random() * ((13 - 1)+1))+1;
        return x;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //deal
        int card1 = (int) pickcard();
        int card2 = (int) pickcard();
        int card3 = (int) pickcard();
        int card4 = (int) pickcard();
        int card5 = (int) pickcard();
        int card6 = (int) pickcard();
        int card7 = (int) pickcard();
        int card8 = (int) pickcard();
        int card9 = (int) pickcard();
        int card10 = (int) pickcard();

        while (card1 == card2) {
            card2 = (int) pickcard();
        }
        while (card1 == card3 || card2 == card3) {
            card3 = (int) pickcard();
        }
        while (card1 == card4 || card2 == card4 || card3 == card4) {
            card4 = (int) pickcard();
        }
        while (card1 == card5 || card2 == card5 || card3 == card5 || card4 == card5) {
            card5 = (int) pickcard();
        }
        while (card1 == card6 || card2 == card6 || card3 == card6 || card4 == card6 || card5 == card6) {
            card6 = (int) pickcard();
        }
        while (card1 == card7 || card2 == card7 || card3 == card7 || card4 == card7 || card5 == card7 || card6 == card7) {
            card7 = (int) pickcard();
        }
        while (card1 == card8 || card2 == card8 || card3 == card8 || card4 == card8 || card5 == card8 || card6 == card8 || card7 == card8) {
            card8 = (int) pickcard();
        }
        while (card1 == card9 || card2 == card9 || card3 == card9 || card4 == card9 || card5 == card9 || card6 == card9 || card7 == card9 || card8 == card9) {
            card9 = (int) pickcard();
        }
        while (card1 == card10 || card2 == card10 || card3 == card10 || card4 == card10 || card5 == card10 || card6 == card10 || card7 == card10 || card8 == card10 || card9 == card10) {
            card10 = (int) pickcard();
        }

        System.out.println("Player 1: " + card1 + ", " + card3 + ", " + card5 + ", " + card7 + ", " + card9);
        System.out.println("Player 2: " + card2 + ", " + card4 + ", " + card6 + ", " + card8 + ", " + card10);

        //ask which card each player wants to play

        int player1card = 0;
        int player2card = 0;

        //player 1
        System.out.println("player 1 what card do you want to play: ");
        int cardPlayed = sc.nextInt();
        if (cardPlayed > 5 || cardPlayed < 1) {
            while (cardPlayed > 5 || cardPlayed < 1) {
                System.out.println("player 1 what card do you want to play (it must be between 5 and 1): ");
                cardPlayed = sc.nextInt();
            }
        }
        else{
            if (cardPlayed == 1){
                cardPlayed = card1;
            }
            else if (cardPlayed == 2){
                cardPlayed = card3;
            }
            else if (cardPlayed == 3){
                cardPlayed = card5;
            }
            else if (cardPlayed == 4){
                cardPlayed = card7;
            }
            else if (cardPlayed == 5){
                cardPlayed = card9;
            }
            player1card = cardPlayed;
            System.out.println("player 1 played a " + player1card);

        }

        //player 2
        System.out.println("player 2 what card do you want to play: ");
        cardPlayed = sc.nextInt();
        if (cardPlayed > 5 || cardPlayed < 1) {
            while (cardPlayed > 5 || cardPlayed < 1) {
                System.out.println("player 2 what card do you want to play (it must be between 5 and 1): ");
                cardPlayed = sc.nextInt();
            }
        }
        else{
            if (cardPlayed == 1){
                cardPlayed = card2;
            }
            else if (cardPlayed == 2){
                cardPlayed = card4;
            }
            else if (cardPlayed == 3){
                cardPlayed = card6;
            }
            else if (cardPlayed == 4){
                cardPlayed = card8;
            }
            else if (cardPlayed == 5){
                cardPlayed = card10;
            }
            player2card = cardPlayed;
            System.out.println("player 2 played a " + player2card);

        }

        //decide who wins
        //player 1 wins

        if (player1card > player2card){
            System.out.println("player 1 wins");
            int player1points = 1;
            int player2points = 0;
        }
        //player 2 wins
        else if (player1card < player2card){
            System.out.println("player 2 wins");
            int player1points = 1;
            int player2points = 0;
        }

    }
}
