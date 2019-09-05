package com.capgemini.lms.BooksVO;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BooksListVO {
	
	List<BooksVO> booksListVO = new ArrayList<BooksVO>();
	
	
}
