package com.company.players;

public abstract class Hero extends GameEntity implements HavingSuperAbility{

    private EnumSuperAbility superAbility;

    public Hero(int health, int damage, String name,EnumSuperAbility superAbility) {
        super(health, damage, name);
        this.superAbility = superAbility;
    }
}
