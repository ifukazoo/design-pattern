package net.yamanoboriold.designpattern.decorator.ramenshop;

public class MisoSoup extends Soup {
    public int cost() {
        return 350;
    }

    public String getDescription() {
        return "味噌スープ";
    }
}
