package com.bigumapafight.service;

import java.util.Random;

public class AutomaticFight {
    private Fight challenger;
    private Fight challenged;
    private int rounds;
    private boolean canFight;

    public void markFight(Fight fighterChallenger, Fight fighterChallenged) {
        if (fighterChallenger.getCategory().equals(fighterChallenged.getCategory()) &&
                fighterChallenged != fighterChallenger) {
            this.canFight = true;
            this.challenger = fighterChallenger;
            this.challenged = fighterChallenged;
        } else {
            this.canFight = false;
            this.challenger = null;
            this.challenged = null;
        }
    }

    public void fight() {
        if (this.canFight) {
            this.challenger.introduceYourself();
            this.challenged.introduceYourself();

            Random aleatory = new Random();
            int winner = aleatory.nextInt(3);

            switch (winner) {
                case 0:
                    System.out.println("Draw! Anyone won the fight!");
                    this.challenger.tieCombat();
                    this.challenged.tieCombat();
                    break;
                case 1:
                    System.out.println(this.challenger.getName().toUpperCase() + " YOU WIN!!!");
                    this.challenger.winCombat();
                    this.challenged.loseCombat();
                    break;
                case 2:
                    System.out.println(this.challenged.getName().toUpperCase() + " YOU WIN!!!");
                    this.challenger.loseCombat();
                    this.challenged.winCombat();
                    break;
                default:
                    break;
            }
        } else {
            System.out.println("Invalid fight");
        }
    }

    public Fight getChallenger() {
        return challenger;
    }

    public void setChallenger(Fight challenger) {
        this.challenger = challenger;
    }

    public Fight getChallenged() {
        return challenged;
    }

    public void setChallenged(Fight challenged) {
        this.challenged = challenged;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isCanFight() {
        return canFight;
    }

    public void setCanFight(boolean canFight) {
        this.canFight = canFight;
    }
}
