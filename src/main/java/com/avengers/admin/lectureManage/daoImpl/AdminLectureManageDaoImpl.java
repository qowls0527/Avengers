package com.avengers.admin.lectureManage.daoImpl;

import java.sql.SQLException;
import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.avengers.admin.lectureManage.dao.AdminLectureManageDao;
import com.avengers.db.dto.LctVO;
@Repository
public class AdminLectureManageDaoImpl implements AdminLectureManageDao {
	@Autowired
	protected SqlSession sqlSession;

	public void setSqlSession(SqlSession sqlSession) throws SQLException {
		this.sqlSession = sqlSession;
	}
	@Override
	public ArrayList<LctVO> selectLctList(String key,int firstRow, int lastRow)throws SQLException {
		return null;
	}

	@Override
	public LctVO selectLct(String lct_num)throws SQLException {
		return null;
	}

	@Override
	public int insertLct(LctVO lctVO)throws SQLException {
		return 0;
	}

	@Override
	public int updateLct(LctVO lctVO, String lct_num)throws SQLException {
		return 0;
	}

	@Override
	public int deleteLct(String lct_num)throws SQLException {
		return 0;
	}

}
