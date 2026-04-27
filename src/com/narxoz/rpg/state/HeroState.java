package com.narxoz.rpg.state;

import com.narxoz.rpg.combatant.Hero;

public interface HeroState {
    String getName();
    void onTurnStart(Hero hero);
}