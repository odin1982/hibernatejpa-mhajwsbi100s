package org.hjpa.springbootin10steps;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
	@GetMapping("/books")
	public List<Book> getAllBooks(){
		return Arrays.asList(
				new Book(1L,"libro1","Odin"),
				new Book(2L,"libro2","Amaya"), 
				new Book(3L,"libro3","Sarai"));
	}
}
