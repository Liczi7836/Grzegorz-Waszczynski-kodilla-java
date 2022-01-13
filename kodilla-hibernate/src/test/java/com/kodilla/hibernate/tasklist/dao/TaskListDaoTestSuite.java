package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;

    private static final String taskListName = "TaskList2";
    private static final String description = "Description fo TaskList2";

    @Test
    void testFindByListName(){
        //Given
        TaskList taskList = new TaskList(taskListName,description);
        taskListDao.save(taskList);
        String name = taskList.getListName();

        //When
        List<TaskList> readTaskLists = taskListDao.findByListName(name);

        //Then
        assertEquals(1,readTaskLists.size());

        //CleanUp
        int id = readTaskLists.get(0).getID();
        taskListDao.deleteById(id);

    }

}
