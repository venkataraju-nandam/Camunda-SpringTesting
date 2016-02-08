package com.att.oce.bpm.camunda;

import org.camunda.bpm.engine.RuntimeService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

public class Starter implements InitializingBean {

	  @Autowired
	  private RuntimeService runtimeService;

	  public void afterPropertiesSet() throws Exception {
	    runtimeService.startProcessInstanceByKey("UpgradeDf-Process");
	    System.out.println("Initializing afterPropertiesSet App --------------------");
	  }

	  public void setRuntimeService(RuntimeService runtimeService) {
	    this.runtimeService = runtimeService;
	    System.out.println("Initializing setRuntimeService --------------------");
	  }
	}