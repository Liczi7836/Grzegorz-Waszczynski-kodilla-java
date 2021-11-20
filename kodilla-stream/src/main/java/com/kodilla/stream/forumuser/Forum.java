package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> forumUserList = new ArrayList<>();

    public Forum(){
        forumUserList.add(new ForumUser(1, "John", 'M', LocalDate.of(1996,10,20), 2));
        forumUserList.add(new ForumUser(2, "Lucy", 'F', LocalDate.of(2004,1,26), 2));
        forumUserList.add(new ForumUser(3, "Greta", 'F', LocalDate.of(1999,12,13), 2));
        forumUserList.add(new ForumUser(4, "Johnnie", 'M', LocalDate.of(2005,8,2), 2));
        forumUserList.add(new ForumUser(5, "Carlos", 'M', LocalDate.of(1990,4,8), 0));
        forumUserList.add(new ForumUser(6, "Johnn", 'M', LocalDate.of(2002,10,24), 1));
        forumUserList.add(new ForumUser(7, "Johnnn", 'M', LocalDate.of(1990,11,6), 0));
        forumUserList.add(new ForumUser(8, "Johnnnn", 'M', LocalDate.of(2000,9,1), 4));



    }

    public List<ForumUser> getList() {
        return new ArrayList<>(forumUserList);

    }
}
