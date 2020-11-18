package com.bigumapafight;

import com.bigumapafight.bluefighters.*;
import com.bigumapafight.redfighters.*;

public class Main {

    public static void main(String[] args) {
        Guardian guardian = new Guardian("guardian");
        Paladin paladin = new Paladin("paladin");
        Gladiator gladiator = new Gladiator("gladiator");
        Knight knight = new Knight("knight");
        Wizard wizard = new Wizard("wizard");

        Dragon dragon = new Dragon("dragon");
        Giant giant = new Giant("giant");
        Assassin assassin = new Assassin("assassin");
        Elementary elementary = new Elementary("elementary");
        Thief thief = new Thief("thief");

        giant.specialMegaAttack(guardian);
        giant.specialMegaAttack(paladin);
        giant.specialMegaAttack(gladiator);
        giant.specialMegaAttack(guardian);
        giant.specialMegaAttack(paladin);

        dragon.revive(giant);



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
