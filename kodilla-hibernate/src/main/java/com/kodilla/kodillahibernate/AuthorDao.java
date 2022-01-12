package com.kodilla.kodillahibernate;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface AuthorDao extends CrudRepository<Author, Long> {

    List<Author> findByName(String name);

}
