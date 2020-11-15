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

        guardian.attack4(assassin);
        dragon.specialAttackThreeFighters(wizard, knight, gladiator);
        paladin.specialAttackThreeFighters(thief, elementary, assassin);
        giant.specialMegaAttack(wizard);
        gladiator.cureHp(wizard, 1000);
        assassin.specialAttackTwoFighters(wizard, knight);
        knight.specialAttackTwoFighters(elementary, assassin);
        elementary.specialAttackAndCure(knight, assassin, giant);
        wizard.specialAttackAndCure(assassin, wizard, guardian);
        thief.specialStealLife(knight);

        guardian.specialCureHp300(knight,wizard);
        dragon.specialAttackThreeFighters(wizard, gladiator, knight);
        paladin.specialAttackThreeFighters(thief, elementary, assassin);
        giant.specialMegaAttack(knight);
        gladiator.cureHp(knight, 1000);
        assassin.specialAttackTwoFighters(knight, wizard);
        knight.cureHp(800);
        elementary.specialAttackAndCure(wizard, assassin, giant);
        wizard.specialAttackAndCure(assassin, wizard, guardian);
        thief.specialStealLife(wizard);

        guardian.specialCureHp300(wizard, knight);
        dragon.specialAttackThreeFighters(knight,wizard,gladiator);
        paladin.attack4(assassin);
        giant.cureHp(assassin, 1000);
        gladiator.specialMegaAttack(assassin);
        knight.attack4(elementary);
        elementary.attack4(wizard);
        wizard.cureHp(2000);
        thief.attack4(knight);

        guardian.attack4(elementary);
        dragon.specialAttackThreeFighters(knight, wizard, gladiator);
        paladin.specialAttackThreeFighters(elementary, thief, dragon);
        giant.attack4(knight);
        gladiator.specialMegaAttack(elementary);
        wizard.specialAttackAndCure(thief, wizard, guardian);
        thief.specialStealLife(wizard);

        guardian.attack4(thief);
        dragon.specialAttackThreeFighters(wizard, paladin, gladiator);
        paladin.attack4(thief);
        giant.specialMegaAttack(wizard);
        gladiator.attack4(thief);
        wizard.attack4(thief);

        guardian.attack2(dragon);
        dragon.attack3(wizard);
        paladin.attack1(dragon);
        giant.attack3(gladiator);
        gladiator.attack3(giant);

        guardian.attack3(giant);
        dragon.attack1(paladin);
        paladin.attack1(giant);
        giant.attack1(paladin);

        guardian.attack4(dragon);
        dragon.attack1(guardian);

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
