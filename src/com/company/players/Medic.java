package com.company.players;

public class Medic extends Hero{

    private int healPoints;


    public Medic(int health, int damage, String name, int healPoints, EnumSuperAbility superAbility) {
        super(health, damage, name, superAbility);
        this.healPoints = healPoints;
    }

    public int getHealPoints() {
        return healPoints;
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0 && heroes[i] != this){
                heroes[i].setHealth(heroes[i].getHealth() + getHealPoints());
            }
        }
    }
}
