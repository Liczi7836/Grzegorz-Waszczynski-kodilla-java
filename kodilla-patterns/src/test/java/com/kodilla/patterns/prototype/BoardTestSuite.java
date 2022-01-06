package com.kodilla.patterns.prototype;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class BoardTestSuite {

    private TasksList create(String taskPrefix, String taskName) {
        TasksList taskList = new TasksList(taskName);
        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> taskList.getTasks().add(new Task(taskPrefix + n)));
        return taskList;
    }

    @Test
    void testToString() throws CloneNotSupportedException {
        //Given
        TasksList listToDo = create("To Do Task number ","To Do Tasks");
        TasksList listInProgress = create("In Progress Task number ","In Progress Tasks");
        TasksList listDone = create("Done Task number ","Done Tasks");


        //creating the board and assigning the lists
        Board board = new Board("Project number 1");
        board.getLists().add(listToDo);
        board.getLists().add(listInProgress);
        board.getLists().add(listDone);


        Board clonedBoard = board.shallowCopy();
        clonedBoard.setName("Project number 2");


        Board deepClonedBoard = board.deepCopy();
        deepClonedBoard.setName("Project number 3");


        //When
        board.getLists().remove(listToDo);

        //Then
        System.out.println(board);
        System.out.println(clonedBoard);
        System.out.println(deepClonedBoard);
        assertEquals(2, board.getLists().size());
        assertEquals(2, clonedBoard.getLists().size());
        assertEquals(3, deepClonedBoard.getLists().size());
        assertEquals(clonedBoard.getLists(), board.getLists());
        assertNotEquals(deepClonedBoard.getLists(), board.getLists());
    }
}
