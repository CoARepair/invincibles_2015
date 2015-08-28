package com.verizon.hackathon;

import java.util.Date;
import java.util.Random;

import org.apache.log4j.Logger;

public class LogGenerator 
{
	final static Logger logger = Logger.getLogger(LogGenerator.class);
	public static void logRunner(String timesStamp, int i, int j)
	{
		String[] nos = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};
		String[] pls = {"Olkhahoma", "California", "Miami", "Newyork", "Georgia", "Gotham", "New Mexico", "New Jersey", "Atlanta", "Chicago"};
		logger.debug("Debug from Server "+pls[j]+" Ticket Management server SenseEYe"+nos[i] + "AT " + new Date().getTime());
		logger.info("Info from Server "+pls[j]+" Ticket Management server SenseEYe"+nos[i] + "AT " + new Date().getTime());
	}
	public static void main(String[] args) 
	{
		Random randomGenerator = new Random();
		for(int j=0 ; j< 10 ;j++)
		{
			if(j==9)
			{
				j = 0;
			}
			for(int i = 0 ; i< 10 ; i++ )
			{
				LogGenerator.logRunner(new Date().getTime()+"", i, randomGenerator.nextInt(1000)%10);
			}
		}
	}
}
