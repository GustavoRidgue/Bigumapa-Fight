package com.bigumapafight.redfighters;

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

    //special attack = mini attack in 3 fighters
}
