package com.capgemini.lms.BooksMapper;

import org.springframework.beans.factory.annotation.Autowired;

import com.capgemini.lms.BooksVO.BooksVO;
import com.capgemini.lms.DO.BooksDO;

public class BooksManualMapper {

	@Autowired BooksDO booksDO;
	
	public BooksDO BooksToBooksDO(BooksVO booksVO) {
		
		booksDO.setBook_Id(booksVO.getBook_Id());
		booksDO.setAuthor(booksVO.getAuthor());
		booksDO.setIsavailable(booksVO.getIsavailable());
		booksDO.setPrice(booksVO.getPrice());
		booksDO.setPub_Id(booksVO.getPub_Id());
		booksDO.setTitle(booksVO.getTitle());
		
		return booksDO;
	}
}
