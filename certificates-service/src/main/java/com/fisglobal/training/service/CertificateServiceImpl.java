package com.fisglobal.training.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fisglobal.training.model.Certificate;
import com.fisglobal.training.repository.CertificateRepository;

@Service
public class CertificateServiceImpl implements CertificateService
{
	
	@Autowired
	private CertificateRepository certificateRepository;
	
	@Override
	public boolean saveCertificate(Certificate certificate) {
		// TODO Auto-generated method stub
		certificate.setDateOfIssue(LocalDate.now());
		certificateRepository.save(certificate);
		return true;
	}

	@Override
	public boolean updateCertificate(Certificate certificate) {
		// TODO Auto-generated method stub
		certificateRepository.save(certificate);
		return true;
	}

	@Override
	public boolean deleteCertificate(Integer id) {
		// TODO Auto-generated method stub
		certificateRepository.deleteById(id);
		return true;
	}

	@Override
	public List<Certificate> findAllCertificate() {
		// TODO Auto-generated method stub
		
		return certificateRepository.findAll();
	}

	@Override
	public Certificate getById(Integer id) {
		// TODO Auto-generated method stub
		return certificateRepository.getById(id);
	}
	
	
}
