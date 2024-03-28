package com.jpa.User.Repository;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jpa.User.Entities.Position;

@Repository
public interface PositionRepository extends CrudRepository<Position , Integer> {

	
}
