package com.kodilla.patterns.prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class BoardTestSuite {

    @Test
    void testToString() throws CloneNotSupportedException {
        //Given
        TaskListGenerator taskListGenerator = new TaskListGenerator();
        taskListGenerator.generateList("To Do Tasks");
        taskListGenerator.generateList("In Progress Tasks");
        taskListGenerator.generateList("Done Tasks");

        TasksList listToDo2 = taskListGenerator.getListToDo();
        TasksList listInProgress2 = taskListGenerator.getListInProgress();
        TasksList listDone2 = taskListGenerator.getListDone();


        //creating the board and assigning the lists
        Board board = new Board("Project number 1");
        board.getLists().add(listToDo2);
        board.getLists().add(listInProgress2);
        board.getLists().add(listDone2);


        Board clonedBoard = board.shallowCopy();
        clonedBoard.setName("Project number 2");


        Board deepClonedBoard = board.deepCopy();
        deepClonedBoard.setName("Project number 3");


        //When
        board.getLists().remove(listToDo2);

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
