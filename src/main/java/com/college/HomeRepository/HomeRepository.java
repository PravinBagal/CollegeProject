package com.college.HomeRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.college.model.College;

@Repository
public interface HomeRepository extends JpaRepository<College, Integer> {
//	public Integer findByCid(Integer cid);
//	select * from college where cid=?
	//College GetByIdData(int cid);
}
