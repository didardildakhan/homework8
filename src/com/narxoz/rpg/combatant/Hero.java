package com.narxoz.rpg.combatant;

public class Hero {

    private String name;
    private int hp;

    public Hero(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public boolean isAlive() {
        return hp > 0;
    }

    // ✅ ВОТ ЭТОГО НЕ ХВАТАЛО
    public void takeDamage(int damage) {
        hp -= damage;
        if (hp < 0) hp = 0;

        System.out.println(name + " took " + damage + " damage. HP: " + hp);
    }
}