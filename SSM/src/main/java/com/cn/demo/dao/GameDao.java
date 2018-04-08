package com.cn.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.cn.demo.entity.Game;

public interface GameDao {
	/**
	 * 通过ID查询指定game
	 * 
	 * @param id
	 * @return
	 */
	Game queryById(long id);

	/**
	 * 查询所有game
	 * 
	 * @param offset
	 *            查询起始位置
	 * @param limit
	 *            查询条数
	 * @return
	 */
	List<Game> queryAll(@Param("offset") int offset, @Param("limit") int limit);

	/**
	 * 新建game
	 * 
	 * @param game
	 * @return
	 */
	Game newGame(Game game);

	/**
	 * 修改game
	 * 
	 * @param game
	 * @return
	 */
	Game updateGame(Game game);
	
	/**
	 * 删除game
	 * 
	 * @param game
	 * @return
	 */
	void deleteGame(Game game);
}
