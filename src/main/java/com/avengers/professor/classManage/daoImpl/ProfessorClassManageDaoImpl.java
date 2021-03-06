package com.avengers.professor.classManage.daoImpl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.avengers.db.dto.AcVO;
import com.avengers.db.dto.AsgnVO;
import com.avengers.db.dto.AtdcVO;
import com.avengers.db.dto.BoardVO;
import com.avengers.db.dto.EqVO;
import com.avengers.db.dto.ExamVO;
import com.avengers.db.dto.LaVO;
import com.avengers.db.dto.LctVO;
import com.avengers.db.dto.SaVO;
import com.avengers.db.dto.SubVO;
import com.avengers.db.dto.TeVO;
import com.avengers.db.dto.TlVO;
import com.avengers.professor.classManage.dao.ProfessorClassManageDao;
@Repository
public class ProfessorClassManageDaoImpl implements ProfessorClassManageDao {
	@Autowired
	protected SqlSession sqlSession;

	public void setSqlSession(SqlSession sqlSession) throws SQLException {
		this.sqlSession = sqlSession;
	}

	@Override
	public ArrayList<LctVO> selectLctList(String key, int firstRow, int endRow)
			throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LctVO selectLct(String lct_num) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertLct(LctVO lctVO) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateLct(LctVO lctVO, String lct_num) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<ExamVO> selectExamList(String key, int firstRow, int endRow)
			throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ExamVO selectExam(String exam_num) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateExam(ExamVO examVO, String exam_num) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteExam(String exam_num) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<TeVO> selectTeList(String key, String exam_lct,
			int firstRow, int endRow) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<EqVO> selectEqList(String exam_num) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<SaVO> selectSaList(String te_num) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertTe(TeVO teVO) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateTe(TeVO teVO, String te_num) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<AsgnVO> selectAsgnList(String key, int firstRow, int endRow)
			throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AsgnVO selectAsgn(String asgn_num) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertAsgn(AsgnVO asgnVO) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateAsgn(AsgnVO asgnVO, String asgn_num) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteAsgn(String asgn_num) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<SubVO> selectSubList(String key, int firstRow, int endRow)
			throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SubVO selectSub(String sub_num) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateSub(SubVO subVO, String sub_num) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<TlVO> selectTlList(String key, int firstRow, int endRow)
			throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TlVO selectTl(String tl_num) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateTl(TlVO tlVO, String tl_num) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<AtdcVO> selectAtdcList(Date atdc_date, String lct_num)
			throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateAtdc(AtdcVO atdcVO, Date atdc_date, String atdc_tl)
			throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<AcVO> selectAcList(String ac_atdc) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AcVO selectAc(String ac_num) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<BoardVO> selectBoardList(String key, int firstRow,
			int endRow) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BoardVO selectBoard(String board_num) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertBoard(BoardVO boardVO) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateBoard(BoardVO boardVO, String board_num)
			throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<LaVO> selectLaList(int firstRow, int endRow)
			throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LaVO selectLa(String la_num) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	

	

}
