package com.cg.hb06.dao;
import java.util.List;

import com.cg.hb06.entity.Book;
import com.cg.hb06.exception.BookStoreException;

public interface IBookDAO {	
	String add(Book book) throws BookStoreException;
	boolean delete(String bcode)throws BookStoreException;
	Book get(String bcode) throws BookStoreException;;
	List<Book> getAll() throws BookStoreException;;
	boolean update(Book book) throws BookStoreException;
	void persist()throws BookStoreException;
}