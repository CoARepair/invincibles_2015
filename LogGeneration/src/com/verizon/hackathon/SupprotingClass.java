package com.verizon.hackathon;

import org.apache.log4j.Logger;

public class SupprotingClass 
{
	final static Logger logger = Logger.getLogger(SupprotingClass.class);

	public static void divide()
	{
		try
		{
			int A = 10/0;
			System.out.println(A);
		}
		catch(Exception e)
		{
			logger.debug("Debugging variable initialization" );
		}
	}
	public static void runMe(String parameter)
	{
		if(logger.isDebugEnabled())
		{
			logger.debug("Debug the hackathon: " + parameter);
		}
		
		if(logger.isInfoEnabled())
		{
			logger.info("Info from " + parameter);
		}
		
		logger.debug("Warning from " + parameter);
		logger.info("Info message from " + parameter);
		logger.debug("Debug message from " + parameter);
	}
	
	public void dummyMethod()
	{
		
	}
}
