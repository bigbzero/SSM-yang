package com.cn.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.cn.demo.entity.Game;

public interface GameDao {
	/**
	 * ͨ��ID��ѯָ��game
	 * 
	 * @param id
	 * @return
	 */
	Game queryById(long id);

	/**
	 * ��ѯ����game
	 * 
	 * @param offset
	 *            ��ѯ��ʼλ��
	 * @param limit
	 *            ��ѯ����
	 * @return
	 */
	List<Game> queryAll(@Param("offset") int offset, @Param("limit") int limit);

	/**
	 * �½�game
	 * 
	 * @param game
	 * @return
	 */
	Game newGame(Game game);

	/**
	 * �޸�game
	 * 
	 * @param game
	 * @return
	 */
	Game updateGame(Game game);
	
	/**
	 * ɾ��game
	 * 
	 * @param game
	 * @return
	 */
	void deleteGame(Game game);
}
