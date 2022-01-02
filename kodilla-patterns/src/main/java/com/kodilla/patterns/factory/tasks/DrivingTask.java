package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task {

    public final String taskName;
    public final String where;
    public final String using;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public String executeTask(){
        return "Need to drive to " + where + " using " + using;
    }

    @Override
    public String getTaskName(){
        return "Task " + taskName;
    }

    @Override
    public boolean isTaskExecuted(){
        return true;
    }
}
