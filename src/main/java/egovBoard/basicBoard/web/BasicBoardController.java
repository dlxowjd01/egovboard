package egovBoard.basicBoard.web;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import egovBoard.basicBoard.service.BasicBoardService;
import egovBoard.basicBoard.service.BasicBoardVO;

@Controller
public class BasicBoardController {
	
	@Resource(name="basicBoardService")
	private BasicBoardService boardService;
	
	@RequestMapping(value="/board.boardList.do")
	public String basicBoardList(HttpServletRequest request, HttpServletResponse response, ModelMap model) throws Exception {
		
		List<BasicBoardVO> boardList = boardService.selectBoardList();
		model.addAttribute("boardList", boardList);
		
		return "board/boardList";
	}
	
	
}
