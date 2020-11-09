package com.bigumapafight.service;

import com.bigumapafight.controller.Controller;

import javax.xml.soap.SAAJResult;

public class Fighter implements Controller {
    private String name;
    private String nationality;
    private int age;
    private float height;
    private float weight;
    private String category;
    private String type;
    private int combats;
    private int victories;
    private int draws;
    private int defeats;

    private int elixir;
    private int hp;
    private int commonAttack;
    private int commonAttackElixir;
    private int mediumAttack;
    private int mediumAttackElixir;
    private int superAttack;
    private int superAttackElixir;
    private int legendaryAttack;
    private int legendaryAttackElixir;
    private int registration;
    protected static int numbersOfFighters;

    public Fighter(String name, String nationality, int age, float height, float weight, String type) {
        numbersOfFighters++;
        setRegistration(numbersOfFighters);
        this.setAttributes(name, nationality, age, height, weight);
        this.putType(type);
        this.setSkills();
    }

    @Override
    public void setSkills() {
        switch (this.getType()) {
            case "Assistant":
                this.setHp(4000);
                this.setElixir(9000);

                this.setCommonAttack(150);
                this.setCommonAttackElixir(100);

                this.setMediumAttack(300);
                this.setMediumAttackElixir(250);

                this.setSuperAttack(500);
                this.setSuperAttackElixir(450);

                this.setLegendaryAttack(750);
                this.setLegendaryAttackElixir(700);
                break;
            case "Tanker":
                this.setHp(5000);
                this.setElixir(8000);

                this.setCommonAttack(150);
                this.setCommonAttackElixir(150);

                this.setMediumAttack(350);
                this.setMediumAttackElixir(300);

                this.setSuperAttack(550);
                this.setSuperAttackElixir(500);

                this.setLegendaryAttack(750);
                this.setLegendaryAttackElixir(700);
                break;
            case "Curator":
                this.setHp(2000);
                this.setElixir(12000);

                this.setCommonAttack(100);
                this.setCommonAttackElixir(100);

                this.setMediumAttack(250);
                this.setMediumAttackElixir(250);

                this.setSuperAttack(450);
                this.setSuperAttackElixir(350);

                this.setLegendaryAttack(700);
                this.setLegendaryAttackElixir(700);
                break;

            case "Attacker":
                this.setHp(3000);
                this.setElixir(10000);

                this.setCommonAttack(200);
                this.setCommonAttackElixir(150);

                this.setMediumAttack(400);
                this.setMediumAttackElixir(350);

                this.setSuperAttack(600);
                this.setSuperAttackElixir(550);

                this.setLegendaryAttack(800);
                this.setLegendaryAttackElixir(750);
                break;
        }
    }

    public void setAttributes(String name, String nationality, int age, float height, float weight) {
        if (name.length() >= 20 || name.equals("")) {
            System.out. println("Invalid name");
            this.setName("Put a creative name");
        } else {
            this.setName(name);
        }

        if (nationality.equals("")) {
            System.out.println("Invalid nationality");
            this.setNationality("Brazil");
        } else {
            this.setNationality(nationality);
        }

        if (age <= 0) {
            System.out.println("Invalid age");
            this.setAge(50);
        } else {
            this.setAge(age);
        }

        if (height <= 0f) {
            System.out.println("Invalid height");
            this.setHeight(1.50f);
        } else {
            this.setHeight(height);
        }

        if (weight <= 0f) {
            System.out.println("Invalid weight");
            this.setWeight(1.50f);
        } else {
            this.setWeight(weight);
        }
    }

    @Override
    public void introduceYourself() {
        System.out.println( "\n------------- " + this.getName() + " -------------\n" +
               "Nationality: " + this.getNationality() + "\n" +
               "Age: " + this.getAge() + "\n" +
               "Height: " + this.getHeight() + "\n" +
               "Weight: " + this.getWeight() + "\n" +
               "Category: " + this.getCategory() + "\n" +
               "Combats: " + this.getCombats() + "\n" +
               "Victories: " + this.getVictories() + "\n" +
               "Draws: " + this.getDraws() + "\n" +
               "Defeats: " + this.getDefeats() + "\n" +
               "--------------------------");
    }

