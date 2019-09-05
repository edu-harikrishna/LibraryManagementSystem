package com.capgemini.lms.BooksServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.capgemini.lms.BooksMapper.BooksManualMapper;
import com.capgemini.lms.BooksService.BooksService;
import com.capgemini.lms.BooksVO.BooksVO;
import com.capgemini.lms.DO.BooksDO;
import com.capgemini.lms.Repository.CurdRepo;
import com.capgemini.lms.model.CreateBookResponse;

public class BooksServiceImpl implements BooksService{
	
	@Autowired BooksManualMapper booksMapper;
	@Autowired BooksDO booksDO;
	@Autowired CurdRepo repo;

	/*@Override
	public BooksVO addBook(BooksListVO BooksListVO) {
		
		return booksMapper.BooksToBooksDO(BooksListVO);
	}*/

	@Override
	public CreateBookResponse addBook(BooksVO booksVO) {
		
		booksDO = booksMapper.BooksToBooksDO(booksVO);
		repo.save(booksDO);		
		return new CreateBookResponse();
		
	}

}
