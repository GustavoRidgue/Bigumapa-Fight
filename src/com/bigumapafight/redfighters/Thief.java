package com.bigumapafight.redfighters;

import com.bigumapafight.progenitor.Fighter;

public class Thief extends RedFighter {
    public Thief(String name) {
        super(name);
    }

    @Override
    public void setSkills() {
        this.setCategory("Thief");

        this.setHp(3000);
        this.setElixir(8000);

        this.setCommonAttack(100);
        this.setCommonAttackElixir(200);

        this.setMediumAttack(300);
        this.setMediumAttackElixir(400);

        this.setSuperAttack(500);
        this.setSuperAttackElixir(600);

        this.setLegendaryAttack(700);
        this.setLegendaryAttackElixir(800);
    }

    public void specialMegaAttack(Fighter targetFighter) {
        if (this.verifyCombat() && targetFighter.verifyCombat()) {
            this.setElixir(this.getElixir() - this.getLegendaryAttackElixir());

            if (this.verifyCombat()) {
                System.out.println("---------- FIGHT! ----------\n" +
                        this.getName() + " use SPECIAL ATTACK " + targetFighter.getName() + "\n" +
                        "\nOld status: \n" +
                        this.getName() + "= HP: " + this.getHp() + " | Elixir: " + (this.getElixir() + this.getLegendaryAttackElixir()) + "\n" +
                        targetFighter.getName() + "= HP: " + targetFighter.getHp() + " | Elixir: " + targetFighter.getElixir());

                this.setHp(this.getHp() + this.getSuperAttack());
                targetFighter.setHp(targetFighter.getHp() - this.getSuperAttack());

                System.out.println("\nNew Status: \n" +
                        this.getName() + "= HP: " + this.getHp() + " | Elixir: " + this.getElixir() +
                        " (lost " + this.getLegendaryAttackElixir() + " elixir and received " + this.getSuperAttack() + " HP)\n" +
                        targetFighter.getName() + "= HP: " + targetFighter.getHp() + " | Elixir: " + targetFighter.getElixir() +
                        " (lost " + this.getSuperAttack() + " hp)");
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
                    "\n ---------- FIGHT ENDED! ---------- \n");
        }
    }
}


