package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task {

    public final String taskName;
    public final String color;
    public final String whatToPaint;
    public boolean executedTask = false;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public String executeTask(){
        executedTask = true;
        return "Need to paint " + whatToPaint + " in " + color;
    }

    @Override
    public String getTaskName(){
        return "Task " + taskName;
    }

    @Override
    public boolean isTaskExecuted(){
        return executedTask;
    }
}
