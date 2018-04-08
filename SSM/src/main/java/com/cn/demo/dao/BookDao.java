package com.cn.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.cn.demo.entity.Book;

public interface BookDao {
	/**
	 * ͨ��ID��ѯ����ͼ��
	 * 
	 * @param id
	 * @return
	 */
	Book queryById(long id);

	/**
	 * ��ѯ����ͼ��
	 * 
	 * @param offset ��ѯ��ʼλ��
	 * @param limit ��ѯ����
	 * @return
	 */
	List<Book> queryAll(@Param("offset") int offset, @Param("limit") int limit);

	/**
	 * �½�ͼ��
	 * 
	 * @param name �鼮����
	 * @param number ����
	 * @return
	 */
	void newBook(Book book);
	
	/**
	 * ���ٹݲ�����
	 * 
	 * @param bookId
	 * @return ���Ӱ����������>1����ʾ���µļ�¼����
	 */
	int reduceNumber(long bookId);
}
