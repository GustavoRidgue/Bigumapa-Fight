package com.bigumapafight.redfighters;

public class Thief extends RedFighter {
    public Thief(String name) {
        super(name);
    }

    @Override
    public void setSkills() {
        this.setCategory("Thief");

        this.setHp(3000);
        this.setElixir(5000);

        this.setCommonAttack(150);
        this.setCommonAttackElixir(150);

        this.setMediumAttack(350);
        this.setMediumAttackElixir(350);

        this.setSuperAttack(550);
        this.setSuperAttackElixir(550);

        this.setLegendaryAttack(750);
        this.setLegendaryAttackElixir(750);
    }

    //special attack = steal elixir
    //special attack = steal elixir
}
