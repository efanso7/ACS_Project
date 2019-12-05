package com.company;

public class Main {

    public static double pickcard(){
        double x = (Math.random() * ((13 - 1)+1))+1;
        return x;
    }
    /*
    public static void cards() {
        int card1 = (int)pickcard();
        int card2 = (int)pickcard();
        int card3 = (int)pickcard();
        int card4 = (int)pickcard();
        int card5 = (int)pickcard();

        System.out.println("Your cards: " + card1 + ", " + card2 + ", " + card3 + ", " + card4 + ", " + card5);
    }

    public static void player1(){
        System.out.println("Player 1");
        cards();
    }

    public static void player2(){
        System.out.println("Player 2");
        cards();
    }
    */
    public static int deal(){
        int card1 = (int)pickcard();
        int card2 = (int)pickcard();
        int card3 = (int)pickcard();
        int card4 = (int)pickcard();
        int card5 = (int)pickcard();
        int card6 = (int)pickcard();
        int card7 = (int)pickcard();
        int card8 = (int)pickcard();
        int card9 = (int)pickcard();
        int card10 = (int)pickcard();

        while(card1 == card2) {
            card2 = (int) pickcard();
        }
        while(card1 == card3 || card2 == card3){
            card3 = (int)pickcard();
        }
        while(card1 == card4 || card2 == card4 || card3 == card4){
            card4 = (int)pickcard();
        }
        while(card1 == card5 || card2 == card5 || card3 == card5 || card4 == card5){
            card5 = (int)pickcard();
        }
        while(card1 == card6 || card2 == card6 || card3 == card6 || card4 == card6 || card5 == card6){
            card6 = (int)pickcard();
        }
        while(card1 == card7 || card2 == card7 || card3 == card7 || card4 == card7 || card5 == card7 || card6 == card7){
            card7 = (int)pickcard();
        }
        while(card1 == card8 || card2 == card8 || card3 == card8 || card4 == card8 || card5 == card8 || card6 == card8 || card7 == card8){
            card8 = (int)pickcard();
        }
        while(card1 == card9 || card2 == card9 || card3 == card9 || card4 == card9 || card5 == card9 || card6 == card9 || card7 == card9 || card8 == card9){
            card9 = (int)pickcard();
        }
        while(card1 == card10 || card2 == card10 || card3 == card10 || card4 == card10 || card5 == card10 || card6 == card10 || card7 == card10 || card8 == card10 || card9 == card10){
            card10 = (int)pickcard();
        }

        System.out.println("Player 1: " + card1 + ", " + card3 + ", " + card5 + ", " + card7 + ", " + card9);
        System.out.println("Player 2: " + card2 + ", " + card4 + ", " + card6 + ", " + card8 + ", " + card10);
        //int cards[] = {card1, card2, card3, card4, card5, card6, card7, card8, card9, card10};
        //int player1[] = {card1, card3, card5, card7, card9};
        //int player2[] = {card2, card4, card6, card8, card10};
        //return cards[];


    }

    public static void main(String[] args) {
        //player1();
        //player2();
        deal();
    }
}
