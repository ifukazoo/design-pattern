package net.yamanoboriold.designpattern.observer;

public class MinutesChecker implements Observer {

    private Ticker ticker;
    private long minutes;

    public MinutesChecker(Ticker ticker) {
        this.ticker = ticker;
        ticker.registerObserver(this);
    }

    @Override
    public void update(long minutes, long seconds) {
        if (minutes != this.minutes) {
            System.out.println(
                    String.format("minutes has changed! %d -> %d", this.minutes, minutes));
            this.minutes = minutes;
        }
    }
}
