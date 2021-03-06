package com.cg.hb06.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import com.cg.hb06.entity.Book;
import com.cg.hb06.exception.BookStoreException;
import com.cg.hb06.util.JPAUtil;


public class BookDAOJPAImpl implements IBookDAO {

	EntityManager em;
	public BookDAOJPAImpl() throws BookStoreException {

		em = JPAUtil.getEntityManager();
	}
	@Override
	public String add(Book book) throws BookStoreException {
		try {
			if (book != null) {
				EntityTransaction txn = em.getTransaction();
				txn.begin();
				em.persist(book);
				txn.commit();
			}
		} catch(Exception e) {
			throw new BookStoreException("Book was not inserted");
		}
		return book.getBcode();	
	}
	
	@Override
	public boolean delete(String bcode) throws BookStoreException {
		boolean isDone = false;
		try {
			EntityTransaction txn = em.getTransaction();
			Book b = em.find(Book.class, bcode);
			if(b != null) {
				txn.begin();
				em.remove(b);
				txn.commit();
				isDone = true;
			}	
		} catch (Exception e) {
			throw new BookStoreException("Book not found");
		}
		return isDone;	
	}
	@Override
	public Book get(String bcode) throws BookStoreException {
		Book b = null;
		try {
			b = em.find(Book.class, bcode);
		} catch (Exception e) {
			throw new BookStoreException("Book not found");	
		}
		return b;
	}
	
	@Override
	public List <Book> getAll() throws BookStoreException {
		List <Book> books;
		try {
			String sql = "SELECT b FROM Book b";
			TypedQuery <Book> tqbooks = em.createQuery(sql,Book.class);
			books = tqbooks.getResultList();
		} catch(Exception e) {
			
			throw new BookStoreException("No books");
			
		}
		
		return books;
	}
	
	@Override
	public boolean update(Book book) throws BookStoreException {
		
		boolean isDone = false;
		if (book != null) {
			try {
				
				EntityTransaction txn = em.getTransaction();
				txn.begin();
				em.merge(book);
				txn.commit();
				isDone = true;
				
			} catch (Exception e) {
				
				throw new BookStoreException("Book is not updated.");
			}
		}
		
		return isDone;
	}
	
	@Override
	public void persist() throws BookStoreException {
		
	}

}