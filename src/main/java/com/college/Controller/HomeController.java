package com.college.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.college.HomeService.HomeService;
import com.college.model.College;

@RestController
public class HomeController {

	@Autowired
	HomeService hs;

	@PostMapping("/addData")
	public String addData(@RequestBody College college) {
		hs.saveData(college);
		return "Data Added Successfully";
	}

	@GetMapping("/getData")
	public List<College> getData() {
		return hs.getData();
	}

	@DeleteMapping("/deleteData/{cid}")
	public String deleteData(@PathVariable("cid") int cid) {
		hs.deleteData(cid);
		return "Delete Data Successfully";
	}

	@PutMapping("/updateData/{cid}")
	public College updateData(@RequestBody College c,@PathVariable ("cid") int cid) {
		hs.updateData(c,cid);
		return c;
	}

	@GetMapping("/GetIdByData/{cid}")
	public College GetOneData(@PathVariable("cid") int cid) {
		return hs.GetIdByData(cid);
	}
}