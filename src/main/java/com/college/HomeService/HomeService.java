package com.college.HomeService;

import java.util.List;

import com.college.model.College;

public interface HomeService {

	void saveData(College college);

	List<College> getData();

	void deleteData(int cid);

	void updateData(College c);

	College GetIdByData(int cid);

}
