package com.kodilla.testing.forum.statistics;

import org.mockito.Mock;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ForumStatisticsTestSuite {

    @Mock
    Statistics statisticsMock;

    private List<String> generateListOfUsers(int numberOfUsers) {
        List<String> listOfUsers = new ArrayList<>();

        for (int i = 0 ; i < numberOfUsers ; i++) {
            listOfUsers.add("User"+i);
        }

        return listOfUsers;
    }

    private int generateNumberOfPosts(int givenPosts) {
        return givenPosts;
    }

    private int generateNumberOfCommnets(int givenComments) {
        return givenComments;
    }

    @Nested
    class testsCalculateAdvStatistics {

        @Test
        void testWithZeroPosts() {

            //Given
            CalculatingStatistics calculatingStatistics = new CalculatingStatistics();
            List <String> listOfUsers = generateListOfUsers(10);
            int postsNo = generateNumberOfPosts(0);

            when(statisticsMock.usersNames()).thenReturn(listOfUsers);
            when(statisticsMock.postsCount()).thenReturn(postsNo);

            //When
            calculatingStatistics.calculateAdvStatistics(statisticsMock);

            //Then
            assertEquals(0, calculatingStatistics.getAvgPostsPerUser());
            assertEquals(0, calculatingStatistics.getAvgCommentsPerUser());
            assertEquals(0, calculatingStatistics.getAvgCommentsPerPost());
        }

        @Test
        void testWith1000Posts() {

            //Given
            CalculatingStatistics calculatingStatistics = new CalculatingStatistics();
            List<String> listOfUsers = generateListOfUsers(10);
            int postsNo = generateNumberOfPosts(1000);

            when(statisticsMock.usersNames()).thenReturn(listOfUsers);
            when(statisticsMock.postsCount()).thenReturn(postsNo);

            //When
            calculatingStatistics.calculateAdvStatistics(statisticsMock);

            //Then
            assertEquals(100.00, calculatingStatistics.getAvgPostsPerUser());
            assertEquals(0.00, calculatingStatistics.getAvgCommentsPerUser());
            assertEquals(0.00, calculatingStatistics.getAvgCommentsPerPost());
        }

        @Test
        void testWith0Comments() {

            //Given
            CalculatingStatistics calculatingStatistics = new CalculatingStatistics();
            List<String> listOfUsers = generateListOfUsers(10);
            int postsNo = generateNumberOfPosts(1000);
            int commentsNo = generateNumberOfCommnets(0);

            when(statisticsMock.usersNames()).thenReturn(listOfUsers);
            when(statisticsMock.postsCount()).thenReturn(postsNo);
            when(statisticsMock.commentsCount()).thenReturn(commentsNo);

            //When
            calculatingStatistics.calculateAdvStatistics(statisticsMock);

            //Then
            assertEquals(100.00, calculatingStatistics.getAvgPostsPerUser());
            assertEquals(0.00, calculatingStatistics.getAvgCommentsPerUser());
            assertEquals(0.00, calculatingStatistics.getAvgCommentsPerPost());
        }

        @Test
        void testWithLessCommentsThanPosts() {

            //Given
            CalculatingStatistics calculatingStatistics = new CalculatingStatistics();
            List<String> listOfUsers = generateListOfUsers(10);
            int postsNo = generateNumberOfPosts(20);
            int commentsNo = generateNumberOfCommnets(10);

            when(statisticsMock.usersNames()).thenReturn(listOfUsers);
            when(statisticsMock.postsCount()).thenReturn(postsNo);
            when(statisticsMock.commentsCount()).thenReturn(commentsNo);

            //When
            calculatingStatistics.calculateAdvStatistics(statisticsMock);

            //Then
            assertEquals(2.0, calculatingStatistics.getAvgPostsPerUser());
            assertEquals(1.0, calculatingStatistics.getAvgCommentsPerUser());
            assertEquals(0.5, calculatingStatistics.getAvgCommentsPerPost());
        }

        @Test
        void testWithMoreCommentsThanPosts() {

            //Given
            CalculatingStatistics calculatingStatistics = new CalculatingStatistics();
            List<String> listOfUsers = generateListOfUsers(10);
            int postsNo = generateNumberOfPosts(10);
            int commentsNo = generateNumberOfCommnets(20);

            when(statisticsMock.usersNames()).thenReturn(listOfUsers);
            when(statisticsMock.postsCount()).thenReturn(postsNo);
            when(statisticsMock.commentsCount()).thenReturn(commentsNo);

            //When
            calculatingStatistics.calculateAdvStatistics(statisticsMock);

            //Then
            assertEquals(1.0, calculatingStatistics.getAvgPostsPerUser());
            assertEquals(2.0, calculatingStatistics.getAvgCommentsPerUser());
            assertEquals(2.0, calculatingStatistics.getAvgCommentsPerPost());
        }

        @Test
        void testWithZeroUsers() {

            //Given
            CalculatingStatistics calculatingStatistics = new CalculatingStatistics();
            List<String> listOfUsers = generateListOfUsers(0);

            when(statisticsMock.usersNames()).thenReturn(listOfUsers);

            //When
            calculatingStatistics.calculateAdvStatistics(statisticsMock);

            //Then
            assertEquals(0.0, calculatingStatistics.getAvgPostsPerUser());
            assertEquals(0.0, calculatingStatistics.getAvgCommentsPerUser());
            assertEquals(0.0, calculatingStatistics.getAvgCommentsPerPost());
        }

        @Test
        void testWith100Users() {

            //Given
            CalculatingStatistics calculatingStatistics = new CalculatingStatistics();
            List<String> listOfUsers = generateListOfUsers(100);

            when(statisticsMock.usersNames()).thenReturn(listOfUsers);

            //When
            calculatingStatistics.calculateAdvStatistics(statisticsMock);

            //Then
            assertEquals(0.0, calculatingStatistics.getAvgPostsPerUser());
            assertEquals(0.0, calculatingStatistics.getAvgCommentsPerUser());
            assertEquals(0.0, calculatingStatistics.getAvgCommentsPerPost());
        }

    }

}
