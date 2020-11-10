package com.bigumapafight.redfighters;

import com.bigumapafight.progenitor.Fighter;

public abstract class RedFighter extends Fighter {
    public RedFighter(String name) {
        super(name);
        this.setTeam("Red Fighters");
    }
}
