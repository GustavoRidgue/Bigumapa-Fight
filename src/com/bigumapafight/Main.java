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
