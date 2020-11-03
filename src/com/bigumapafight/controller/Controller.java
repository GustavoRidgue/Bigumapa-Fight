package com.bigumapafight.controller;

import com.bigumapafight.service.Fighter;

public interface Controller {
    public abstract void introduceYourself();
    public abstract void status();
    public void attackStatus();
    public abstract boolean verifyCombat();
    public abstract void setSkills();
    public abstract void putType(String type);
    public abstract void packLife();
    public abstract void packAttack();
    public abstract void packElixir();
    public abstract void attack(Fighter targetFighter, int attackType);
    public abstract void cureHp(Fighter fighter, int hpAmount);
    public abstract void winCombat();
    public abstract void tieCombat();
    public abstract void loseCombat();
    public abstract void endCombat();
}
