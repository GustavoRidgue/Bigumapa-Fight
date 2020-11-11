package com.bigumapafight.bluefighters;

import com.bigumapafight.progenitor.Fighter;

public class Knight extends BlueFighter {

    public Knight(String name) {
        super(name);
    }

    @Override
    public void setSkills() {
        this.setCategory("Knight");

        this.setHp(4000);
        this.setElixir(5000);

        this.setCommonAttack(150);
        this.setCommonAttackElixir(100);

        this.setMediumAttack(250);
        this.setMediumAttackElixir(200);

        this.setSuperAttack(450);
        this.setSuperAttackElixir(400);

        this.setLegendaryAttack(650);
        this.setLegendaryAttackElixir(600);
    }

    public void specialMegaAttack(Fighter targetFighter) {
        if (this.verifyCombat() && targetFighter.verifyCombat()) {
            this.elixir -= (this.getLegendaryAttackElixir() + this.getCommonAttackElixir());

            if (this.verifyCombat()) {
                System.out.println("---------- FIGHT! ----------\n" +
                        this.getName() + " use SPECIAL ATTACK " + targetFighter.getName() + "\n" +
                        "\nOld status: \n" +
                        this.getName() + "= HP: " + this.getHp() + " | Elixir: " + (this.getElixir() + (this.getLegendaryAttackElixir() + this.getCommonAttackElixir())) + "\n" +
                        targetFighter.getName() + "= HP: " + targetFighter.getHp() + " | Elixir: " + targetFighter.getElixir());

                targetFighter.setHp(targetFighter.getHp() - (this.getLegendaryAttack() + this.getMediumAttack()));

                System.out.println("\nNew Status: \n" +
                        this.getName() + "= HP: " + this.getHp() + " | Elixir: " + this.getElixir() +
                        " (lost " + (this.getLegendaryAttackElixir() + this.getCommonAttackElixir()) + " elixir)\n" +
                        targetFighter.getName() + "= HP: " + targetFighter.getHp() + " | Elixir: " + targetFighter.getElixir() +
                        " (lost " + (this.getLegendaryAttack() + this.getMediumAttack()) + " hp)" +
                        "\n---------- FIGHT ENDED! ----------\n");
                if (!targetFighter.verifyCombat()) {
                    System.out.println("\n   ---------- " + this.getName().toUpperCase() + " YOU WIN! (" +
                            targetFighter.getName() + " HP is over) ----------   \n");
                    this.loseCombat();
                }

            } else {
                System.out.println(this.getName() + " SPECIAL ATTACK " + targetFighter.getName() + "\n" +
                        "\nOld status: \n" +
                        this.getName() + "= HP: " + this.getHp() + " | Elixir: " + (this.getElixir() + (this.getLegendaryAttackElixir() + this.getCommonAttackElixir())) + "\n" +
                        targetFighter.getName() + "= HP: " + targetFighter.getHp() + " | Elixir: " + targetFighter.getElixir() + "\n" +
                        "\nNew Status: \n" +
                        this.getName() + "= HP: " + this.getHp() + " | Elixir: " + this.getElixir());
                System.out.println(this.getName() + " YOU LOSE! (your elixir is over)" +
                        "\n---------- FIGHT ENDED ----------\n");
                this.loseCombat();
            }
        } else {
            this.status();
            targetFighter.status();
            System.out.println(this.getName() + " and/or " + targetFighter.getName() + " already lose" +
                    "\n---------- FIGHT ENDED! ----------\n");
        }
    }
}
