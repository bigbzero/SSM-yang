package com.cn.demo.service;

import java.util.List;

import com.cn.demo.entity.Game;

public interface GameService {
	/**
	 * 查询指定game
	 * 
	 * @param id
	 * @return
	 */
	Game getById(long id);

	/**
	 * 查询所有game
	 * 
	 * @return
	 */
	List<Game> getList();

	/**
	 * 创建game
	 * 
	 * @param name
	 * @return
	 */
	Game newGame(Game game);
	
	/**
	 * 修改game
	 * 
	 * @param name
	 * @return
	 */
	Game updateGame(Game game);
	
	/**
	 * 删除game
	 * 
	 * @param name
	 * @return
	 */
	void deleteGame(Game game);
}
