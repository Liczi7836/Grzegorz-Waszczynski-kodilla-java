package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest(){
        //Given
        MedianAdapter medianAdapter = new MedianAdapter();
        Set<Book> bookSet = new HashSet<>();
        bookSet.add(new Book("John","First adventure!", 1999, "Adv"));
        bookSet.add(new Book("John", "Second adventure!", 2000, "Adv"));
        bookSet.add(new Book("John", "Third adventure!", 2001, "Adv"));
        bookSet.add(new Book("Margareth", "How to create H2O", 2005, "Chm"));
        //When
        int bookMedian = medianAdapter.publicationYearMedian(bookSet);
        //Then
        assertEquals(2001, bookMedian);
    }
}
