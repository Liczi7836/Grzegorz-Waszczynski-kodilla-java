package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class BoardTestSuite {

    @Test
    void testTaskAdd(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        board.inProgressList.tasks.add("Task1");
        board.toDoList.tasks.add("Task2");
        board.doneList.tasks.add("Task3");
        //Then
        Assertions.assertEquals("Task1", board.inProgressList.tasks.get(0));
        Assertions.assertEquals("Task2", board.toDoList.tasks.get(0));
        Assertions.assertEquals("Task3", board.doneList.tasks.get(0));
    }

}
