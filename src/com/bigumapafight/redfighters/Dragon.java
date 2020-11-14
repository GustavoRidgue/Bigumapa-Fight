package com.bigumapafight.redfighters;

import com.bigumapafight.progenitor.Fighter;

public class Dragon extends RedFighter {
    public Dragon(String name) {
        super(name);
    }

    @Override
    public void setSkills() {
        this.setCategory("Dragon");

        this.setHp(7000);
        this.setElixir(6000);

        this.setCommonAttack(200);
        this.setCommonAttackElixir(200);

        this.setMediumAttack(400);
        this.setMediumAttackElixir(400);

        this.setSuperAttack(600);
        this.setSuperAttackElixir(600);

        this.setLegendaryAttack(800);
        this.setLegendaryAttackElixir(800);
    }

    public void specialMegaAttack(Fighter targetFighter) {
        if (this.verifyCombat() && targetFighter.verifyCombat()) {
            this.setElixir(this.getElixir() - (this.getLegendaryAttackElixir() + this.getCommonAttackElixir()));

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
