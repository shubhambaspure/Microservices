package com.fisglobal.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fisglobal.training.model.Skills;
import com.fisglobal.training.service.SkillsService;

@RestController
@RequestMapping("/api")
public class SkillsRestController {
	@Autowired
	private SkillsService skillsService;
	
	@GetMapping("/skills")
	public List<Skills> getAllSklls()
	{
		return skillsService.getAllSkills();
	}
	
	@PutMapping("/skills")
	public boolean update(@RequestBody Skills skills)
	{
		skillsService.updateSkills(skills);
		return true;
	}
	
	@PostMapping("/skills")
	public boolean add(@RequestBody Skills skills)
	{
		skillsService.saveSkills(skills);
		return true;
	}
	@DeleteMapping("/skills/{id}")
	public String deleteSkills(@PathVariable("id") Integer id)
	{
		skillsService.deleteSkills(id);
		return "Skills with id="+id+" deleted sucessfully";
	}
	@GetMapping("/skills/{id}")
	public Skills getById(@PathVariable("id") Integer id)
	{
		return skillsService.getbyid(id);
		
	}
	
	
}
