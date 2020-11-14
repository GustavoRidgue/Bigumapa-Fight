package com.bigumapafight.bluefighters;

import com.bigumapafight.progenitor.Fighter;

public class Guardian extends BlueFighter {

    public Guardian(String name) {
        super(name);
    }

    @Override
    public void setSkills() {
        this.setCategory("Guardian");

        this.setHp(8000);
        this.setElixir(5000);

        this.setCommonAttack(200);
        this.setCommonAttackElixir(200);

        this.setMediumAttack(400);
        this.setMediumAttackElixir(400);

        this.setSuperAttack(600);
        this.setSuperAttackElixir(600);

        this.setLegendaryAttack(800);
        this.setLegendaryAttackElixir(800);
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
