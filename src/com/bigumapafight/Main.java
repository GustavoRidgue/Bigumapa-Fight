package com.bigumapafight;

import com.bigumapafight.bluefighters.Archer;
import com.bigumapafight.anotations.service.Fight;

public class Main {

    public static void main(String[] args) {
        Archer gustavo = new Archer("Gustavo");

        Archer biel = new Archer("Gabriel");

        Archer arnaldo = new Archer("Arnaldo");

        gustavo.specialAttack(biel, arnaldo);
        gustavo.status();

        gustavo.attack4(biel);
        gustavo.attack3(biel);
        gustavo.attack2(biel);
        gustavo.attack1(biel);
        gustavo.attack1(biel);
        gustavo.attack1(biel);
        gustavo.attack1(biel);
        gustavo.attack1(biel);
        gustavo.attack4(biel);
        gustavo.attack4(biel);
        gustavo.attack4(biel);

        System.out.println("o");


        //public abstract void specialAttack(Fighter targetFighter, Fighter targetFighter2);
        //public abstract void specialAttack(Fighter targetFighter, Fighter teamFighter);
        //public abstract void specialAttack(Fighter targetFighter, Fighter targetFighter2, Fighter targetFighter3);
        //public abstract void specialAttack(Fighter teamFighter, Fighter teamFighter2, Fighter teamFighter3);
        //public abstract void specialAttack(Fighter teamFighter, Fighter teamFighter2);    public void specialAttack(Fighter targetFighter) {
    }
}
