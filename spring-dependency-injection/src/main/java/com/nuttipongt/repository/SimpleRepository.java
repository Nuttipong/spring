package com.nuttipongt.repository;

import org.springframework.stereotype.Repository;

import com.nuttipongt.domain.DomainObject;

@Repository
public class SimpleRepository {

	public DomainObject findDomainObject() {
		return new DomainObject();
	}
	
}
