package Task5.LoggingTask5;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Construction
{
	public static Logger LOGGER = LogManager.getLogger(Construction.class);
public static void main(String args[])  throws IOException
    {

    Scanner sc=new Scanner(System.in);
    LOGGER.info("Construction cost estimation:- ");
    LOGGER.info("Available Materials:- ");
LOGGER.info("1. Standard materials");
LOGGER.info("2. Above standard materials");
LOGGER.info("3.High standard materials");

LOGGER.info("4. High standard materials and fully automated home");
LOGGER.info("Choose(1-4): ");
try {
int choice = sc.nextInt();
double area, cost;
switch(choice) {
case 1:
LOGGER.info("Enter the area of house: ");
area = sc.nextDouble();
cost = (1200 * area);
LOGGER.info("Cost = " +cost+" Rupees");
break;
case 2:
LOGGER.info("Enter the area: ");
area = sc.nextDouble();
cost = (1500 * area);
LOGGER.info("The total cost to build the house = " +cost+" Rupees");
break;
case 3:
LOGGER.info("Enter the area: ");

area = sc.nextDouble();
cost = (1800 * area);
LOGGER.info("The total cost to build the house = " +cost+ " Rupees");
break;
case 4:
LOGGER.info("Enter the area: ");
area = sc.nextDouble();
cost = (2500 * area);
LOGGER.info("The total cost to build the house = " +cost+ " Rupees");
break;
default:
LOGGER.info("Please enter a valid input!!! ");
}
} catch (Exception e) {
LOGGER.info("Please enter a valid input!");

}

    }

}
