package com.college.HomeService;

import java.util.List;

import com.college.model.College;

public interface HomeService {

	void saveData(College college);

	List<College> getData();

	void deleteData(int cid);

	College updateData(College c, int cid);

	College GetIdByData(int cid);

}
