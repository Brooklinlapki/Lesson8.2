package com.company.players;

import java.util.Random;

public class Magic extends Hero{
    Random random = new Random();
    private final int increase = random.nextInt(1);

    public Magic(int health, int damage, String name, EnumSuperAbility superAbility) {
        super(health, damage, name, superAbility);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            heroes[i].setDamage(heroes[i].getDamage() + increase);
        }
    }
}
