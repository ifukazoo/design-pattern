package net.yamanoboriold.designpattern.decorator.ramenshop;

public class Aghitama extends Gu {

  private RamenNoZairyo zairyo;
  private static final int COST = 100;

  public Aghitama(RamenNoZairyo zairyo) {
      this.zairyo = zairyo;
  }

  public String getDescription() {
      return this.zairyo.getDescription() + " 味玉入り";
  }

  public int cost() {
      return this.zairyo.cost() + COST;
  }
}
