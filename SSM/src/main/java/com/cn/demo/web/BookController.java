package com.cn.demo.web;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cn.demo.dto.AppointExecution;
import com.cn.demo.dto.Result;
import com.cn.demo.entity.Book;
import com.cn.demo.enums.AppointStateEnum;
import com.cn.demo.exception.NoNumberException;
import com.cn.demo.exception.RepeatAppointException;
import com.cn.demo.service.BookService;

@Controller
@RequestMapping("/book") // url:/ģ��/��Դ/{id}/ϸ�� /seckill/list
public class BookController {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private BookService bookService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(Model model) {
        List<Book> list = bookService.getList();
        int a = 11;
        model.addAttribute("list", list);
        model.addAttribute("test", a);
//         list.jsp + model = ModelAndView
        return "list";// WEB-INF/jsp/"list".jsp
    }
    
    @RequestMapping(value = "/newBook", method = RequestMethod.GET)
    public String newBook(Model model){
    	return "newBook";
    }
    
    @RequestMapping(value = "/newBook", method = RequestMethod.POST)
    public String newBook(Book book, Model model){
    	bookService.newBook(book);
    	return "";
    }
    
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test(Model model) {
        List<Book> list = bookService.getList();
        model.addAttribute("list", list);
        int b = 11;
        model.addAttribute("b", b);
//         list.jsp + model = ModelAndView
        return "redirect:/book/list";// WEB-INF/jsp/"test".jsp
    }

    @RequestMapping(value = "/{bookId}/detail", method = RequestMethod.GET)
    private String detail(@PathVariable("bookId") Long bookId, Model model) {
        if (bookId == null) {
            return "redirect:/book/list";
        }
        Book book = bookService.getById(bookId);
        if (book == null) {
            return "forward:/book/list";
        }
        model.addAttribute("book", book);
        return "detail";
    }

    //ajax json
    @RequestMapping(value = "/{bookId}/appoint", method = RequestMethod.POST, produces = {
            "application/json; charset=utf-8" })
    @ResponseBody
    private Result<AppointExecution> appoint(@PathVariable("bookId") Long bookId, @RequestParam("studentId") Long studentId) {
        if (studentId == null || studentId.equals("")) {
            return new Result<AppointExecution>(false, "ѧ�Ų���Ϊ��");
        }
        //AppointExecution execution = bookService.appoint(bookId, studentId);//����д��������ͳһ���أ�Ҫ�����쳣��ʧ�ܣ����
        AppointExecution execution = null;
        try {
            execution = bookService.appoint(bookId, studentId);
        } catch (NoNumberException e1) {
            execution = new AppointExecution(bookId, AppointStateEnum.NO_NUMBER);
        } catch (RepeatAppointException e2) {
            execution = new AppointExecution(bookId, AppointStateEnum.REPEAT_APPOINT);
        } catch (Exception e) {
            execution = new AppointExecution(bookId, AppointStateEnum.INNER_ERROR);
        }
        return new Result<AppointExecution>(true, execution);
    }

	public Logger getLogger() {
		return logger;
	}

	public void setLogger(Logger logger) {
		this.logger = logger;
	}
}
