package com.fisglobal.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fisglobal.training.model.Certificate;
import com.fisglobal.training.service.CertificateService;

@RestController
@RequestMapping("/api")
public class CertificateRestController {
	
	@Autowired
	public CertificateService certificateService;
	
	@GetMapping("/certificates")
	public List<Certificate> getAllCertificate()
	{
		return certificateService.findAllCertificate();
	}
	@GetMapping("/certificates/{id}")
	public Certificate getById(@PathVariable Integer id)
	{
		return certificateService.getById(id);
	}
	
	@PostMapping("/certificates")
	public boolean saveCertificate(@RequestBody Certificate certificate)
	{
		certificateService.saveCertificate(certificate);
		return true;
	}
	@PutMapping("/certificates")
	public boolean updateCertificate(@RequestBody Certificate certificate)
	{
		certificateService.updateCertificate(certificate);
		return true;
	}
	
	@DeleteMapping("/certificates/{id}")
	public boolean deleteCertificate(@PathVariable Integer id)
	{
		certificateService.deleteCertificate(id);
		return true;
	}
	
	
}
