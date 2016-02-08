package com.att.oce.bpm.camunda;

import org.camunda.bpm.application.PostDeploy;
import org.camunda.bpm.application.ProcessApplication;
import org.camunda.bpm.application.impl.ServletProcessApplication;
import org.camunda.bpm.engine.ProcessEngine;

@ProcessApplication("UpgradeDfApplication App")
public class UpgradeDfApplication extends ServletProcessApplication {
  // empty implementation
	@PostDeploy
	public void startProcessInstance(ProcessEngine processEngine) {
		System.out.println("\n\n\n*****UpgradeDfApplication App started !!! *****");
	}
}


//public class UpgradeDfApplication{
//  // empty implementation
//}