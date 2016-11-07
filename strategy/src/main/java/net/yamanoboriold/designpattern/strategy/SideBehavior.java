package net.yamanoboriold.designpattern.strategy;

public interface SideBehavior {

    int compareToGoal(int x, int y);

    boolean isInside(int x);

    int resolveLastDefendersPos(int[] playersPos);
}
