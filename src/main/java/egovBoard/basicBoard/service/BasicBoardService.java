package egovBoard.basicBoard.service;

import java.util.List;

public interface BasicBoardService {
	void createBoard(BasicBoardVO vo) throws Exception;

	void updateBoard(BasicBoardVO vo) throws Exception;

	void deleteBoard(BasicBoardVO vo) throws Exception;

	BasicBoardVO selectBoard(BasicBoardVO vo) throws Exception;
	
	List<BasicBoardVO> selectBoardList() throws Exception;
}
