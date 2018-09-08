package com.nuttipongt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nuttipongt.domain.DomainObject;
import com.nuttipongt.repository.SimpleRepository;

@Service
public class SimpleService {

	@Autowired
	public SimpleRepository simpleRepository;
	
	public DomainObject findDomainObject() {
		return simpleRepository.findDomainObject();
	}
	
}
