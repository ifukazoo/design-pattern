package net.yamanoboriold.designpattern.observer;

public class SecondsChecker implements Observer {

    private Ticker ticker;
    private long seconds;

    public SecondsChecker(Ticker ticker) {
        this.ticker = ticker;
        ticker.registerObserver(this);
    }

    @Override
    public void update(long minutes, long seconds) {
        if (seconds != this.seconds) {
            System.out.println(
                    String.format("seconds has changed! %d -> %d", this.seconds, seconds));
            this.seconds = seconds;
        }
    }
}
