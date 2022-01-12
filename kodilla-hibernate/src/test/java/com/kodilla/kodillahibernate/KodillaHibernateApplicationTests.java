package com.kodilla.kodillahibernate;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class KodillaHibernateApplicationTests {

    @Autowired
    AuthorDao authorDao;

    @Autowired
    BookDao bookDao;

    @Test
    void contextLoads() {

        //Given
        Author author = new Author();
        author.setName("Sapkowski");
        authorDao.save(author);

        Book book1 = new Book();
        book1.setName("Witcher");
        book1.setAuthor(author);

        Book book2 = new Book();
        book2.setName("Maladie");
        book2.setAuthor(author);
        bookDao.saveAll(List.of(book1, book2));

        //When
        List<Author> authorOptional = authorDao.findByName("Sapkowski");
        System.out.println(authorOptional);

    }

}
