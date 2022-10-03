package com.yash.bms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.bms.exception.BookNotFoundException;
import com.yash.bms.model.Book;
import com.yash.bms.repository.BookRepo;

/**
 * @author akash.meshram
 *
 */

@Service
public class BookService {

	@Autowired
	private BookRepo bookRepo;
//	private Book save;

//	public Employee addEmployee(Employee emp) {
//		Employee savedEmployee = new Employee();
//		try {
//			savedEmployee = empDao.save(emp);
//		} catch (Exception e) {
//			System.out.println("Exception while adding Employee");
//		}
//		return savedEmployee;
//	}

	public Book insertBook(Book book) {
//		Book bookObj = new Book();

		try {
			bookRepo.save(book);
		} catch (Exception e) {
			System.out.println("Exception while inserting the book");
			e.printStackTrace();
		}
		return book;
	}

	public List<Book> getAllBooks() throws Exception {
		List<Book> books = bookRepo.findAll();

		if (null != books) {
			return books;
		} else {
			throw new Exception("Books are unable present in DB");
		}
	}

	public Optional<Book> getBook(String bookId) throws Exception {
		Optional<Book> bookOpt = bookRepo.findById(bookId);
		if (!bookOpt.isPresent()) {
			throw new BookNotFoundException("Invalid Book Id : " + bookId);
		}
		return bookOpt;
	}

//	private Book convertToBook(Optional<Book> book) throws Exception {
//		Book bookObj = null;
//
////		if (book != null) {
//		if (!book.isEmpty()) {
//			bookObj.setId(book.get().getId());
//			bookObj.setName(book.get().getName());
//			bookObj.setAuthor(book.get().getAuthor());
//		} else {
//			throw new Exception("BookId is not present");
//		}
////			e.printStackTrace();
//
//		return bookObj;
//	}

	public Book updateBook(Book book, String bookId) {
		Optional<Book> bookObj = Optional.of(new Book());
		Book bookNormal = new Book();
		Book save2 = null;
		try {
			bookObj = getBook(bookId);

			if (!bookObj.isEmpty()) {
				bookNormal.setName(book.getName());
				bookNormal.setAuthor(book.getAuthor());
				bookNormal.setPrice(book.getPrice());

				save2 = bookRepo.save(bookNormal);
			}
		} catch (Exception e) {
			throw new BookNotFoundException("Invalid Book Id : " + bookId);
		}
		return save2;
	}

	public String removeBook(String bookId) {

		Optional<Book> book = Optional.of(new Book());
		try {
			book = getBook(bookId);
			if (book.isPresent()) {
				bookRepo.deleteById(bookId);
			}
		} catch (Exception e) {
			throw new BookNotFoundException("Invalid Book Id : " + bookId);
		}
		return "book deleted Successfully with id= " + bookId;
	}
}
