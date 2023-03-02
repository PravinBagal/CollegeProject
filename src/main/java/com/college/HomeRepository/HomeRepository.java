package com.college.HomeRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.college.model.College;

@Repository
public interface HomeRepository extends JpaRepository<College, Integer> {

    College findByCid(int cid);
	//College findByCid(int c);
}
