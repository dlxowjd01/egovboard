package egovBoard.basicBoard.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovBoard.basicBoard.service.BasicBoardService;
import egovBoard.basicBoard.service.BasicBoardVO;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("basicBoardService")
public class BasicBoardServiceImpl extends EgovAbstractServiceImpl implements BasicBoardService {
	
	@Resource(name="basicBoardDAO")
	private BasicBoardDAO basicBoardDAO;

	@Override
	public void createBoard(BasicBoardVO vo) throws Exception {
		basicBoardDAO.createBoard(vo);
	}

	@Override
	public void updateBoard(BasicBoardVO vo) throws Exception {
		basicBoardDAO.updateBoard(vo);
	}

	@Override
	public void deleteBoard(BasicBoardVO vo) throws Exception {
		basicBoardDAO.deleteBoard(vo);
	}

	@Override
	public BasicBoardVO selectBoard(BasicBoardVO vo) throws Exception {
		BasicBoardVO resultVo = basicBoardDAO.selectBoard(vo);
		
		return resultVo;
	}

	@Override
	public List<BasicBoardVO> selectBoardList() throws Exception {
		return basicBoardDAO.selectBoardList();
	}

}
