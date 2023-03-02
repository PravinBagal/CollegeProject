package com.college.ServiceImpl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.college.HomeRepository.HomeRepository;
import com.college.HomeService.HomeService;
import com.college.model.College;

@Service
public class ServiceImpl implements HomeService {

	@Autowired
	HomeRepository hr;

	private static final Logger logger = LoggerFactory.getLogger(ServiceImpl.class);

	@Override
	public void saveData(College college) {
		// int c = college.getCid();
		// College cs = hr.findByCid(c);
		// if (cs == null) {
		hr.save(college);
		// } else {
		// System.out.println("CID is already Present");
		// }

	}

	@Override
	public List<College> getData() {
		// return hr.findAll();
		List<College> colleges = new ArrayList<>();
		hr.findAll().forEach(colleges::add);
		return colleges;
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
		College college = hr.findByCid(cid);
		if (college == null) {
			logger.info("This is data is not present");
		}
		return hr.findById(cid).get();
	}
}