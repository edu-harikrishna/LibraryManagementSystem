package com.capgemini.lms.Controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.lms.BooksService.BooksService;
import com.capgemini.lms.BooksVO.BooksVO;
import com.capgemini.lms.model.CreateBookResponse;

@RestController
public class Controller{
	
	@Autowired
	BooksService booksService;
	
	@PostMapping(value = "/add/book", produces = {"application/json"}, consumes = {"application/json"})
	public ResponseEntity<CreateBookResponse> addBook(
			//@RequestBody BooksListVO listVO
			@Valid @RequestBody BooksVO booksVO ) {
		
		booksService.addBook(booksVO);
		return new ResponseEntity<CreateBookResponse>(HttpStatus.OK);
		
	}
	
	@GetMapping(value = "/hello")
	public String test() {
		return "Hello";
	}
}