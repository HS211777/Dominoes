package com.company;

public class Tile {
    private int num1;
    private int num2;
    private boolean doub;

    public Tile(int num1, int num2, boolean doub) {
        this.num1 = num1;
        this.num2 = num2;
        this.doub = doub;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public boolean isDoub() {
        return doub;
    }

    public void setDoub(boolean doub) {
        this.doub = doub;
    }

    @Override
    public String toString() {
        return "["+num1+":"+num2+"]";
    }
}
