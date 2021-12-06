package com.kodilla.testing.forum.statistics;

import java.util.List;

public class CalculatingStatistics {

    private Statistics statistics;
    private int forumUserNumber;
    private int forumPostsNumber;
    private int forumCommentNumber;
    private double avgPostsPerUser;
    private double avgCommentsPerUser;
    private double avgCommentsPerPost;

    public CalculatingStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    public void calculateAdvStatistics(Statistics statistics){

        forumUserNumber = statistics.usersNames().size();
        forumPostsNumber = statistics.postsCount();
        forumCommentNumber = statistics.commentsCount();

        if (forumUserNumber == 0) {
            avgPostsPerUser = 0;
            avgCommentsPerUser = 0;
        } else {
            avgPostsPerUser = (double)forumPostsNumber / forumUserNumber;
            avgCommentsPerUser = (double)forumCommentNumber / forumUserNumber;
        }

        if (forumPostsNumber == 0) {
            avgCommentsPerPost = 0;
        } else {
            avgCommentsPerPost = (double)forumCommentNumber / forumPostsNumber;
        }
    }

    public int getForumUserNumber() {
        return forumUserNumber;
    }

    public int getForumPostsNumber() {
        return forumPostsNumber;
    }

    public int getForumCommentNumber() {
        return forumCommentNumber;
    }

    public double getAvgPostsPerUser() {
        return avgPostsPerUser;
    }

    public double getAvgCommentsPerUser() {
        return avgCommentsPerUser;
    }

    public double getAvgCommentsPerPost() {
        return avgCommentsPerPost;
    }
}

