package com.narxoz.rpg.combatant;

public class Monster {

    private String name;
    private int hp;
    private int attack;

    public Monster(String name, int hp, int attack) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
    }

    public boolean isAlive() {
        return hp > 0;
    }

    public void attack(Hero hero) {
        System.out.println(name + " attacks " + hero.getName());
        hero.takeDamage(attack); // теперь работает
    }
}