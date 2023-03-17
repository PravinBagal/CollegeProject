package com.college.HomeService;

import java.util.List;

import com.college.Exceptions.ResourceNotFoundException;
import com.college.model.College;

public interface HomeService {

	void saveData(College college);

	List<College> getData();

	void deleteData(int cid) throws ResourceNotFoundException;

	College updateData(College c, int cid) throws ResourceNotFoundException;

	College GetIdByData(int cid);

}
