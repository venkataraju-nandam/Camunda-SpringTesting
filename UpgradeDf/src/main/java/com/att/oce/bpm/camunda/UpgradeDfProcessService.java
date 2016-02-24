package com.att.oce.bpm.camunda;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UpgradeDfProcessService implements JavaDelegate {
	
	static Logger LOGGER = LoggerFactory.getLogger(UpgradeDfProcessService.class);
	 
	public void execute(DelegateExecution delegate) throws Exception {

		LOGGER.info("\n\n (UpgradeDfProcessService)Spring Bean invoked.");

	}
}
