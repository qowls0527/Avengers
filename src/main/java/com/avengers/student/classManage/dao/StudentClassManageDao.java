package com.avengers.student.classManage.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

import com.avengers.db.dto.AcVO;
import com.avengers.db.dto.AsgnVO;
import com.avengers.db.dto.AtdcVO;
import com.avengers.db.dto.BoardVO;
import com.avengers.db.dto.EqVO;
import com.avengers.db.dto.ExamVO;
import com.avengers.db.dto.LaVO;
import com.avengers.db.dto.LctVO;
import com.mysql.fabric.xmlrpc.base.Array;


/**
 * 수업관리
 *StudentClassManageDao interface 
 * @author 조영훈
 * 2017.07.10
 */
public interface StudentClassManageDao {
	//강의 시간표를 강의명/강의실/전공/교양으로 검색
	//강의명,시간,강의실,교수명,전공/교양,학점을 map에 넣는다.
	//강의명,전공/교양,학점은 LCT table
	//교수명은 PRFS table
	//강의실은 LRC table 
	public ArrayList<Map<String, String>> selectClassList(String searchKey,int firstRow,int endRow) throws SQLException;
	
	//전체목록
	public ArrayList<Map<String, String>> selectClassList(int firstRow,int endRow) throws SQLException;

	
	//////강의 상세 페이지
	
	//강의계획서
	//교과목개요, 수업목표, 수업방법, 평가방법, 교재 및 참고서, 수업내용, 과제물
	public LctVO selectLct(String lct_nm)throws SQLException;
	
	//시험관리
	//강의명을 통해 강의 고유번호 조회
	//시험명/기간으로 시험검색
	public ArrayList<ExamVO> selectExamList(String lct_nm,String searchKey,int firstRow,int endRow)throws SQLException;
	
	//시험전체 목록
	public ArrayList<ExamVO> selectExamList(int firstRow,int endRow)throws SQLException;

	
	//시험 선택 상세보기 -> 시험 문제
	public ArrayList<EqVO> selectExamList(String eq_exam)throws SQLException;
	
	//과제관리
	//과제명/제출기한을 통해 검색-> 과제 전체 목록
	public ArrayList<AsgnVO> selectAsgnList(String searchKey,int firstRow,int endRow)throws SQLException;
	

	//과제관리 로드시 전체목록
	public ArrayList<AsgnVO> selectAsgnList(int firstRow,int endRow)throws SQLException;
	
	//과제 상세보기
	public AsgnVO selectAsgn(String asgn_nm,String asgn_num)throws SQLException;
	
	//과제 파일 업로드
	//assgn_sub_form에 파일 경로를 넣는다.
	public int insertAsgn(AsgnVO asgn)throws SQLException;
	
	//과제 수정/제출
	public int updateAsgn(AsgnVO asgn)throws SQLException;
	
	//학점확인
	//학생의기본정보를 볼수있으며 출석률/과제점수/시험점수/총점을 확인할수있다.
	public Map<String, Integer> selectStudInfo(String stud_num)throws SQLException;
	
	////출결관리
	//출결 조회
	//강의번호 -> 수강 번호로 출결 조회
	public Map<String, String> selectAtdc(Date date,String lct_num)throws SQLException; 

	
	////이의신청
	//성공하면 1,실패하면 -1
	public int updateAc(String stud_num,AcVO ac)throws SQLException;
	
	//수업자료실
	//제목/내용으로 검색
	public ArrayList<BoardVO> selectTeachingMaterialList(String searchKey,int firsRow,int endRow)throws SQLException;
	
	//수업자료실 전체목록
	public ArrayList<BoardVO> selectTeachingMaterialList(int firstRow,int endRow)throws SQLException;
	
	//수업자료실 상세
	public BoardVO selectTeachingMaterial(String board_num)throws SQLException;
	
	//질문게시판
	//전체 목록
	public ArrayList<BoardVO> selectQuestionList()throws SQLException;
	//제목 내용으로 검색
	public ArrayList<BoardVO> selectQuestionList(String searchKey)throws SQLException;
	
	//질문게시판 상세
	public BoardVO selectQuestion(String board_num) throws SQLException;
	
	//질문게시판 글쓰기
	public int insertQuestion(BoardVO board) throws SQLException;
	
	//수강평가
	//전체목록
	public Map<String, String> asessMentofLectureList() throws SQLException;
	
	//과목명,담당교수로 수강평가 희망 과목을 조회
	//평가가 완료된 항목은  평가된 항목은 평가완료라고 표시되고 미평가된 과목은 학생이 하이퍼링크로 들어가서 평가할 수 있도록 표시된다.
	public Map<String, String> asessMentofLectureList(String searchKey) throws SQLException;

	//수강평가 입력
	public int insertAsessMentofLecture(LaVO la) throws SQLException;
	
}
