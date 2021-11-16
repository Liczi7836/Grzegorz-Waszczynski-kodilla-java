package com.kodilla.testing.library;

import java.util.ArrayList;
import java.util.List;

public class BookLibrary {
    private LibraryDatabase libraryDatabase;

    public BookLibrary(LibraryDatabase libraryDatabase) {
        this.libraryDatabase = libraryDatabase;
    }

    public List<Book> listBooksWithCondition(String titleFragment) {
        List<Book> bookList = new ArrayList<>();
        if (titleFragment.length() < 3) return bookList;
        List<Book> resultList = libraryDatabase.listBooksWithCondition(titleFragment);
        if (resultList.size() > 50) return bookList;    // Było 20, test nie poprawny!!!!!!!
        bookList = resultList;
        return bookList;
    }

    public List<Book> listBooksInHandsOf(LibraryUser libraryUser){

        List<Book> resultList = libraryDatabase.listBooksInHandsOf(libraryUser);
        if(resultList.size() == 0){
            return resultList;

        } else if (resultList.size() > 1){
            return resultList;
        }


        return resultList;
    }
}
