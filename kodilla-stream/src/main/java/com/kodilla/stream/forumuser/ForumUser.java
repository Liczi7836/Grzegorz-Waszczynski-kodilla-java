package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int identifier;
    private final String name;
    private final char sex;
    private final LocalDate birthday;
    private final int postsNumber;

    public ForumUser(final int identifier, final String name, final char sex, final LocalDate birthday, final int postsNumber) {
        this.identifier = identifier;
        this.name = name;
        this.sex = sex;
        this.birthday = birthday;
        this.postsNumber = postsNumber;
    }

    public int getIdentifier() {
        return identifier;
    }

    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public int getPostsNumber() {
        return postsNumber;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "identifier=" + identifier +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", birthday=" + birthday +
                ", postsNumber=" + postsNumber +
                '}';
    }
}
