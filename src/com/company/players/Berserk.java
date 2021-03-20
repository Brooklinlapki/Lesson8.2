package com.company.players;

import java.util.Random;

public class Berserk extends Hero{
    Random random = new Random();

    private final int reverseDamage = random.nextInt(50);


    public Berserk(int health, int damage, String name, EnumSuperAbility superAbility) {
        super(health, damage, name, superAbility);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
            boss.setHealth(boss.getHealth() - reverseDamage);
    }
}
