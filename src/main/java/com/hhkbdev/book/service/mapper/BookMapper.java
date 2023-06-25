package com.hhkbdev.book.service.mapper;

import com.hhkbdev.book.domain.Book;
import com.hhkbdev.book.service.dto.BookDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Book} and its DTO {@link BookDTO}.
 */
@Mapper(componentModel = "spring")
public interface BookMapper extends EntityMapper<BookDTO, Book> {}
