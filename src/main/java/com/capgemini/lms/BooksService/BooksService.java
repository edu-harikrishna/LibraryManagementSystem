package com.capgemini.lms.BooksService;

import com.capgemini.lms.BooksVO.BooksVO;
import com.capgemini.lms.DO.BooksDO;
import com.capgemini.lms.model.CreateBookResponse;

public interface BooksService {

	//public BooksVO addBook(BooksListVO BooksListVO);
	public CreateBookResponse addBook(BooksVO booksVO);
}
