package com.cn.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.cn.demo.entity.Book;

public interface BookDao {
	/**
	 * 通过ID查询单本图书
	 * 
	 * @param id
	 * @return
	 */
	Book queryById(long id);

	/**
	 * 查询所有图书
	 * 
	 * @param offset 查询起始位置
	 * @param limit 查询条数
	 * @return
	 */
	List<Book> queryAll(@Param("offset") int offset, @Param("limit") int limit);

	/**
	 * 新建图书
	 * 
	 * @param name 书籍名称
	 * @param number 数量
	 * @return
	 */
	void newBook(Book book);
	
	/**
	 * 减少馆藏数量
	 * 
	 * @param bookId
	 * @return 如果影响行数等于>1，表示更新的记录行数
	 */
	int reduceNumber(long bookId);
}
