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
        this.setElixir(6000);

        this.setCommonAttack(150);
        this.setCommonAttackElixir(100);

        this.setMediumAttack(250);
        this.setMediumAttackElixir(200);

        this.setSuperAttack(450);
        this.setSuperAttackElixir(400);

        this.setLegendaryAttack(650);
        this.setLegendaryAttackElixir(600);
    }

    public void specialAttackTwoFighters(Fighter targetFighter, Fighter targetFighter2) {
        System.out.println("---------- FIGHT! ----------");
        if (this.verifyCombat() && targetFighter.verifyCombat() && targetFighter2.verifyCombat()) {

            int newAttack = this.getMediumAttack() + this.getMediumAttack();
            int newElixir = this.getLegendaryAttackElixir() + this.getCommonAttackElixir();
            this.setElixir(this.getElixir() - newElixir);

            if (this.verifyCombat()) {
                System.out.println(this.getName() + " use SPECIAL ATTACK " + targetFighter.getName() +
                        " and " + targetFighter2.getName() + "\n" +
                        "\nOld status: \n" +
                        this.getName() + "= HP: " + this.getHp() + " | Elixir: " + (this.getElixir() + newElixir) + "\n" +
                        targetFighter.getName() + "= HP: " + targetFighter.getHp() + " | Elixir: " + targetFighter.getElixir() + "\n" +
                        targetFighter2.getName() + "= HP: " + targetFighter2.getHp() + " | Elixir: " + targetFighter2.getElixir());

                targetFighter.setHp(targetFighter.getHp() - newAttack);
                targetFighter2.setHp(targetFighter2.getHp() - newAttack);

                System.out.println(
                        "\nNew Status: \n" +
                                this.getName() + "= HP: " + this.getHp() + " | Elixir: " + this.getElixir() + " (lost " + newElixir + " elixir)\n" +
                                targetFighter.getName() + "= HP: " + targetFighter.getHp() + " | Elixir: " + targetFighter.getElixir() + " (lost " + newAttack + " hp)\n" +
                                targetFighter2.getName() + "= HP: " + targetFighter2.getHp() + " | Elixir: " + targetFighter2.getElixir() + " (lost " + newAttack + " hp)" +
                                "\n---------- FIGHT ENDED! ----------\n"
                );
                if (!targetFighter.verifyCombat()) {
                    System.out.println("\n   ---------- " + this.getName().toUpperCase() + " YOU WIN! (" +
                            targetFighter.getName() + " HP is over) ----------   \n");
                    this.loseCombat();
                }

            } else {
                System.out.println(this.getName() + " SPECIAL ATTACK " + targetFighter.getName() + "\n" +
                        "\nOld status: \n" +
                        this.getName() + "= HP: " + this.getHp() + " | Elixir: " + (this.getElixir() + newElixir) + "\n" +
                        targetFighter.getName() + "= HP: " + targetFighter.getHp() + " | Elixir: " + targetFighter.getElixir() + "\n" +
                        "\nNew Status: \n" +
                        this.getName() + "= HP: " + this.getHp() + " | Elixir: " + this.getElixir());
                System.out.println(this.getName() + " YOU LOSE! (your elixir is over)");
                this.loseCombat();
                System.out.println("\n---------- FIGHT ENDED! ----------\n");
            }
        }
    }
}
