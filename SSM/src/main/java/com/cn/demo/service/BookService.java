package com.cn.demo.service;

import java.util.List;

import com.cn.demo.dto.AppointExecution;
import com.cn.demo.entity.Book;

/**
 * ҵ��ӿڣ�վ��"ʹ����"�Ƕ���ƽӿ� �������棺�����������ȣ��������������ͣ�return ����/�쳣��
 */
public interface BookService {
	  /**
     * ��ѯһ��ͼ��
     * 
     * @param bookId
     * @return
     */
    Book getById(long bookId);

    /**
     * ��ѯ����ͼ��
     * 
     * @return
     */
    List<Book> getList();
    
    /**
     * ����ͼ��
     * @param name
     * @param number
     * @return
     */
    void newBook(Book book);

    /**
     * ԤԼͼ��
     * 
     * @param bookId
     * @param studentId
     * @return
     */
    AppointExecution appoint(long bookId, long studentId);
}
