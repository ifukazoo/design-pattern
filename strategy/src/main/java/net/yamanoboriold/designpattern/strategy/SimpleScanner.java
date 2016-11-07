package net.yamanoboriold.designpattern.strategy;

import java.util.Scanner;

public class SimpleScanner {
    private final Scanner sc;

    public SimpleScanner() {
        this.sc = new Scanner(System.in);
    }

    public String nextLine() {
        if (!sc.hasNextLine()) {
            throw new RuntimeException();
        }
        return sc.nextLine();
    }
}
