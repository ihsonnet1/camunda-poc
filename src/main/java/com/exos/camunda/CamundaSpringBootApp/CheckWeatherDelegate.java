package com.exos.camunda.CamundaSpringBootApp;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import camundajar.impl.scala.util.Random;

public class CheckWeatherDelegate implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		
		Random rando = new Random();
		
		execution.setVariable("name", "Niall");
		execution.setVariable("weatherOk",rando.nextBoolean());

	}

}
