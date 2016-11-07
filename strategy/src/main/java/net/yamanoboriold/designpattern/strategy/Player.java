package net.yamanoboriold.designpattern.strategy;

public class Player {
    private int uniformNum;
    private int pos;

    public Player(int uniformNum, int pos) {
        this.uniformNum = uniformNum;
        this.pos = pos;
    }

    public int getUniformNum() {
        return uniformNum;
    }

    public int getPos() {
        return pos;
    }

    @Override
    public String toString() {
        return String.format("(%d,%d)",uniformNum,pos);
    }
}
