package com.company.players;

import com.company.game.Game;

import java.util.Random;

public class Thor extends Hero {
    private int spun;


    public int getSpun() {
        return spun;
    }


    public Thor(int health, int damage, String name, EnumSuperAbility superAbility, int spun) {
        super(health, damage, name, superAbility);
        this.spun = spun;
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        boss.setHealth(boss.getHealth());
    }
}
