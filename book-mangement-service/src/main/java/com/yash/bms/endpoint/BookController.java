/**
 * 
 */
package com.yash.bms.endpoint;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yash.bms.model.Book;
import com.yash.bms.service.BookService;

/**
 * @author akash.meshram
 *
 */

@RestController
public class BookController {

	@Autowired
	private BookService bookService;

	@RequestMapping("/")
	public String homePage() {

		System.out.println("hello...I am Home");
		return "<h1>This is Home Screen.......</h1>";
	}

	@PostMapping("/insertBook")
	public Book insertBookDetails(@RequestBody Book book) {
		Book bookObj = bookService.insertBook(book);
		return bookObj;
	}

	@GetMapping("/getallBooks")
	public List<Book> getAllBooks() throws Exception {
		List<Book> books = bookService.getAllBooks();
		return books;
	}

//	@GetMapping(path="/getallBooks", produces = MediaType.APPLICATION_XML_VALUE)
//	public List<Book> getAllBooks(){
//		List<Book> books = bookService.getAllBooks();
//		return books;
//	}

	@GetMapping("/getBookById/{getId}")
	public Optional<Book> getBook(@PathVariable("getId") String getId) throws Exception {
		Optional<Book> book = bookService.getBook(getId);
		return book;
	}

	@PutMapping("/updateBook/{getId}")
	public Book updateBook(@PathVariable final String getId, @RequestBody Book book){
		Book bookObj = bookService.updateBook(book, getId);
		return bookObj; 
	}

	@DeleteMapping("/deleteBook/{id}")
	public String removeBook(@PathVariable("id") String id) {
		String removeBook = bookService.removeBook(id);
		return removeBook;
	} 	
}
