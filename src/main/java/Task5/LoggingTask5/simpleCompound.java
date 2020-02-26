package Task5.LoggingTask5;

import java.io.*;
import java.util.*;
import java.lang.Math;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class simpleCompound
{
	public static Logger LOGGER = LogManager.getLogger(simpleCompound.class);
public static void main(String args[])  throws IOException
   {
      
   
Scanner s=new Scanner(System.in);
LOGGER.info("Enter principal amt,time,rate of intrest");
int p=s.nextInt();
int t=s.nextInt();
int r=s.nextInt();
int n=s.nextInt();
float si;
si=(p*t*r)/100;
//Double ci=(p* Math.pow(1 + (r / 100), t));
  Double ci=p*(Math.pow(1+r/(n*100),n*t));
ci=ci-p;
String SimpInt=Float.toString(si);
String CompInt=Double.toString(ci);
LOGGER.info("Simple Intrest:"+SimpInt+'\n');
LOGGER.info("Compound Intrest:"+CompInt);
}
}