package com.bigumapafight;

import com.bigumapafight.bluefighters.Archer;
import com.bigumapafight.bluefighters.Knight;

public class Main {

    public static void main(String[] args) {
        Archer gustavo = new Archer("Gustavo");

        Knight biel = new Knight("Gabriel");

        Knight arnaldo = new Knight("Arnaldo");

        gustavo.status();
        biel.specialAttack(gustavo);

        //public abstract void specialAttack(Fighter targetFighter, Fighter targetFighter2);
        //public abstract void specialAttack(Fighter targetFighter, Fighter teamFighter);
        //public abstract void specialAttack(Fighter targetFighter, Fighter targetFighter2, Fighter targetFighter3);
        //public abstract void specialAttack(Fighter teamFighter, Fighter teamFighter2, Fighter teamFighter3);
        //public abstract void specialAttack(Fighter teamFighter, Fighter teamFighter2);    public void specialAttack(Fighter targetFighter) {
    }
}
