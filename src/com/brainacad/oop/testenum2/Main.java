package com.brainacad.oop.testenum2;

public class Main {

    public static void main(String[] args) {

        Card[] cards = new Card[52];
        int counter = 0;

        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cards[counter] = new Card(suit, rank);
                counter++;
            }
        }

        for (Card card : cards) {
            System.out.println(card);
        }
    }
}


