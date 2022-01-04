package com.kodilla.patterns.prototype;

import java.util.stream.IntStream;

public final class TaskListGenerator {
    private final TasksList listToDo = new TasksList("To Do Tasks");
    private final TasksList listInProgress = new TasksList("In Progress Tasks");
    private final TasksList listDone = new TasksList("Done Tasks");

    public TasksList getListToDo() {
        return listToDo;
    }

    public TasksList getListInProgress() {
        return listInProgress;
    }

    public TasksList getListDone() {
        return listDone;
    }

    public void generateList(String list) {
        switch (list) {
            case "To Do Tasks":
                IntStream.iterate(1, n -> n + 1)
                        .limit(10)
                        .forEach(n -> listToDo.getTasks().add(new Task("To Do Task number " + n)));
                break;
            case "In Progress Tasks":
                IntStream.iterate(1, n -> n + 1)
                        .limit(10)
                        .forEach(n -> listInProgress.getTasks().add(new Task("In Progress Task number " + n)));
                break;
            case "Done Tasks":
                IntStream.iterate(1, n -> n + 1)
                        .limit(10)
                        .forEach(n -> listDone.getTasks().add(new Task("Done Task number " + n)));
                break;
        }



    }

}