    @Override
    public void status() {
        System.out.println("\n----- Status of " + this.getName() + " -----\n" +
                "HP: " + this.getHp() +
                " | Elixir: " + this.getElixir() +
                "\n-----------------------");
    }

    @Override
    public void attackStatus() {
        System.out.println("\n----- Attack statistics of " + this.name + " (Actual elixir " + this.getElixir() + ") -----\n" +
                "Attack 1 (common): damage = " + this.getCommonAttack() + " | elixir = " + this.getCommonAttackElixir() + "\n" +
                "Attack 2 (medium): damage = " + this.getMediumAttack() + " | elixir = " + this.getMediumAttackElixir() + "\n" +
                "Attack 3 (super): damage = " + this.getSuperAttack() + " | elixir = " + this.getSuperAttackElixir() + "\n" +
                "Attack 4 (legendary): damage = " + this.getLegendaryAttack() + " | elixir = " + this.getLegendaryAttackElixir() +
                "\n-----------------------------------");
    }

    @Override
    public boolean verifyCombat() {
        return this.getElixir() > 0 && this.getHp() > 0;
    }

    @Override
    public void putType(String type) {
        switch (type.toLowerCase()) {
            case "assistant":
                this.setType("Assistant");
                break;
            case "tanker":
                this.setType("Tanker");
                break;
            case "attacker":
                this.setType("Attacker");
                break;
            case "curator":
                this.setType("Curator");
                break;
            default:
                this.setType("Assistant");
                System.out.println(type + " Invalid type. Now, your type is Assistant");
                break;
        }
    }

    @Override
    public void packLife() {
        this.hp += 1000;
    }

    @Override
    public void packAttack() {
        this.commonAttack += 50;
        this.mediumAttack += 50;
        this.superAttack += 50;
        this.legendaryAttack += 50;
    }

    @Override
    public void packElixir() {
        this.elixir += 1000;
    }

