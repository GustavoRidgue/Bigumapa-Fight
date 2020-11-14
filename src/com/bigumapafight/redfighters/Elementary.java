package com.bigumapafight.redfighters;

import com.bigumapafight.progenitor.Fighter;

public class Elementary extends RedFighter {
    public Elementary(String name) {
        super(name);
    }

    @Override
    public void setSkills() {
        this.setCategory("Elementary");

        this.setHp(4000);
        this.setElixir(6000);

        this.setCommonAttack(150);
        this.setCommonAttackElixir(150);

        this.setMediumAttack(350);
        this.setMediumAttackElixir(350);

        this.setSuperAttack(550);
        this.setSuperAttackElixir(550);

        this.setLegendaryAttack(750);
        this.setLegendaryAttackElixir(750);
    }

    public void specialAttackAndCure(Fighter targetFighter, Fighter teamFighter, Fighter teamFighter2) {
        if (this.verifyCombat() && targetFighter.verifyCombat() && teamFighter.verifyCombat() && teamFighter2.verifyCombat()) {
            this.setElixir(this.getElixir() - (this.getSpecialAttackElixir() + this.getSpecialAttackElixir()));

            if (this.verifyCombat()) {
                System.out.println("---------- FIGHT! ----------\n" +
                        this.getName() + " use SPECIAL ATTACK " + targetFighter.getName() + "\n" +
                        "\nOld status: \n" +
                        this.getName() + "= HP: " + this.getHp() + " | Elixir: " + (this.getElixir() + this.getMediumAttackElixir()) + "\n" +
                        targetFighter.getName() + "= HP: " + targetFighter.getHp() + " | Elixir: " + targetFighter.getElixir());

                targetFighter.setHp(targetFighter.getHp() - this.getMediumAttack());

                System.out.println("\nNew Status: \n" +
                        this.getName() + "= HP: " + this.getHp() + " | Elixir: " + this.getElixir() +
                        " (lost " + this.getMediumAttackElixir() + " elixir)\n" +
                        targetFighter.getName() + "= HP: " + targetFighter.getHp() + " | Elixir: " + targetFighter.getElixir() +
                        " (lost " + this.getMediumAttack() + " hp)");


                if (!this.verifyCombat() || !teamFighter.verifyCombat() || !teamFighter2.verifyCombat()) {
                    System.out.println(this.getName() + " can't cure/give elixir to " + teamFighter.getName() + " and/or " + teamFighter2.getName() + " because someone already lose");
                    teamFighter.status();
                    teamFighter2.status();
                } else {
                    this.setElixir(this.getElixir() - 600);

                    if (this.verifyCombat()) {
                        System.out.println(
                                "\n------ " + this.getName() + " cure 300 HP and Give elixir" + " ------\n" +
                                        "Old statistics: \n" +
                                        "Name: " + this.getName() + " | HP: " + this.getHp() + " | Elixir: " + (this.getElixir() + 600) + "\n" +
                                        "Name: " + teamFighter.getName() + " | HP: " + teamFighter.getHp() + " | Elixir: " + teamFighter.getElixir() + "\n" +
                                        "Name: " + teamFighter2.getName() + " | HP: " + teamFighter2.getHp() + " | Elixir: " + teamFighter2.getElixir() + "\n");

                        teamFighter.setHp(teamFighter.getHp() + 300);
                        teamFighter2.setElixir(teamFighter2.getElixir() + 300);

                        System.out.println("New statistics: \n" +
                                "Name: " + this.getName() + " | HP: " + this.getHp() + " | Elixir: " + this.getElixir() + " (Lost 600 Elixir)" + "\n" +
                                "Name: " + teamFighter.getName() + " | HP: " + teamFighter.getHp() + " | Elixir: " + teamFighter.getElixir() + " (Received 300 HP)" + "\n" +
                                "Name: " + teamFighter2.getName() + " | HP: " + teamFighter2.getHp() + " | Elixir: " + teamFighter2.getElixir() + " (Received 300 Elixir)" +
                                "\n---------- FIGHT ENDED ----------\n");
                    } else {
                        System.out.println(
                                this.getName() + " YOU LOSE! (your elixir is over)" +
                                        "\n---------- FIGHT ENDED ----------\n");
                    }
                }

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
