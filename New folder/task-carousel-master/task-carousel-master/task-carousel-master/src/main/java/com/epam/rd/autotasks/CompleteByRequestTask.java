package com.epam.rd.autotasks;

public class CompleteByRequestTask implements Task {

    private boolean isFinished;
    private boolean markFinished;

    public CompleteByRequestTask() {
        super();
        this.isFinished = false;
        this.markFinished = false;
    }

    @Override
    public void execute() {
        if (this.markFinished) {
            this.isFinished = true;
        }
    }

    @Override
    public boolean isFinished() {
        return this.isFinished;
    }

    public void complete() {
        this.markFinished = true;
    }
}

