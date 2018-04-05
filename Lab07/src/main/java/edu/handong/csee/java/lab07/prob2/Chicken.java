package edu.handong.csee.java.lab07.prob2;

/**
 * This class is that sets name, price and stars of menu and gets them.
 * This class includes main method, constructor method, and change_stars, get_name, get_stars,
 * and 3 instance variables name, price, stars.
 * 
 * @author Sua Lee
 */

public class Chicken {
	
	String name; //Declare three instance variables
	double price;
	int stars;
	
	/**
	 * This is a constructor method.
	 * It takes the name, price and number of stars of menu in main method.
	 * and initialize menu's member.
	 * @param name of menu
	 * @param price of menu
	 * @param stars rating
	 */
	public Chicken(String name, double price, int stars) { //constructor overloading with the same name as class
		this.name = name; //Use 'this', when access instance variables of a class
		this.price = price; //set the parameter name, price, stars to the member of this object.
		this.stars = stars;
	}
	/**
	 * This method changes the stars value to newly input one.
	 * @param stars, actually number of star
	 */
	public void change_stars(int stars) {
		this.stars = stars;//Change to the newly received value of stars number.
	}
	/**
	 * This method gets the name of menu and return it.
	 * @return name
	 */
	public String get_name() {
		return this.name; //only get names from members.
	}

	/**
	 * This method gets the number of stars of menu and return it.
	 * @return name
	 */
	public int get_stars() {
		return this.stars;//only get number of stars from members.
	}
	/**
	 * This is main method.
	 * Instantiate class Chicken to menu 1, 2 and 3, and then change the number of stars in each menu.
	 * And print-out the star ratings of each menu.
	 * @param args, actually no parameter
	 */
	public static void main(String[] args) {
	Chicken menu1 = new Chicken("Cheese_mustard", 16000.00, 5);//instantiate class Chicken to menu1, and set the member directly in main method.
	Chicken menu2 = new Chicken("Honey_mustard", 16000.00, 5);//instantiate class Chicken to menu2.
	Chicken menu3 = new Chicken("Spicey_chicken", 16000.00, 1);//instantiate class Chicken to menu3.

	menu1.change_stars(3); //Change the stars value in menu1 to 3.
	menu2.change_stars(4); //Change the stars value in menu2 to 4.
	menu3.change_stars(1); //Change the stars value in menu3 to 1.

	System.out.println(menu1.get_name() + "'s rating is " + menu1.get_stars());//print-out the star ratings of menu1.
	System.out.println(menu2.get_name() + "'s rating is " + menu2.get_stars());//print-out the star ratings of menu2.
	System.out.println(menu3.get_name() + "'s rating is " + menu3.get_stars());//print-out the star ratings of menu3.
	}
}

