package com.att.oce.bpm.camunda.ut;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.camunda.bpm.engine.ProcessEngine;
import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.TaskService;
import org.camunda.bpm.engine.impl.bpmn.parser.BpmnParseListener;
import org.camunda.bpm.engine.impl.bpmn.parser.FoxFailedJobParseListener;
import org.camunda.bpm.engine.impl.cfg.StandaloneInMemProcessEngineConfiguration;
import org.camunda.bpm.engine.task.Task;
import org.camunda.bpm.engine.test.Deployment;
import org.camunda.bpm.engine.test.ProcessEngineRule;
import org.junit.Rule;
import org.junit.Test;

//@ContextConfiguration(locations={"classpath*:applicationContext.xml"})
public class MyBusinessProcessTest {
	
//	   static{
//	        processEngine = StandaloneInMemProcessEngineConfiguration.
//	                            createStandaloneInMemProcessEngineConfiguration().
//	                            buildProcessEngine();
//	    }
//	    @Rule
//	    public ProcessEngineRule processEngineRule = new ProcessEngineRule(processEngine);
	
	// Programmatically getting processEngine .... 
	//https://groups.google.com/forum/#!topic/camunda-bpm-users/jKphn1KOjL8
	protected ProcessEngine createProcessEngineProgramatically() {
		  StandaloneInMemProcessEngineConfiguration processEngineConfiguration = new StandaloneInMemProcessEngineConfiguration();
		  processEngineConfiguration.setCustomPostBPMNParseListeners(Arrays.asList(new BpmnParseListener[]{new FoxFailedJobParseListener()}));
		  return processEngineConfiguration.buildProcessEngine();
	}
//	@Rule
//	public ProcessEngine processEngineRule = createProcessEngineProgramatically();
	
	@Rule
	public ProcessEngineRule processEngineRule = new ProcessEngineRule(createProcessEngineProgramatically());

//	  @Rule
//	  public ProcessEngineRule processEngineRule = new ProcessEngineRule();

	  @Test
	  @Deployment(resources = {"UpgradeDf.bpmn"})
	  public void ruleUsageExample() {
	    RuntimeService runtimeService = processEngineRule.getRuntimeService();
	    runtimeService.startProcessInstanceByKey("UpgradeDf-Process");

//	    TaskService taskService = processEngineRule.getTaskService();
//	    Task task = taskService.createTaskQuery().singleResult();
//	    assertEquals("My Task", task.getName());
//	    taskService.complete(task.getId());
	    assertEquals(0, runtimeService.createProcessInstanceQuery().count());
	    System.out.println("Completed Test MyProcess UpgradeDf-Process Camunda");
	  }
	}