package com.bigumapafight;

import com.bigumapafight.service.Fighter;

public class Main {

    public static void main(String[] args) {
        System.out.println("");
        Fighter fighter[] = new Fighter[10];

        Fighter gustavo =
                new Fighter("Gustavo", "American", 15, 1.73f, 42.50f, "Attacker");

        Fighter marineide =
                new Fighter("Marineide", "France", 45, 1.80f, 66.53f, "Curator");

        Fighter arnaldo =
                new Fighter("Arnaldo", "Egyptian", 47, 1.70f, 104.53f, "Tanker");

        Fighter biel =
                new Fighter("Biel", "Canadian", 21, 1.80f, 74.53f, "Assistant");

        //gustavo.attackStatus();
        //arnaldo.attackStatus();
        //biel.attackStatus();
        //marineide.attackStatus();
//
        //gustavo.status();
        //arnaldo.status();
        //biel.status();
        //marineide.status();

        gustavo.attack(marineide, 4);
        biel.attack(gustavo, 4);
        arnaldo.attack(marineide, 4);


    }
}
