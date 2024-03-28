package com.jpa.User.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.User.Dto.PositionDto;
import com.jpa.User.Entities.Position;
import com.jpa.User.Service.PositionService;

@RestController

public class PositionController {
	
	@Autowired
	private PositionService positionService;

	@GetMapping("/post")
	public List<Position> getPositions(){
		return positionService.getAllPositions();
	}
	
	@PostMapping("/post")
	public PositionDto savePosition(@RequestBody PositionDto positiondto) {
		return positionService.addPosition(positiondto);
	}
}
