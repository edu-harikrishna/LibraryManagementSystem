package com.capgemini.lms.BooksMapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;
import com.capgemini.lms.BooksVO.BooksVO;
import com.capgemini.lms.DO.BooksDO;

@Mapper
public interface BooksMapper {

	
	BooksMapper INSTANCE = Mappers.getMapper( BooksMapper.class );
	
	@Mappings({
		@Mapping(target = "BookId", source = "booksVO.getBookId()"),
		@Mapping(target = "author", source = "booksVO.getauthor()"),
		@Mapping(target = "title", source = "booksVO.gettitle()"),
		@Mapping(target = "price", source = "booksVO.getprice()"),
		@Mapping(target = "isavailable", ignore = true),
		@Mapping(target = "pub_Id", source = "booksVO.getpub_Id()")
	})
	public BooksDO BooksToBooksDO(BooksVO booksVO);
}
