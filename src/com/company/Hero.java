package com.company;

public class Hero {
   private int health=500;
     private int damage=200;
    private  String superPower="Magic ";

    public Hero(int health, int demag, String superPower) {
     this.health=health;
     this.damage=demag;
     this.superPower=superPower;
    }
    public Hero(int health, int demag){
        this.health=health;
        this.damage=demag;
    }

    public int getHealth() {

        return health;
    }

    public int getDamage() {


        return damage;
    }



    public String getSuperPower() {


        return superPower;
    }


    }


