package com.company;

public class Main {

    public static void deck(){
        int deck[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};

        
        System.out.println(deck[0]);
    }









    public static double pickcard(){
        double x = (Math.random() * ((13 - 1)+1))+1;
        return x;
    }

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

    public static void main(String[] args) {
        player1();
        player2();
        deck();
    }
}
