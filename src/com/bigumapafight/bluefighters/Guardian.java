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

        this.setCommonAttack(150);
        this.setCommonAttackElixir(150);

        this.setMediumAttack(350);
        this.setMediumAttackElixir(350);

        this.setSuperAttack(550);
        this.setSuperAttackElixir(550);

        this.setLegendaryAttack(750);
        this.setLegendaryAttackElixir(750);
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
