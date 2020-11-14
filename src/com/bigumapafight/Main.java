package com.bigumapafight;

import com.bigumapafight.bluefighters.*;

public class Main {

    public static void main(String[] args) {
        Guardian guardianBlue = new Guardian("archerBlue");
        Gladiator gladiatorBlue = new Gladiator("warriorBlue");
        Wizard wizardBlue = new Wizard("wizardBlue");

        Paladin paladinRed = new Paladin("healerRed");
        Knight knightRed = new Knight("knightRed");
        Guardian archerRed = new Guardian("archerRed");

        guardianBlue.specialAttackThreeFighters(paladinRed, knightRed, archerRed);
        paladinRed.specialCureHp300(paladinRed, archerRed);

        gladiatorBlue.specialMegaAttack(paladinRed);
        knightRed.specialAttackTwoFighters(guardianBlue, gladiatorBlue);

        wizardBlue.specialAttackAndCure(paladinRed, guardianBlue);
        archerRed.cureHp(paladinRed, 800);

        guardianBlue.specialAttackThreeFighters(paladinRed, archerRed, knightRed);
        paladinRed.specialCureHp300(paladinRed, archerRed);

        gladiatorBlue.specialMegaAttack(archerRed);
        knightRed.cureHp(archerRed, 800);

        wizardBlue.specialAttackAndCure(archerRed, guardianBlue);
        archerRed.specialAttackThreeFighters(guardianBlue, gladiatorBlue, wizardBlue);

        guardianBlue.specialAttackThreeFighters(archerRed, knightRed, paladinRed);
        paladinRed.specialCureHp300(archerRed, paladinRed);

        gladiatorBlue.specialMegaAttack(archerRed);
        knightRed.cureHp(archerRed, 1000);

        wizardBlue.specialAttackAndCure(archerRed, guardianBlue);
        archerRed.specialAttackThreeFighters(guardianBlue, gladiatorBlue, wizardBlue);

        guardianBlue.specialAttackThreeFighters(archerRed, knightRed, paladinRed);
        paladinRed.specialCureHp300(archerRed, paladinRed);

        gladiatorBlue.specialMegaAttack(archerRed);
        knightRed.cureHp(archerRed, 1500);

        wizardBlue.specialAttackAndCure(archerRed, guardianBlue);
        archerRed.specialAttackThreeFighters(guardianBlue, gladiatorBlue, wizardBlue);

        guardianBlue.specialAttackThreeFighters(archerRed, knightRed, paladinRed);
        paladinRed.specialCureHp300(archerRed, paladinRed);

        gladiatorBlue.attack4(archerRed);
        archerRed.cureHp(1000);

        wizardBlue.specialAttackAndCure(archerRed, guardianBlue);
        archerRed.specialAttackThreeFighters(gladiatorBlue, guardianBlue, wizardBlue);

        guardianBlue.specialAttackThreeFighters(paladinRed, archerRed, knightRed);
        paladinRed.specialCureHp300(archerRed, archerRed);

        gladiatorBlue.cureHp(guardianBlue, 150);
        archerRed.specialAttackThreeFighters(guardianBlue, gladiatorBlue, wizardBlue);

        wizardBlue.specialAttackAndCure(archerRed, guardianBlue);
        archerRed.specialAttackThreeFighters(guardianBlue, guardianBlue, guardianBlue);

        guardianBlue.attack4(paladinRed);
        knightRed.status();

//        Archer;        Guardian;  (Tank)
//        Healer;        Paladin;   (Tank)
//        Warrior;       Gladiator; (Medium)
//        Knight;        Knight;    (Medium)
//        Wizard;        Wizard;    (Little)
//
//        Dragon;        Dragon;     (Tank)
//        DarkKnight;    Giant;      (Tank)
//        Assassin;      Assassin;   (Medium)
//        Viking;        Elementary; (Medium)
//        Thief;         Thief;      (Little)

        /*
        Blue team:
        put Paladin, Centaur, Gladiator, Guardian, Goliath, Elementary
        Remove Archer, Warrior;
        */

        /*
        Red team:
        Put Giant, Werewolf, StealEnergy, Ogre, Troll, Minotaur;
        Remove Assassin, Thief;
        */

        //public abstract void specialAttack(Fighter targetFighter, Fighter targetFighter2);
        //public abstract void specialAttack(Fighter targetFighter, Fighter teamFighter);
        //public abstract void specialAttack(Fighter targetFighter, Fighter targetFighter2, Fighter targetFighter3);
        //public abstract void specialAttack(Fighter teamFighter, Fighter teamFighter2, Fighter teamFighter3);
        //public abstract void specialAttack(Fighter teamFighter, Fighter teamFighter2);    public void specialAttack(Fighter targetFighter) {
    }
}
