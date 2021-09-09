package com.fisglobal.training.service;

import java.util.List;

import com.fisglobal.training.model.Skills;

public interface SkillsService {
	
	public boolean saveSkills(Skills skills);
	public boolean updateSkills(Skills skills);
	public boolean deleteSkills(Integer id);
	public Skills getbyid(Integer id);
	public List<Skills> getAllSkills();

}