    @Override
    public void attack(Fighter targetFighter, int attackType) {
        System.out.println("\n---------- FIGHT ! ----------");

        if (this.verifyCombat() && targetFighter.verifyCombat() && this.getRegistration() != targetFighter.getRegistration()) {
            switch (attackType) {
                case 1:
                    this.elixir -= this.getCommonAttackElixir();

                    if (this.verifyCombat()) {
                        System.out.println(this.getName() + " use COMMON ATTACK " + targetFighter.getName() + "\n" +
                                "\nOld status: \n" +
                                this.getName() + "= HP: " + this.getHp() + " | Elixir: " + (this.getElixir() + this.getCommonAttackElixir()) + "\n" +
                                targetFighter.getName() + "= HP: " + targetFighter.getHp() + " | Elixir: " + targetFighter.getElixir());

                        targetFighter.hp -= this.getCommonAttack();

                        System.out.println("\nNew Status: \n" +
                                this.getName() + "= HP: " + this.getHp() + " | Elixir: " + this.getElixir() +
                                " (lost " + this.getCommonAttackElixir() + " elixir)\n" +
                                targetFighter.getName() + "= HP: " + targetFighter.getHp() + " | Elixir: " + targetFighter.getElixir() +
                                " (lost " + this.getCommonAttack() + " hp)");
                        if (!targetFighter.verifyCombat()) {
                            System.out.println("\n   ---------- " + this.getName().toUpperCase() + " YOU WIN! (" +
                                    targetFighter.getName() + " HP is over) ----------   \n");
                            this.winCombat();
                        }

                    } else {
                        System.out.println(this.getName() + " COMMON ATTACK " + targetFighter.getName() + "\n" +
                                "\nOld status: \n" +
                                this.getName() + "= HP: " + this.getHp() + " | Elixir: " + (this.getElixir() + this.getCommonAttackElixir()) + "\n" +
                                targetFighter.getName() + "= HP: " + targetFighter.getHp() + " | Elixir: " + targetFighter.getElixir() + "\n" +
                                "\nNew Status: \n" +
                                this.getName() + "= HP: " + this.getHp() + " | Elixir: " + this.getElixir());
                        System.out.println(this.getName() + " YOU LOSE! (your elixir is over)");
                        this.loseCombat();
                    }
                    break;
                case 2:
                    this.elixir -= this.getMediumAttackElixir();

                    if (this.verifyCombat()) {
                        System.out.println(this.getName() + " MEDIUM ATTACK " + targetFighter.getName() + "\n" +
                                "\nOld status: \n" +
                                this.getName() + "= HP: " + this.getHp() + " | Elixir: " + (this.getElixir() + this.getMediumAttackElixir()) + "\n" +
                                targetFighter.getName() + "= HP: " + targetFighter.getHp() + " | Elixir: " + targetFighter.getElixir());

                        targetFighter.hp -= this.getMediumAttack();

                        System.out.println("\nNew Status: \n" +
                                this.getName() + "= HP: " + this.getHp() + " | Elixir: " + this.getElixir() +
                                " (lost " + this.getMediumAttackElixir() + " elixir)\n" +
                                targetFighter.getName() + "= HP: " + targetFighter.getHp() + " | Elixir: " + targetFighter.getElixir() +
                                " (lost " + this.getMediumAttack() + " hp)");
                        if (!targetFighter.verifyCombat()) {
                            System.out.println("\n   ---------- " + this.getName().toUpperCase() + " YOU WIN! (" +
                                    targetFighter.getName() + " HP is over) ----------   \n");
                            this.winCombat();
                        }

                    } else {
                        System.out.println(this.getName() + " MEDIUM ATTACK " + targetFighter.getName() + "\n" +
                                "\nOld status: \n" +
                                this.getName() + "= HP: " + this.getHp() + " | Elixir: " + (this.getElixir() + this.getMediumAttackElixir()) + "\n" +
                                targetFighter.getName() + "= HP: " + targetFighter.getHp() + " | Elixir: " + targetFighter.getElixir() + "\n" +
                                "\nNew Status: \n" +
                                this.getName() + "= HP: " + this.getHp() + " | Elixir: " + this.getElixir());
                        System.out.println(this.getName() + " YOU LOSE! (your elixir is over)");
                        this.loseCombat();
                    }
                    break;

                case 3:
                    this.elixir -= this.getSuperAttackElixir();

                    if (this.verifyCombat()) {
                        System.out.println(this.getName() + " SUPER ATTACK " + targetFighter.getName() + "\n" +
                                "\nOld status: \n" +
                                this.getName() + "= HP: " + this.getHp() + " | Elixir: " + (this.getElixir() + this.getSuperAttackElixir()) + "\n" +
                                targetFighter.getName() + "= HP: " + targetFighter.getHp() + " | Elixir: " + targetFighter.getElixir());

                        targetFighter.hp -= this.getSuperAttack();

                        System.out.println("\nNew Status: \n" +
                                this.getName() + "= HP: " + this.getHp() + " | Elixir: " + this.getElixir() +
                                " (lost " + this.getSuperAttackElixir() + " elixir)\n" +
                                targetFighter.getName() + "= HP: " + targetFighter.getHp() + " | Elixir: " + targetFighter.getElixir() +
                                " (lost " + this.getSuperAttack() + " hp)");
                        if (!targetFighter.verifyCombat()) {
                            System.out.println("\n   ---------- " + this.getName().toUpperCase() + " YOU WIN! (" +
                                    targetFighter.getName() + " HP is over) ----------   \n");
                            this.winCombat();
                        }

                    } else {
                        System.out.println(this.getName() + " SUPER ATTACK " + targetFighter.getName() + "\n" +
                                "\nOld status: \n" +
                                this.getName() + "= HP: " + this.getHp() + " | Elixir: " + (this.getElixir() + this.getSuperAttackElixir()) + "\n" +
                                targetFighter.getName() + "= HP: " + targetFighter.getHp() + " | Elixir: " + targetFighter.getElixir() + "\n" +
                                "\nNew Status: \n" +
                                this.getName() + "= HP: " + this.getHp() + " | Elixir: " + this.getElixir());
                        System.out.println(this.getName() + " YOU LOSE! (your elixir is over)");
                        this.loseCombat();
                    }
                    break;
                case 4:
                    this.elixir -= this.getLegendaryAttackElixir();

                    if (this.verifyCombat()) {
                        System.out.println(this.getName() + " LEGENDARY ATTACK " + targetFighter.getName() + "\n" +
                                "\nOld status: \n" +
                                this.getName() + "= HP: " + this.getHp() + " | Elixir: " + (this.getElixir() + this.getLegendaryAttackElixir()) + "\n" +
                                targetFighter.getName() + "= HP: " + targetFighter.getHp() + " | Elixir: " + targetFighter.getElixir());

                        targetFighter.hp -= this.getLegendaryAttack();

                        System.out.println("\nNew Status: \n" +
                                this.getName() + "= HP: " + this.getHp() + " | Elixir: " + this.getElixir() +
                                " (lost " + this.getLegendaryAttackElixir() + " elixir)\n" +
                                targetFighter.getName() + "= HP: " + targetFighter.getHp() + " | Elixir: " + targetFighter.getElixir() +
                                " (lost " + this.getSuperAttack() + " hp)");
                        if (!targetFighter.verifyCombat()) {
                            System.out.println("\n   ---------- " + this.getName().toUpperCase() + " YOU WIN! (" +
                                    targetFighter.getName() + " HP is over) ----------   \n");
                            this.winCombat();
                        }

                    } else {
                        System.out.println(this.getName() + " SUPER ATTACK " + targetFighter.getName() + "\n" +
                                "\nOld status: \n" +
                                this.getName() + "= HP: " + this.getHp() + " | Elixir: " + (this.getElixir() + this.getLegendaryAttackElixir()) + "\n" +
                                targetFighter.getName() + "= HP: " + targetFighter.getHp() + " | Elixir: " + targetFighter.getElixir() + "\n" +
                                "\nNew Status: \n" +
                                this.getName() + "= HP: " + this.getHp() + " | Elixir: " + this.getElixir());
                        System.out.println(this.getName() + " YOU LOSE! (your elixir is over)");
                        this.loseCombat();
                    }
                    break;
            }
        } else {
            System.out.println("INVALID FIGHT! " + this.getName() + " and/or " + targetFighter.getName() + " already lose.");
        }
        System.out.println("-------- FIGHT ENDED ! --------\n");
    }

