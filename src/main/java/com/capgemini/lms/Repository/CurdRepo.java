package com.capgemini.lms.Repository;

import org.springframework.data.repository.CrudRepository;

import com.capgemini.lms.DO.BooksDO;

public interface CurdRepo extends CrudRepository<BooksDO, String> {

}
