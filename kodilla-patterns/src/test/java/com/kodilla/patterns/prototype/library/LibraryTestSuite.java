package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite {


    @Test
    void testGetBooks(){
        //Given
        Library firstLibrary = new Library("J.R.R. Tolkien books");
        IntStream.iterate(1, n -> n + 1)
                .limit(3)
                .forEach(n -> firstLibrary.getBooks().add(new Book("Lord of the rings " + n,"J.R.R. Tolkien", LocalDate.of(1998 + n,10,10))));

        Library clonedLibrary = null;
        try{
            clonedLibrary = firstLibrary.shallowCopy();
            clonedLibrary.setName("Also Tolkien books");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try{
            deepClonedLibrary = firstLibrary.deepCopy();
            deepClonedLibrary.setName("Again! Tolkien books");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        System.out.println(firstLibrary);

        Book book = new Book("Lord of the rings " + 4,"J.R.R. Tolkien", LocalDate.of(1998 + 4,10,10));
        //When
        firstLibrary.getBooks().add(book);
        System.out.println(firstLibrary);
        //Then
        assertEquals(4, firstLibrary.getBooks().size());
        assertEquals(4, clonedLibrary.getBooks().size());
        assertEquals(3, deepClonedLibrary.getBooks().size());
        assertEquals(firstLibrary.getBooks(),clonedLibrary.getBooks());
        assertNotEquals(firstLibrary.getBooks(),deepClonedLibrary.getBooks());
    }
}
