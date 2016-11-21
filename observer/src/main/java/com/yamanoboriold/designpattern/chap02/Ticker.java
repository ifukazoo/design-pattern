package net.yamanoboriold.designpattern.observer;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Ticker implements Subject {

    private List<Observer> observers = new ArrayList<>();
    private boolean shutdown = false;
    private ExecutorService executor = Executors.newSingleThreadExecutor();

    private long seconds = 0;
    private long minutes = 0;
    private Future<Boolean> future = null;

    public void start() {
        future =
                executor.submit(
                        () -> {
                            while (!shutdown) {
                                Calendar now = Calendar.getInstance();
                                seconds = now.get(Calendar.SECOND);
                                minutes = now.get(Calendar.MINUTE);
                                notifyObservers();
                                Thread.sleep(100);
                            }
                            return true;
                        });
    }

    public void shutdown() {
        shutdown = true;
    }

    public boolean isDone() {
        return future != null && future.isDone();
    }

    public boolean isSuccess() throws InterruptedException, ExecutionException {
        return future != null && future.get();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(minutes, seconds);
        }
    }
}
