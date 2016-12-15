package net.yamanoboriold.designpattern.decorator.ramenshop;

public class TonkotsuSoup extends Soup {
    public int cost() {
        return 300;
    }

    public String getDescription() {
        return "豚骨スープ";
    }
}
