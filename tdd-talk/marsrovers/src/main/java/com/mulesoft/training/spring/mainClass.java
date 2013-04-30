package com.mulesoft.training.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainClass 
{
	public static void main (String ... args)
	{
	//	MarsRover rover = new MarsRover(new Point(1,2),CardinalPoint.NORTH);
	//	rover.moveForward();
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

		MarsRover rover = (MarsRover) context.getBean("helloWorld");
	    
	    rover();
	}
}
