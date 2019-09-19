/**
* Purpose:This stopwatch program is for measuring the time that elapses between the start and end Time. ­
* @author Ganesh Mule
* @version 1.0
* 
**/
package com.bridgelabz.functional;

public class StopWatch_13 
{
	public long startTimer=0;
	public long stopTimer=0;
	public long elapsed;
	
	//to start timer
	public void start()
	{
		startTimer=System.currentTimeMillis();
		System.out.println("Start Time is: "+startTimer);
	}
	
	// to stop timer
	public void stop()
	{
		stopTimer=System.currentTimeMillis();
		System.out.println("Stop Time is: "+stopTimer);
	}
	
	public long getElapsedTime()
	{
		elapsed=stopTimer-startTimer;
		return elapsed;
	}
	
	public static void main(String[] args) throws Exception
	{
		StopWatch_13 sw=new StopWatch_13();
		System.out.println("Press '1' to Start Time: ");
		com.bridgelabz.utility.Utility.integerInput();
		sw.start();

		System.out.println();
		System.out.println("Press '2' to Stop Time: ");
		com.bridgelabz.utility.Utility.integerInput();;
		sw.stop();

		long l=sw.getElapsedTime();
		System.out.println();
		System.out.println("Total Time Elapsed(in millisec) is:"+l);
		System.out.println();
		System.out.println("Converting millisec to seconds: "+(l/1000)+" sec");
	}
}