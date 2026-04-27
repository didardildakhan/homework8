package com.narxoz.rpg;

import com.narxoz.rpg.combatant.Hero;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Hero> party = new ArrayList<>();
        party.add(new Hero("Arman", 30));

        System.out.println("Game ready");
    }
}