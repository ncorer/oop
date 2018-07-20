package sk.elct.java.objektove_programovanie;

public class RobotCalculator {

	public int randomNumber(int from, int to) {
		int random = (int) (Math.random() * (to - from + 1)) + from;
		return random;
	}

	public double average(int a, int b, int c) {
		double avg = (double) (a + b + c) / 3;
		return avg;

	}

	public double avgHeight(int min, int max) {
		return this.average(this.randomNumber(min, max), this.randomNumber(min, max), this.randomNumber(min, max));

	}

	public String randomWord(int n) {
		String result = "";
		for (int i = 0; i < n; i++) {
			char letter = (char) this.randomNumber('a', 'z');
			result += letter;
		}
		return result;
	}

	public String randomWord2(int n) { // omnoho efektivnejsia verzia prvej randomWord metody, kedse sa nemusi stale
										// vytvarat novy objekt pri appendovani, ale vytvori sa len jeden do ktoreho sa
										// apenduju chary
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < n; i++) {
			char letter = (char) this.randomNumber('a', 'z');
			result.append(letter);
		}
		return result.toString();
		// return new String(result);
	}

	public boolean kladnyPriemer(int[] cisla,int k) {
		if(cisla == null || cisla.length ==0)
			return false;
		
		if (k> cisla.length) {
			k= cisla.length;
		}
		
		int suma = 0;
		for (int i = 0; i<k;i++) {
			suma+=cisla[i];
		}
		double priemer = (double) suma/k;
		if (priemer>0) return true;
		else return false;
	}
	
}
