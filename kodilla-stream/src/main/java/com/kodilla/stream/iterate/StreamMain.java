package com.kodilla.stream.iterate;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args){
        Forum forum = new Forum();

        Map<Integer, ForumUser> theResultMapOfUsers = forum.getList().stream()
                .filter(ForumUser -> ForumUser.getSex() == 'M')
                .filter(ForumUser -> ForumUser.getBirthday().plusYears(20).isBefore(LocalDate.now()))
                .filter(ForumUser -> ForumUser.getPostsNumber() > 0)
                .collect(Collectors.toMap(ForumUser::getIdentifier, ForumUser -> ForumUser));

        System.out.println("# elements: " + theResultMapOfUsers.size());
        theResultMapOfUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }


}
