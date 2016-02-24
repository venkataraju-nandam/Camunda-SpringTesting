package com.att.oce.bpm.camunda;

import org.camunda.bpm.engine.RuntimeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

public class Starter implements InitializingBean {

	  @Autowired
	  private RuntimeService runtimeService;
	  static Logger LOGGER = LoggerFactory.getLogger(Starter.class);
	  
	  public void afterPropertiesSet() throws Exception {
	    runtimeService.startProcessInstanceByKey("UpgradeDf-Process");
	    LOGGER.info("Initializing afterPropertiesSet App --------------------");
	  }

	  public void setRuntimeService(RuntimeService runtimeService) {
	    this.runtimeService = runtimeService;
	    LOGGER.info("Initializing setRuntimeService --------------------");
	  }
	}