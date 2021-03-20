package com.company.players;

public class Warrior extends Hero{
    private final int multiplications = (int) (2 + Math.random()*4);

    public Warrior(int health, int damage, String name, EnumSuperAbility superAbility) {
        super(health, damage, name, superAbility);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        boss.setHealth(boss.getHealth() - getDamage() * multiplications);
    }
}
