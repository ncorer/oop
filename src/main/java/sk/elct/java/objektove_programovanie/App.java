package sk.elct.java.objektove_programovanie;

import java.io.File;

import sk.upjs.jpaz2.ObjectInspector;

public class App {
	public static void main(String[] args) {
		RobotCalculator pavol = new RobotCalculator();
		RobotCalculator michal = new RobotCalculator();

		System.out.println(michal.randomNumber(10, 15));
		System.out.println(pavol.randomNumber(10, 15));
		
		
		System.out.println(michal.average(1, 4, 2));
		
		double avg = pavol.avgHeight(120,250);
		System.out.println(avg);
		
		System.out.println(pavol.randomWord(10));
		System.out.println(michal.randomWord2(10));
		
		System.nanoTime();
		
		ObjectInspector inspector = new ObjectInspector();
		String s = "abcd";
		StringBuilder sb = new StringBuilder();
		sb.append("gggg");
		
		
		File subor1 = new File("pom.xml");
		File subor2 = new File("nejakySubor.txt");
		inspector.inspect(subor1);
		inspector.inspect(subor2);
		
		
	}

}
