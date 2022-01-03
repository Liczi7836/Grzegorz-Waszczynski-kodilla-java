package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task {

    public final String taskName;
    public final String whatToBuy;
    public final double quantity;
    public boolean executedTask = false;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public String executeTask() {
        executedTask = true;
        return "Need to buy " + quantity + whatToBuy;
    }

    @Override
    public String getTaskName() {
        return "Task: " + taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return executedTask;
    }
}
