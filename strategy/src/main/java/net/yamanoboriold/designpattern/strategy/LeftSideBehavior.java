package net.yamanoboriold.designpattern.strategy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeftSideBehavior implements SideBehavior {

    @Override
    public int compareToGoal(int x, int y) {
        return y - x;
    }

    @Override
    public boolean isInside(int x) {
        return 0 <= x && x <= 55;
    }

    @Override
    public int resolveLastDefendersPos(int[] playersPos) {
        List<Integer> list = new ArrayList<>();
        for (int pos : playersPos) {
            list.add(pos);
        }
        Collections.sort(list, Collections.reverseOrder());
        return list.get(9);
    }
}
