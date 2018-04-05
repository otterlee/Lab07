package edu.handong.csee.java.lab07.prob3;
import java.util.Random; 
/**
 * This class is that sets students data about attendance and check pass of fail and print-out message about absence.
 * This class includes constructor method, set_missed, check_missed and main method.
 * 
 * @author suagu
 *
 */
public class Attendance {
	String name = "";//Declare instance variable String name
	int year = 0;// Declare instance variable year
	String student_id = "";//Declare instance variable String student_id
	int missed = 0;//Declare instance variable missed to put how many time this person absent.
	/**
	 * This method is constructor method.
	 * It takes the name, year and student_id, missed time of student.
	 * And set them member of student data.
	 * @param name, year, student_id, missed
	 */
	public Attendance(String name, int year, String student_id, int missed) {
		this.name = name; //put the name received as parameter to instance variable name.
		this.year = year;//put the n received as parameter to instance variable name.
		this.student_id = student_id;//put the name received as parameter to instance variable name.
		this.missed = missed;//put the name received as parameter to instance variable name.
	}
	/**
	 * This method takes the parameter 'missed_time' and set to 'missed'.
	 * @param missed_time
	 */
	public void set_missed(int missed_time) {
		this.missed = missed_time; //put the value missed_time recieved as parameter into missed 
	}
	/**
	 * This method check whether the object's missed time is larger than 6.
	 * If larger than 6, print-out message to fail in this course and number of absence.
	 * If not, print-out message to show grade.
	 */
	public void check_missed() {
		if(this.missed > 6) { //if absent time is larger than 6,
			System.out.println("I'm sorry " + this.name + ". You fail this course"); //print-out fail message
			System.out.println(this.name +" - Number of absence: "+ this.missed); //print-out number of absence
		}
		else System.out.println("We'll see about the grade, " + this.name); //if absence time is smaller than 6, print-out message "We'll see about the grade,"
	}
	/**
	 * This is main method.
	 * In main method instantiates Random and class Attendance.
	 * and creates random number and set it by using set_missed method.
	 * and check pass or fail and print-out message by calling check_missed method.
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random randomGenerator = new Random(); //instantiate Random to randomGenerator.
		Attendance s1 = new Attendance("Jess", 4 , "21400999", 0); //instantiate class Attendance to s1 and set the member of s1 by constructor. 
		Attendance s2 = new Attendance("Martha", 2, "21733444", 0);//instantiate class Attendance to s2 and set the member of s2 by constructor.
		Attendance s3 = new Attendance("Lucas", 1, "21833222", 0);//instantiate class Attendance to s3 and set the member of s3 by constructor.
		Attendance s4 = new Attendance("Martha", 2, "21733444", 0);//instantiate class Attendance to s4 and set the member of s4 by constructor.
		
		s1.set_missed(randomGenerator.nextInt(10)); //create random number 0~10 and set it to s1's missed variable.
		s2.set_missed(randomGenerator.nextInt(10));//create random number 0~10 and set it to s2's missed variable.
		s3.set_missed(randomGenerator.nextInt(10));//create random number 0~10 and set it to s3's missed variable.
		s4.set_missed(randomGenerator.nextInt(10));//create random number 0~10 and set it to s4's missed variable.
		
		System.out.println("<PASS OR FAIL>");//print-out program name
		s1.check_missed();//call check_missed to check pass or fail and print-out message
		s2.check_missed();
		s3.check_missed();
		s4.check_missed();
	}

}
