package com.college.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.college.HomeRepository.HomeRepository;
import com.college.HomeService.HomeService;
import com.college.model.College;

@Service
public class ServiceImpl implements HomeService {

	@Autowired
	HomeRepository hr;

	@Override
	public void saveData(College college) {
		hr.save(college);

	}

	@Override
	public List<College> getData() {
		return hr.findAll();
	}

	@Override
	public void deleteData(int cid) {
		hr.deleteById(cid);
	}

	@Override
	public void updateData(College c) {
		hr.save(c);
	}

	@Override
	public College GetIdByData(int cid) {
		return hr.findById(cid).get();
	}
}
