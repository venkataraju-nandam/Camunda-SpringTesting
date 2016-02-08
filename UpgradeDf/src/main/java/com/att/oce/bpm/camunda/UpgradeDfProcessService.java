package com.att.oce.bpm.camunda;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class UpgradeDfProcessService implements JavaDelegate {
	public void execute(DelegateExecution delegate) throws Exception {

	    System.out.println("\n\n (UpgradeDfProcessService)Spring Bean invoked.");

	  }
}
