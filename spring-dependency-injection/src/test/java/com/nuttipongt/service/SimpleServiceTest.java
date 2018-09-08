package com.nuttipongt.service;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.nuttipongt.domain.DomainObject;
import com.nuttipongt.repository.SimpleRepository;

import configuration.AppConfigurationScanning;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfigurationScanning.class)
public class SimpleServiceTest {

	@Autowired
	public SimpleRepository simpleRepository;
	
	@Test
	public void findDomainObject() {
		assertThat(simpleRepository.findDomainObject(), equalTo(new DomainObject()));
	}
	
}
