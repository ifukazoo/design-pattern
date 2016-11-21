package net.yamanoboriold.designpattern.observer;

import java.util.concurrent.ExecutionException;

public final class Main {

    public static void main(final String[] args) {
        Ticker ticker = new Ticker();
        Observer minutesChecker = new MinutesChecker(ticker);
        Observer secondsChecker = new SecondsChecker(ticker);
        ticker.start();

        try {
            Thread.sleep(60 * 1000);
        } catch (InterruptedException e) {
            throw new Error(e);
        }
        ticker.shutdown();
        while (!ticker.isDone()) {}
        try {
            if (ticker.isSuccess()) {
                System.out.println("complete.");
                System.exit(0);
            }
        } catch (InterruptedException | ExecutionException e) {
            System.out.println(e.toString());
        }
        System.exit(1);
    }
}
