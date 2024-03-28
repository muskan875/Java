package com.jpa.User.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.User.Dto.PositionDto;
import com.jpa.User.Entities.Position;
import com.jpa.User.Repository.PositionRepository;


@Service
public class PositionService {

	@Autowired
	private PositionRepository positionRepository;
	
	public PositionDto addPosition(PositionDto positiondto) {
		return positiondto;
	}
	
	public List<Position> getAllPositions(){
		List<Position> position = (List<Position>) positionRepository.findAll();
		return position;
	}
}
