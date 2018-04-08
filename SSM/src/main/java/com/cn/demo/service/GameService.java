package com.cn.demo.service;

import java.util.List;

import com.cn.demo.entity.Game;

public interface GameService {
	/**
	 * ��ѯָ��game
	 * 
	 * @param id
	 * @return
	 */
	Game getById(long id);

	/**
	 * ��ѯ����game
	 * 
	 * @return
	 */
	List<Game> getList();

	/**
	 * ����game
	 * 
	 * @param name
	 * @return
	 */
	Game newGame(Game game);
	
	/**
	 * �޸�game
	 * 
	 * @param name
	 * @return
	 */
	Game updateGame(Game game);
	
	/**
	 * ɾ��game
	 * 
	 * @param name
	 * @return
	 */
	void deleteGame(Game game);
}
