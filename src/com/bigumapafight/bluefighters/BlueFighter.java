package com.bigumapafight.bluefighters;

import com.bigumapafight.progenitor.Fighter;

public abstract class BlueFighter extends Fighter {
    public BlueFighter(String name) {
        super(name);
        this.setTeam("Blue Fighters");
    }
}
