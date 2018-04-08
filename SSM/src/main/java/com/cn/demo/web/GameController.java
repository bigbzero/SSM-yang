package com.cn.demo.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cn.demo.service.GameService;

@Controller
@RequestMapping("/game")
public class GameController {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	private GameService gameService;
	
	public Logger getLogger() {
		return logger;
	}

	public void setLogger(Logger logger) {
		this.logger = logger;
	}
}
