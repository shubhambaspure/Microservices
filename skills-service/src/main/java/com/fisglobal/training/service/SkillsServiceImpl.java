package com.fisglobal.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fisglobal.training.model.Skills;
import com.fisglobal.training.repository.SkillsRepository;

@Service
public class SkillsServiceImpl implements SkillsService{
	
	@Autowired
	private SkillsRepository skillrepository;
	@Override
	public boolean saveSkills(Skills skills) {
		// TODO Auto-generated method stub
		skillrepository.save(skills);
		return true;
	}

	@Override
	public boolean updateSkills(Skills skills) {
		// TODO Auto-generated method stub
		skillrepository.save(skills);
		return true;
	}

	@Override
	public boolean deleteSkills(Integer id) {
		// TODO Auto-generated method stub
		skillrepository.deleteById(id);
		return true;
	}

	@Override
	public Skills getbyid(Integer id) {
		// TODO Auto-generated method stub
		return skillrepository.getById(id);
	}

	@Override
	public List<Skills> getAllSkills() {
		// TODO Auto-generated method stub
		return skillrepository.findAll();
	}

}
