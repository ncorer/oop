package sk.elct.java.objektove_programovanie;

public class App2 {

	public static void main(String[] args) {

		int[] cisla = {5,4,-8,-6,2,3,8,-45};
		int k = 80;
		
		RobotCalculator michal = new RobotCalculator();
		
		
		System.out.println(michal.kladnyPriemer(cisla, k));
		

	}

}
