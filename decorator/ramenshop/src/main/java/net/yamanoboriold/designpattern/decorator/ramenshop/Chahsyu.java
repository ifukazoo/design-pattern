package net.yamanoboriold.designpattern.decorator.ramenshop;

public class Chahsyu extends Gu {

    private RamenNoZairyo zairyo;
    private static final int COST = 130;

    public Chahsyu(RamenNoZairyo zairyo) {
        this.zairyo = zairyo;
    }

    public String getDescription() {
        return this.zairyo.getDescription() + " チャーシュー入り";
    }

    public int cost() {
        return this.zairyo.cost() + COST;
    }
}
