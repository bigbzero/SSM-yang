package com.cn.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.demo.dao.GameDao;
import com.cn.demo.entity.Game;
import com.cn.demo.service.GameService;

@Service
public class GameServiceImpl implements GameService{
	
	@Autowired
	private GameDao gameDao;
	
	public Game getById(long id) {
		return gameDao.queryById(id);
	}

	public List<Game> getList() {
		return gameDao.queryAll(0, 1000);
	}

	public Game newGame(Game game) {
		Game newGame = gameDao.newGame(game);
		return newGame;
	}

	public Game updateGame(Game game) {
		Game newGame = gameDao.updateGame(game);
		return newGame;
	}

	public void deleteGame(Game game) {
		gameDao.deleteGame(game);
	}
	
}
