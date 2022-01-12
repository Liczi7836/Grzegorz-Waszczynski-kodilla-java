package com.kodilla.kodillahibernate;

import org.springframework.data.repository.CrudRepository;

public interface BookDao extends CrudRepository<Book, Long> {
}
