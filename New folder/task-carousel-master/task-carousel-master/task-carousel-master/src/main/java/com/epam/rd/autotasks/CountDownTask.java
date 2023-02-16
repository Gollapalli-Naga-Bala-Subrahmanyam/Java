package com.epam.rd.autotasks;

public class CountDownTask implements Task {

    private int countDown;

    public CountDownTask(int value) {
        this.countDown = Math.max(value, 0);
    }

    public int getValue() {
        return this.countDown;
    }

    @Override
    public void execute() {
        if (this.countDown > 0) {
            this.countDown--;
        }
    }

    @Override
    public boolean isFinished() {
        return this.countDown == 0;
    }
}
