/**
 * 
 */
package com.yash.bms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yash.bms.model.Book;

/**
 * @author akash.meshram
 *
 */
@Repository
public interface BookRepo extends JpaRepository<Book, String>{
}
