package com.bigumapafight.redfighters;

public class Viking extends RedFighter {
    public Viking(String name) {
        super(name);
    }

    @Override
    public void setSkills() {
        this.setCategory("Viking");

        this.setHp(5000);
        this.setElixir(5000);

        this.setCommonAttack(200);
        this.setCommonAttackElixir(200);

        this.setMediumAttack(400);
        this.setMediumAttackElixir(400);

        this.setSuperAttack(600);
        this.setSuperAttackElixir(600);

        this.setLegendaryAttack(800);
        this.setLegendaryAttackElixir(800);
    }

    //attack 2 fighters
}
