package com.bigumapafight.redfighters;

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

    //special attack = steal elixir
    //special attack = steal elixir
}
