package com.company;

public class Main {

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

    public static void main(String[] args) {
        cards();
    }
}
