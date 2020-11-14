package com.bigumapafight.bluefighters;

import com.bigumapafight.progenitor.Fighter;

public class Paladin extends BlueFighter {
    public Paladin(String name) {
        super(name);
    }

    @Override
    public void setSkills() {
        this.setCategory("Paladin");

        this.setHp(7000);
        this.setElixir(6000);

        this.setCommonAttack(100);
        this.setCommonAttackElixir(100);

        this.setMediumAttack(200);
        this.setMediumAttackElixir(200);

        this.setSuperAttack(300);
        this.setSuperAttackElixir(300);

        this.setLegendaryAttack(400);
        this.setLegendaryAttackElixir(400);
    }

    public void specialCureHp300(Fighter fighter, Fighter fighter2) {
        if (800 >= this.getElixir()) {
            System.out.println("\n   ---------- " + this.getName().toUpperCase() + " YOU LOSE! (your elixir is over) ----------   \n");
            this.loseCombat();
        }
        else if (!this.verifyCombat() || !fighter.verifyCombat()) {
            System.out.println(this.getName() + " can't cure " + fighter.getName() + " because " + this.getName() + " and/or " + fighter.getName() + " and/or " + fighter2.getName() + " already lose");
        } else {
            System.out.println("\n------ " + this.getName() + " cure " + 500 + " HP of " + fighter.getName() + " and " + fighter2.getName() + " ------\n" +
                    "Old statistics: \n" +
                    "Name: " + this.getName() + " | HP: " + this.getHp() + " | Elixir: " + this.getElixir() + "\n" +
                    "Name: " + fighter.getName() + " | HP: " + fighter.getHp() + " | Elixir: " + fighter.getElixir() + "\n" +
                    "Name: " + fighter2.getName() + " | HP: " + fighter2.getHp() + " | Elixir: " + fighter2.getElixir() + "\n");

            this.setHp(this.getHp() + 300);
            fighter.setHp(fighter.getHp() + 300);
            fighter2.setHp(fighter2.getHp() + 300);
            this.setElixir(this.getElixir() - 800);

            System.out.println("New statistics: \n" +
                    "Name: " + this.getName() + " | HP: " + this.getHp() + " | Elixir: " + this.getElixir() + " (Lost 800 Elixir and received 300 HP)" + "\n" +
                    "Name: " + fighter.getName() + " | HP: " + fighter.getHp() + " | Elixir: " + fighter.getElixir() + " (Received 300 HP)" + "\n" +
                    "Name: " + fighter2.getName() + " | HP: " + fighter2.getHp() + " | Elixir: " + fighter2.getElixir() + " (Received 300 HP)" +
                    "\n--------------------\n");
        }
    }
}
