package com.bigumapafight;

import com.bigumapafight.bluefighters.*;

public class Main {

    public static void main(String[] args) {
        Archer archerBlue = new Archer("archerBlue");
        Warrior warriorBlue = new Warrior("warriorBlue");
        Wizard wizardBlue = new Wizard("wizardBlue");

        Healer healerRed = new Healer("healerRed");
        Knight knightRed = new Knight("knightRed");
        Archer archerRed = new Archer("archerRed");

        archerBlue.specialAttackThreeFighters(healerRed, knightRed, archerRed);
        healerRed.specialCureHp300(healerRed, archerRed);

        warriorBlue.specialMegaAttack(healerRed);
        knightRed.specialAttackTwoFighters(archerBlue, warriorBlue);

        wizardBlue.specialAttackAndCure(healerRed, archerBlue);
        archerRed.cureHp(healerRed, 800);

        archerBlue.specialAttackThreeFighters(healerRed, archerRed, knightRed);
        healerRed.specialCureHp300(healerRed, archerRed);

        warriorBlue.specialMegaAttack(archerRed);
        knightRed.cureHp(archerRed, 800);

        wizardBlue.specialAttackAndCure(archerRed, archerBlue);
        archerRed.specialAttackThreeFighters(archerBlue, warriorBlue, wizardBlue);

        archerBlue.specialAttackThreeFighters(archerRed, knightRed, healerRed);
        healerRed.specialCureHp300(archerRed, healerRed);

        warriorBlue.specialMegaAttack(archerRed);
        knightRed.cureHp(archerRed, 1000);

        wizardBlue.specialAttackAndCure(archerRed, archerBlue);
        archerRed.specialAttackThreeFighters(archerBlue, warriorBlue, wizardBlue);

        archerBlue.specialAttackThreeFighters(archerRed, knightRed, healerRed);
        healerRed.specialCureHp300(archerRed, healerRed);

        warriorBlue.specialMegaAttack(archerRed);
        knightRed.cureHp(archerRed, 1500);

        wizardBlue.specialAttackAndCure(archerRed, archerBlue);
        archerRed.specialAttackThreeFighters(archerBlue, warriorBlue, wizardBlue);

        archerBlue.specialAttackThreeFighters(archerRed, knightRed, healerRed);
        healerRed.specialCureHp300(archerRed, healerRed);

        warriorBlue.attack4(archerRed);
        archerRed.cureHp(1000);

        wizardBlue.specialAttackAndCure(archerRed, archerBlue);
        archerRed.specialAttackThreeFighters(warriorBlue, archerBlue, wizardBlue);

        archerBlue.specialAttackThreeFighters(healerRed, archerRed, knightRed);
        healerRed.specialCureHp300(archerRed, archerRed);

        warriorBlue.cureHp(archerBlue, 150);
        archerRed.specialAttackThreeFighters(archerBlue, warriorBlue, wizardBlue);

        wizardBlue.specialAttackAndCure(archerRed, archerBlue);
        archerRed.specialAttackThreeFighters(archerBlue, archerBlue, archerBlue);

        archerBlue.attack4(healerRed);
        knightRed.status();

        //public abstract void specialAttack(Fighter targetFighter, Fighter targetFighter2);
        //public abstract void specialAttack(Fighter targetFighter, Fighter teamFighter);
        //public abstract void specialAttack(Fighter targetFighter, Fighter targetFighter2, Fighter targetFighter3);
        //public abstract void specialAttack(Fighter teamFighter, Fighter teamFighter2, Fighter teamFighter3);
        //public abstract void specialAttack(Fighter teamFighter, Fighter teamFighter2);    public void specialAttack(Fighter targetFighter) {
    }
}
