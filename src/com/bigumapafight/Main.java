package com.bigumapafight;

import com.bigumapafight.bluefighters.*;

public class Main {

    public static void main(String[] args) {
        Archer gustavo = new Archer("Gustavo");
        Knight biel = new Knight("Gabriel");
        Healer arnaldo = new Healer("Arnaldo");
        Warrior marineide = new Warrior("Marineide");
        Wizard eduardo = new Wizard("Eduardo");

        eduardo.specialAttackAndCure(gustavo, biel);

        //public abstract void specialAttack(Fighter targetFighter, Fighter targetFighter2);
        //public abstract void specialAttack(Fighter targetFighter, Fighter teamFighter);
        //public abstract void specialAttack(Fighter targetFighter, Fighter targetFighter2, Fighter targetFighter3);
        //public abstract void specialAttack(Fighter teamFighter, Fighter teamFighter2, Fighter teamFighter3);
        //public abstract void specialAttack(Fighter teamFighter, Fighter teamFighter2);    public void specialAttack(Fighter targetFighter) {
    }
}
