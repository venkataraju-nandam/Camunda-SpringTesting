package com.att.oce.bpm.camunda;

import org.camunda.bpm.application.PostDeploy;
import org.camunda.bpm.application.ProcessApplication;
import org.camunda.bpm.application.impl.ServletProcessApplication;
import org.camunda.bpm.engine.ProcessEngine;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@ProcessApplication("UpgradeDfApplication App")
public class UpgradeDfApplication extends ServletProcessApplication {
	 static Logger LOGGER = LoggerFactory.getLogger(UpgradeDfApplication.class);
			
	@PostDeploy
	public void startProcessInstance(ProcessEngine processEngine) {

		LOGGER.info("\n\n\n*****UpgradeDfApplication App started !!! *****");
	}
}