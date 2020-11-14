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

    public void specialAttackThreeFighters(Fighter targetFighter, Fighter targetFighter2, Fighter targetFighter3) {
        System.out.println("---------- FIGHT! ----------");
        if (this.verifyCombat() && targetFighter.verifyCombat() && targetFighter2.verifyCombat()) {

            int newAttack = this.getMediumAttack();
            int newElixir = this.getCommonAttackElixir() + this.getLegendaryAttackElixir();
            this.setElixir(this.getElixir() - newElixir);

            if (this.verifyCombat()) {
                System.out.println(this.getName() + " use SPECIAL ATTACK " + targetFighter.getName() +
                        ", " + targetFighter2.getName() + " and " + targetFighter3.getName() + "\n" +
                        "\nOld status: \n" +
                        this.getName() + "= HP: " + this.getHp() + " | Elixir: " + (this.getElixir() + newElixir) + "\n" +
                        targetFighter.getName() + "= HP: " + targetFighter.getHp() + " | Elixir: " + targetFighter.getElixir() + "\n" +
                        targetFighter2.getName() + "= HP: " + targetFighter2.getHp() + " | Elixir: " + targetFighter2.getElixir() + "\n" +
                        targetFighter3.getName() + "= HP: " + targetFighter3.getHp() + " | Elixir: " + targetFighter3.getElixir());

                targetFighter.setHp(targetFighter.getHp() - newAttack);
                targetFighter2.setHp(targetFighter2.getHp() - newAttack);
                targetFighter3.setHp(targetFighter3.getHp() - newAttack);

                System.out.println(
                        "\nNew Status: \n" +
                                this.getName() + "= HP: " + this.getHp() + " | Elixir: " + this.getElixir() + " (lost " + newElixir + " elixir)\n" +
                                targetFighter.getName() + "= HP: " + targetFighter.getHp() + " | Elixir: " + targetFighter.getElixir() + " (lost " + newAttack + " hp)\n" +
                                targetFighter2.getName() + "= HP: " + targetFighter2.getHp() + " | Elixir: " + targetFighter2.getElixir() + " (lost " + newAttack + " hp)\n" +
                                targetFighter3.getName() + "= HP: " + targetFighter3.getHp() + " | Elixir: " + targetFighter3.getElixir() + " (lost " + newAttack + " hp)" +
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
                System.out.println("\n ---------- FIGHT ENDED! ---------- \n");
            }
        }
    }
}
