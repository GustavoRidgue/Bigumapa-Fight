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

    public void specialAttackThreeFighters(Fighter targetFighter, Fighter targetFighter2, Fighter targetFighter3) {
        System.out.println("---------- FIGHT! ----------");
        if (this.verifyCombat() && targetFighter.verifyCombat() && targetFighter2.verifyCombat()) {

            int newAttack = this.getMediumAttack() + this.getMediumAttack();
            int newElixir = this.getSuperAttackElixir() + this.getLegendaryAttackElixir();
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
                System.out.println("\n---------- FIGHT ENDED! ----------\n");
            }
        }
    }
}
