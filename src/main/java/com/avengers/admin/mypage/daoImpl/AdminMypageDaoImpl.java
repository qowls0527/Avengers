package com.avengers.admin.mypage.daoImpl;

import java.sql.SQLException;
import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.avengers.admin.mypage.dao.AdminMypageDao;
import com.avengers.db.dto.AdminVO;
import com.avengers.db.dto.PerschdVO;
@Repository
public class AdminMypageDaoImpl implements AdminMypageDao {
	@Autowired
	protected SqlSession sqlSession;

	public void setSqlSession(SqlSession sqlSession) throws SQLException {
		this.sqlSession = sqlSession;
	}
	@Override
	public AdminVO selectAdmin(String admin_id)throws SQLException {
		return null;
	}

	@Override
	public int updateAdmin(AdminVO adminVO, String admin_id)throws SQLException {
		return 0;
	}

	@Override
	public ArrayList<PerschdVO> selectPerschdList(String perschd_psc)throws SQLException {
		return null;
	}

	@Override
	public PerschdVO selectPerschd(String perschd_num)throws SQLException {
		return null;
	}

	@Override
	public int insertPerschd(PerschdVO perschdVO, String perschd_psc)throws SQLException {
		return 0;
	}

	@Override
	public int updatePerschd(PerschdVO perschdVO, String perschd_num)throws SQLException {
		return 0;
	}

	@Override
	public int deletePerschd(String perschd_num)throws SQLException {
		return 0;
	}

	

}
