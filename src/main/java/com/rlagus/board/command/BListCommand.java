package com.rlagus.board.command;

import java.util.ArrayList;

import org.springframework.ui.Model;

import com.rlagus.board.dao.BDao;
import com.rlagus.board.dto.BDto;

public class BListCommand implements BCommand {

	@Override
	public void execute(Model model) {
		// TODO Auto-generated method stub
		
		BDao dao = new BDao();
		ArrayList<BDto> dtos = dao.list();
		
		model.addAttribute("list", dtos);

	}

}