package com.bigumapafight.progenitor;

public abstract class Fighter {
    protected String name;
    protected String category;
    protected String team;

    protected int elixir;
    public int hp;

    protected int commonAttack;
    protected int commonAttackElixir;

    protected int mediumAttack;
    protected int mediumAttackElixir;

    protected int superAttack;
    protected int superAttackElixir;

    protected int legendaryAttack;
    protected int legendaryAttackElixir;

    protected int specialAttack;
    protected int specialAttackElixir;

    protected boolean lose;

    public void introduceYourself(){
        System.out.println( "\n------------- " + this.getName() + " -------------\n" +
                "Category: " + this.getCategory() + "\n" +
                "Team: " + this.getTeam() + "\n" +
                "HP: " + this.getHp() + " | Elixir: " + this.getElixir() + "\n" +
                "Common attack: " + this.getCommonAttack() + " | Elixir: " + this.getCommonAttackElixir() + "\n" +
                "Medium attack: " + this.getMediumAttack() + " | Elixir: " + this.getMediumAttackElixir() + "\n" +
                "Super attack: " + this.getSuperAttack() + " | Elixir: " + this.getSuperAttackElixir() + "\n" +
                "Legendary attack: " + this.getLegendaryAttack() + " | Elixir: " + this.getLegendaryAttackElixir() + "\n" +
                "--------------------------");
    }
    public abstract void status();
    public void attackStatus() {
        System.out.println(
                "\n----- Attack statistics of " + this.name + " (Actual elixir " + this.getElixir() + ") -----\n" +
                "Attack 1 (common): damage = " + this.getCommonAttack() + " | elixir = " + this.getCommonAttackElixir() + "\n" +
                "Attack 2 (medium): damage = " + this.getMediumAttack() + " | elixir = " + this.getMediumAttackElixir() + "\n" +
                "Attack 3 (super): damage = " + this.getSuperAttack() + " | elixir = " + this.getSuperAttackElixir() + "\n" +
                "Attack 4 (legendary): damage = " + this.getLegendaryAttack() + " | elixir = " + this.getLegendaryAttackElixir() +
                "\n-----------------------------------");
    }
    public abstract void setSkills();
    public boolean verifyCombat() {
        return this.getElixir() > 0 && this.getHp() > 0;
    }
    public void attack1(Fighter targetFighter) {
        System.out.println("---------- FIGHT! ----------");
        if (this.verifyCombat() && targetFighter.verifyCombat()) {
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
                        " (lost " + this.getCommonAttack() + " hp)" +
                        "\n---------- FIGHT ENDED! ----------\n");
                if (!targetFighter.verifyCombat()) {
                    System.out.println("\n   ---------- " + this.getName().toUpperCase() + " YOU WIN! (" +
                            targetFighter.getName() + " HP is over) ----------   \n");
                    this.loseCombat();
                    System.out.println("\n---------- FIGHT ENDED! ----------\n");
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
                System.out.println("\n---------- FIGHT ENDED! ----------\n");
            }
        }
    }
    public void attack2(Fighter targetFighter) {
        System.out.println("---------- FIGHT! ----------\n");
        if (this.verifyCombat() && targetFighter.verifyCombat()) {
            this.elixir -= this.getMediumAttackElixir();

            if (this.verifyCombat()) {
                System.out.println(this.getName() + " use COMMON ATTACK " + targetFighter.getName() + "\n" +
                        "\nOld status: \n" +
                        this.getName() + "= HP: " + this.getHp() + " | Elixir: " + (this.getElixir() + this.getMediumAttackElixir()) + "\n" +
                        targetFighter.getName() + "= HP: " + targetFighter.getHp() + " | Elixir: " + targetFighter.getElixir());

                targetFighter.hp -= this.getMediumAttack();

                System.out.println("\nNew Status: \n" +
                        this.getName() + "= HP: " + this.getHp() + " | Elixir: " + this.getElixir() +
                        " (lost " + this.getMediumAttackElixir() + " elixir)\n" +
                        targetFighter.getName() + "= HP: " + targetFighter.getHp() + " | Elixir: " + targetFighter.getElixir() +
                        " (lost " + this.getMediumAttack() + " hp)" +
                        "\n---------- FIGHT ENDED! ----------\n");
                if (!targetFighter.verifyCombat()) {
                    System.out.println("\n   ---------- " + this.getName().toUpperCase() + " YOU WIN! (" +
                            targetFighter.getName() + " HP is over) ----------   \n");
                    this.loseCombat();
                    System.out.println("\n---------- FIGHT ENDED! ----------\n");
                }

            } else {
                System.out.println(this.getName() + " COMMON ATTACK " + targetFighter.getName() + "\n" +
                        "\nOld status: \n" +
                        this.getName() + "= HP: " + this.getHp() + " | Elixir: " + (this.getElixir() + this.getMediumAttackElixir()) + "\n" +
                        targetFighter.getName() + "= HP: " + targetFighter.getHp() + " | Elixir: " + targetFighter.getElixir() + "\n" +
                        "\nNew Status: \n" +
                        this.getName() + "= HP: " + this.getHp() + " | Elixir: " + this.getElixir());
                System.out.println(this.getName() + " YOU LOSE! (your elixir is over)");
                this.loseCombat();
                System.out.println("\n---------- FIGHT ENDED! ----------\n");
            }
        }
    }
    public void attack3(Fighter targetFighter) {
        System.out.println("---------- FIGHT ----------");
        if (this.verifyCombat() && targetFighter.verifyCombat()) {
            this.elixir -= this.getSuperAttackElixir();

            if (this.verifyCombat()) {
                System.out.println(this.getName() + " use COMMON ATTACK " + targetFighter.getName() + "\n" +
                        "\nOld status: \n" +
                        this.getName() + "= HP: " + this.getHp() + " | Elixir: " + (this.getElixir() + this.getSuperAttackElixir()) + "\n" +
                        targetFighter.getName() + "= HP: " + targetFighter.getHp() + " | Elixir: " + targetFighter.getElixir());

                targetFighter.hp -= this.getSuperAttack();

                System.out.println("\nNew Status: \n" +
                        this.getName() + "= HP: " + this.getHp() + " | Elixir: " + this.getElixir() +
                        " (lost " + this.getSuperAttackElixir() + " elixir)\n" +
                        targetFighter.getName() + "= HP: " + targetFighter.getHp() + " | Elixir: " + targetFighter.getElixir() +
                        " (lost " + this.getSuperAttack() + " hp)" +
                        "\n---------- FIGHT ENDED! ----------\n");
                if (!targetFighter.verifyCombat()) {
                    System.out.println("\n   ---------- " + this.getName().toUpperCase() + " YOU WIN! (" +
                            targetFighter.getName() + " HP is over) ----------   \n");
                    this.loseCombat();
                    System.out.println("\n---------- FIGHT ENDED! ----------\n" );
                }

            } else {
                System.out.println(this.getName() + " COMMON ATTACK " + targetFighter.getName() + "\n" +
                        "\nOld status: \n" +
                        this.getName() + "= HP: " + this.getHp() + " | Elixir: " + (this.getElixir() + this.getSuperAttackElixir()) + "\n" +
                        targetFighter.getName() + "= HP: " + targetFighter.getHp() + " | Elixir: " + targetFighter.getElixir() + "\n" +
                        "\nNew Status: \n" +
                        this.getName() + "= HP: " + this.getHp() + " | Elixir: " + this.getElixir());
                System.out.println(this.getName() + " YOU LOSE! (your elixir is over)");
                this.loseCombat();
                System.out.println("\n---------- FIGHT ENDED! ----------\n");
            }
        }
    }
    public void attack4(Fighter targetFighter) {
        if (this.verifyCombat() && targetFighter.verifyCombat()) {
            this.elixir -= this.getLegendaryAttackElixir();

            if (this.verifyCombat()) {
                System.out.println("---------- FIGHT! ----------\n" +
                        this.getName() + " use COMMON ATTACK " + targetFighter.getName() + "\n" +
                        "\nOld status: \n" +
                        this.getName() + "= HP: " + this.getHp() + " | Elixir: " + (this.getElixir() + this.getLegendaryAttackElixir()) + "\n" +
                        targetFighter.getName() + "= HP: " + targetFighter.getHp() + " | Elixir: " + targetFighter.getElixir());

                targetFighter.hp -= this.getLegendaryAttack();

                System.out.println("\nNew Status: \n" +
                        this.getName() + "= HP: " + this.getHp() + " | Elixir: " + this.getElixir() +
                        " (lost " + this.getLegendaryAttackElixir() + " elixir)\n" +
                        targetFighter.getName() + "= HP: " + targetFighter.getHp() + " | Elixir: " + targetFighter.getElixir() +
                        " (lost " + this.getLegendaryAttack() + " hp)" +
                        "\n---------- FIGHT ENDED! ----------\n");
                if (!targetFighter.verifyCombat()) {
                    System.out.println("\n   ---------- " + this.getName().toUpperCase() + " YOU WIN! (" +
                            targetFighter.getName() + " HP is over) ----------   \n");
                    this.loseCombat();
                }

            } else {
                System.out.println(this.getName() + " COMMON ATTACK " + targetFighter.getName() + "\n" +
                        "\nOld status: \n" +
                        this.getName() + "= HP: " + this.getHp() + " | Elixir: " + (this.getElixir() + this.getLegendaryAttackElixir()) + "\n" +
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
    public void cureHp(Fighter fighter, int hpAmount) {
        if (hpAmount >= this.getElixir()) {
            System.out.println("\n   ---------- " + this.getName().toUpperCase() + " YOU LOSE! (your elixir is over) ----------   \n");
            this.loseCombat();
        }
        else if (!this.verifyCombat() || !fighter.verifyCombat()) {
            System.out.println(this.name + " can't cure " + fighter.name + " because " + this.name + " and/or " + fighter.name + " already lose");
        } else {
            System.out.println("\n------ " + this.name + " cure " + hpAmount + " HP" + " ------\n" +
                    "Old statistics: \n" +
                    "Name: " + this.name + " | HP: " + this.hp + " | Elixir: " + this.elixir + "\n" +
                    "Name: " + fighter.name + " | HP: " + fighter.hp + " | Elixir: " + fighter.elixir + "\n");

            fighter.hp += hpAmount;
            this.elixir -= hpAmount;

            System.out.println("New statistics: \n" +
                    "Name: " + this.name + " | HP: " + this.hp + " | Elixir: " + this.elixir +
                    "Name: " + fighter.name + " | HP: " + fighter.hp + " | Elixir: " + fighter.elixir +
                    "\n--------------------\n");
        }
    }
    public void cureHp(int hpAmount) {
        if (hpAmount >= this.getElixir()) {
            System.out.println("\n   ---------- " + this.getName().toUpperCase() + " YOU LOSE! (your elixir is over) ----------   \n");
            this.loseCombat();
        }
        else if (!this.verifyCombat()) {
            System.out.println(this.name + " can't cure because " + this.name + " already lose");
        } else {
            System.out.println("\n------ " + this.name + " cure " + hpAmount + " HP" + " ------\n" +
                    "Old statistics: \n" +
                    "Name: " + this.name + " | HP: " + this.hp + " | Elixir: " + this.elixir + "\n");

            this.elixir -= hpAmount;
            this.hp += hpAmount;

            System.out.println("New statistics: \n" +
                    "Name: " + this.name + " | HP: " + this.hp + " | Elixir: " + this.elixir +
                    "\n--------------------\n");
        }
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }

    public String getTeam() {
        return team;
    }
    public void setTeam(String team) {
        this.team = team;
    }

    public int getElixir() {
        return elixir;
    }
    public void setElixir(int elixir) {
        this.elixir = elixir;
    }

    public int getHp() {
        return hp;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }

    public void loseCombat() {
        if (this.verifyCombat()) {
            this.lose = true;
        } else {
            this.lose = false;
        }
    };

    public int getCommonAttack() {
        return commonAttack;
    }
    public void setCommonAttack(int commonAttack) {
        this.commonAttack = commonAttack;
    }
    public int getCommonAttackElixir() {
        return commonAttackElixir;
    }
    public void setCommonAttackElixir(int commonAttackElixir) {
        this.commonAttackElixir = commonAttackElixir;
    }

    public int getMediumAttack() {
        return mediumAttack;
    }
    public void setMediumAttack(int mediumAttack) {
        this.mediumAttack = mediumAttack;
    }
    public int getMediumAttackElixir() {
        return mediumAttackElixir;
    }
    public void setMediumAttackElixir(int mediumAttackElixir) {
        this.mediumAttackElixir = mediumAttackElixir;
    }

    public int getSuperAttack() {
        return superAttack;
    }
    public void setSuperAttack(int superAttack) {
        this.superAttack = superAttack;
    }
    public int getSuperAttackElixir() {
        return superAttackElixir;
    }
    public void setSuperAttackElixir(int superAttackElixir) {
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

    public int getSpecialAttack() {
        return specialAttack;
    }

    public void setSpecialAttack(int specialAttack) {
        this.specialAttack = specialAttack;
    }

    public int getSpecialAttackElixir() {
        return specialAttackElixir;
    }

    public void setSpecialAttackElixir(int specialAttackElixir) {
        this.specialAttackElixir = specialAttackElixir;
    }

    public Fighter(String name) {
        if (name.length() <= 20 && name.length() >=3) {
            this.setName(name);
        } else {
            this.setName("Undefined");
        }
        this.setSkills();
    }
}
