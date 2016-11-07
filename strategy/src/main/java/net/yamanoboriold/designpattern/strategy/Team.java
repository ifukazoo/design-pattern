package net.yamanoboriold.designpattern.strategy;

import java.util.List;

import net.yamanoboriold.designpattern.strategy.Player;
import net.yamanoboriold.designpattern.strategy.SideBehavior;

public class Team {

    private final SideBehavior behavior;
    private int[] playersPos;

    public Team(SideBehavior behavior, int[] playersPos) {
        this.behavior = behavior;
        this.playersPos = playersPos;
    }

    public Player[] determineOffsidePlayer(List<Player> enemies, int passFrom) {
        int lastDeffenderPos = behavior.resolveLastDefendersPos(playersPos);
        return enemies.stream()
                .filter(enemy -> behavior.isInside(enemy.getPos()))
                .filter(enemy -> behavior.compareToGoal(enemy.getPos(), passFrom) > 0)
                .filter(enemy -> behavior.compareToGoal(enemy.getPos(), lastDeffenderPos) > 0)
                .toArray(Player[]::new);
    }
}
