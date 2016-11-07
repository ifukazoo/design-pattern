package net.yamanoboriold.designpattern.strategy;

import java.util.Arrays;

public class RightSideBehavior implements SideBehavior {

    @Override
    public int compareToGoal(int x, int y) {
        return x - y;
    }

    @Override
    public boolean isInside(int x) {
        return 55 <= x && x <= 110;
    }

    @Override
    public int resolveLastDefendersPos(int[] playersPos) {
        int[] clone = (int[]) playersPos.clone();
        return Arrays.stream(clone).sorted().toArray()[9];
    }
}
