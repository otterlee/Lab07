package edu.handong.csee.java.lab07.prob1;
import java.util.Scanner;

/**
 * This class is that calculates the century given a year.
 * This class has main method, public method calc_year.
 * 
 * @author Sua Lee
 *
 */

public class YearToCentury {
	/**
	 * This is a method that actually calculate the century.
	 * It takes the input year and divide by 100.
	 * And that quotient added by 1 is century.
	 * But in case that has no remainder, do not add 1 to century.
	 * 
	 * @param year
	 * @return century
	 */
	public int calc_year(int year) {
		int remainder = year % 100; //the ramainder that divided year by 100.
		int century = year / 100; //quotient that divide year by 100.
		if(remainder > 0) return century +1;//If there is remainder, return century+1.
		else return century;//If no remainder, return century.
	}
	/**
	 * This is a main method. 
	 * this takes the 'input_year' and print-out the 'output_century'. 
	 * And initiate class YearToCentury and Scanner.
	 *
	 */
	public static void main (String[] args) {
		int input_year, output_century;//declare input_year, output_century.
		Scanner keyboard = new Scanner(System.in);//initiate Scanner to keyboard.
		YearToCentury mYTC = new YearToCentury();//initiate YearToCentury to mYTC.
		System.out.println("Input year: ");//prompt to enter the input year.
		input_year = keyboard.nextInt();//assign input value to 'input_year'
		output_century = mYTC.calc_year(input_year);//assign return value of calc_year.
		System.out.println(input_year +" is "+output_century+"th century");//print-out given year and century 
	}
}