    @Override
    public void cureHp(Fighter fighter, int hpAmount) {
        if (hpAmount >= this.getElixir()) {
            System.out.println("\n   ---------- " + this.getName().toUpperCase() + " YOU LOSE! (your elixir is over) ----------   \n");
            this.winCombat();
            this.endCombat();
        }
        else if (!this.verifyCombat() || !fighter.verifyCombat()) {
            System.out.println(this.name + " can't cure " + fighter.name + " because " + this.name + " and/or " + fighter.name + " already lose");
        } else {
            if (this.getRegistration() != fighter.getRegistration()) {
                System.out.println("\n------ " + this.name + " CURE " + fighter.name + hpAmount + " HP" + " ------\n" +
                        "Old statistics: \n" +
                        "Name: " + this.name + " | HP: " + this.hp + " | Elixir: " + this.elixir + "\n" +
                        "Name: " + fighter.name + " | HP: " + fighter.hp + " | Elixir: " + fighter.elixir +
                        "\n");

                fighter.hp += hpAmount;
                this.elixir -= hpAmount;

                System.out.println("New statistics: \n" +
                        "Name: " + this.name + " | HP: " + this.hp + " | Elixir: " + this.elixir + "\n" +
                        "Name: " + fighter.name + " | HP: " + fighter.hp + " | Elixir: " + fighter.elixir +
                        "\n----------");
            } else {
                System.out.println("\n------ " + this.name + " cure " + hpAmount + " HP" + " ------\n" +
                        "Old statistics: \n" +
                        "Name: " + fighter.name + " | HP: " + fighter.hp + " | Elixir: " + fighter.elixir + "\n");

                fighter.hp += hpAmount;
                this.elixir -= hpAmount;

                System.out.println("New statistics: \n" +
                        "Name: " + fighter.name + " | HP: " + fighter.hp + " | Elixir: " + fighter.elixir + "\n--------------------\n");
            }
        }
    }

