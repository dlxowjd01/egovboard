package egovBoard.basicBoard.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import egovBoard.basicBoard.service.BasicBoardVO;
import egovframework.rte.psl.dataaccess.EgovAbstractMapper;

@Repository("basicBoardDAO")
public class BasicBoardDAO extends EgovAbstractMapper {

	public int createBoard(BasicBoardVO vo) throws Exception{
		return (int) insert("boardMapper.createBoard", vo);
	}
	
	public List<BasicBoardVO> selectBoardList() throws Exception {
		return selectList("boardMapper.selectBoardList");
	}
	
	public void updateBoard(BasicBoardVO vo) throws Exception {
		update("boardMapper.updateBoard", vo);
	}

	public void deleteBoard(BasicBoardVO vo) throws Exception {
		update("boardMapper.deleteBoard", vo);
	}

	public BasicBoardVO selectBoard(BasicBoardVO vo) throws Exception {
		return (BasicBoardVO) selectOne("boardMapper.selectBoard", vo);
	}

}
