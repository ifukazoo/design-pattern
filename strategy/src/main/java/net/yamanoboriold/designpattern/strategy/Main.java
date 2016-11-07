package net.yamanoboriold.designpattern.strategy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import net.yamanoboriold.designpattern.strategy.Player;
import net.yamanoboriold.designpattern.strategy.SimpleScanner;
import net.yamanoboriold.designpattern.strategy.Team;

public final class Main {

    public static void main(final String[] args) {

        SimpleScanner sc = new SimpleScanner();
        String[] info = sc.nextLine().split(" "); // A 3
        String[] aTeam = sc.nextLine().split(" "); // 18 41 63 30 84 95 67 29 71 48 91
        String[] bTeam = sc.nextLine().split(" "); // 96 77 40 67 49 75 76 31 19 60 47

        String passTeam = info[0];
        int passerIndex = Integer.parseInt(info[1]) - 1;
        int[] aTeamPos = Arrays.stream(aTeam).mapToInt(Integer::parseInt).toArray();
        int[] bTeamPos = Arrays.stream(bTeam).mapToInt(Integer::parseInt).toArray();

        Team a = new Team(new LeftSideBehavior(), aTeamPos);
        Team b = new Team(new RightSideBehavior(), bTeamPos);
        Team deffence = passTeam.equals("A") ? b : a;

        List<Player> offencePlayer = new ArrayList<>();
        int[] offencePos = passTeam.equals("A") ? aTeamPos : bTeamPos;
        for (int i = 0; i < offencePos.length; i++) {
            offencePlayer.add(new Player(i + 1, offencePos[i]));
        }

        Player[] offsidePlayer =
                deffence.determineOffsidePlayer(offencePlayer, offencePos[passerIndex]);
        if (offsidePlayer.length == 0) {
            System.out.println("None");
        } else {
            for (Player p : offsidePlayer) {
                System.out.println(String.valueOf(p.getUniformNum()));
            }
        }
    }
}