    @Override
    public void winCombat() {
        this.victories++;
        this.combats++;
    }

    @Override
    public void tieCombat() {
        this.draws++;
        this.combats++;
    }

    @Override
    public void loseCombat() {
        this.defeats++;
        this.combats++;
    }

    @Override
    public void endCombat() {
        this.combats++;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public float getHeight() {
        return height;
    }
    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }
    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getCategory() {
        return category;
    }
    private void setCategory(String category) {
        this.category = category;
    }

    public String getType() {
        return this.type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public int getCombats() {
        return combats;
    }
    private void setCombats(int combats) {
        this.combats = combats;
    }

    public int getVictories() {
        return victories;
    }
    private void setVictories(int victories) {
        this.victories = victories;
    }

    public int getDraws() {
        return draws;
    }
    private void setDraws(int draws) {
        this.draws = draws;
    }

    public int getDefeats() {
        return defeats;
    }
    private void setDefeats(int defeats) {
        this.defeats = defeats;
    }

    public int getCommonAttack() {
        return commonAttack;
    }
    private void setCommonAttack(int commonAttack) {
        this.commonAttack = commonAttack;
    }

    public int getCommonAttackElixir() {
        return commonAttackElixir;
    }
    private void setCommonAttackElixir(int commonAttackElixir) {
        this.commonAttackElixir = commonAttackElixir;
    }

    public int getMediumAttack() {
        return mediumAttack;
    }
    private void setMediumAttack(int mediumAttack) {
        this.mediumAttack = mediumAttack;
    }

    public int getMediumAttackElixir() {
        return mediumAttackElixir;
    }
    private void setMediumAttackElixir(int mediumAttackElixir) {
        this.mediumAttackElixir = mediumAttackElixir;
    }

    public int getSuperAttack() {
        return superAttack;
    }
    private void setSuperAttack(int superAttack) {
        this.superAttack = superAttack;
    }

    public int getSuperAttackElixir() {
        return superAttackElixir;
    }
    private void setSuperAttackElixir(int superAttackElixir) {
        this.superAttackElixir = superAttackElixir;
    }

    public int getLegendaryAttack() {
        return legendaryAttack;
    }

    public void setLegendaryAttack(int legendaryAttack) {
        this.legendaryAttack = legendaryAttack;
    }

    public int getLegendaryAttackElixir() {
        return legendaryAttackElixir;
    }

    public void setLegendaryAttackElixir(int legendaryAttackElixir) {
        this.legendaryAttackElixir = legendaryAttackElixir;
    }

    public int getElixir() {
        return elixir;
    }
    private void setElixir(int elixir) {
        this.elixir = elixir;
    }

    public int getHp() {return hp;}
    private void setHp(int hp) {this.hp = hp;}

    public int getRegistration() {
        return registration;
    }
    private void setRegistration(int registration) {
        this.registration = registration;
    }
}
