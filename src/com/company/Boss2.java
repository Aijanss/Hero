package com.company;

public class Boss2 {
    int health;
    int Damage;
    String Defence;


    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return Damage;
    }

    public void setDamage(int damage) {
        Damage = damage;
    }

    public String getDefence() {
        return Defence;
    }

    public void setDefence(String defence) {
        Defence = defence;
    }

    public Boss2(int health, int damage, String defence) {
        this.health = health;
       this. Damage = damage;
        this.Defence = defence;
    }
}
