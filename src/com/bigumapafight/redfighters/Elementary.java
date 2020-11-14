package com.bigumapafight.redfighters;

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

    //attack 2 fighters
}
