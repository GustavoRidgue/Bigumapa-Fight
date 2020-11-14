package com.bigumapafight.redfighters;

public class Assassin extends RedFighter {
    public Assassin(String name) {
        super(name);
    }

    @Override
    public void setSkills() {
        this.setCategory("Assassin");

        this.setHp(3000);
        this.setElixir(6000);

        this.setCommonAttack(300);
        this.setCommonAttackElixir(300);

        this.setMediumAttack(500);
        this.setMediumAttackElixir(500);

        this.setSuperAttack(700);
        this.setSuperAttackElixir(700);

        this.setLegendaryAttack(900);
        this.setLegendaryAttackElixir(900);
    }
}
