package com.company;

public class Hero {
   private int health=500;
     private int demag=200;
    private  String superPower="Magic ";

    public Hero(int health, int demag, String superPower) {
     this.health=health;
     this.demag=demag;
     this.superPower=superPower;
    }
    public Hero(int health, int demag){
        this.health=health;
        this.demag=demag;
    }

    public int getHealth() {
        return health;
    }

    public int getDemag() {
        return demag;
    }


    public String getSuperPower() {
        return superPower;
    }


    }


