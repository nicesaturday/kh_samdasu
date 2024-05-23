package com.samdasu.crtl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.samdasu.dto.Board;
import com.samdasu.service.BoardService;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	
	@GetMapping("/list")
	public String getBoards(Model model) {
		List<Board> boardList = boardService.getBoards();
		model.addAttribute("boardList" , boardList);
		return "board/boardList";
	}
	
	@GetMapping("/one")
	public String getBoard(Model model , HttpServletRequest request) {
		int num = Integer.parseInt(request.getParameter("num"));
		Board board = boardService.getBoard(num);
		model.addAttribute("board",board);
		return "board/one";
	}
	
	@GetMapping("/insBoard")
	public String insBoard() {
		return "board/ins";
	}
	
	@PostMapping("/insBoard")
	public void insBoard(Model model , @ModelAttribute("board") Board board) {	
		boardService.insBoard(board);
	}
	
	@GetMapping("/upBoard")
	public String upBoard() {
		return "board/up";
	}
	
	@PostMapping("/upBoard")
	public void upBoard(Model model , @ModelAttribute("board") Board board) {
		boardService.upBoard(board);
	}
	
	@GetMapping("/delBoard")
	public void delBoard(Model model , @RequestParam("num") int num) {
		boardService.delBoard(num);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
