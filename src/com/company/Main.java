package com.company;

public class Main {

    public static void main(String[] args) {
        Boss2 boss2 = new Boss2(200, 100, "");
        boss2.setHealth(200);
        boss2.setDamage(100);
        boss2.Defence = "Magic";
        System.out.println("Boss health " + boss2.getHealth() + "  Boss damage" + " " + boss2.getDamage() + "  "
                + " Boss defence " + boss2.getDefence());


    }
}
