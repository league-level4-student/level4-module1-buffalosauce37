package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs.
	
	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	//    a different horoscope based on the Zodiac's state.
	static void horoscope(Zodiac z) {
		switch(z) {
		case ARIES:
			JOptionPane.showMessageDialog(null, "Jah Seh Onfroy will visit you soon");
			break;
		case TAURUS:
			JOptionPane.showMessageDialog(null, "Horoscopes do nothing");
			break;
		case GEMINI:
			JOptionPane.showMessageDialog(null, "Who even looks at these");
			break;
		case CANCER:
			JOptionPane.showMessageDialog(null, "You will die in you sleep");
			break;
		case LEO:
			JOptionPane.showMessageDialog(null, "You will never die");
			break;
		case VIRGO:
			JOptionPane.showMessageDialog(null, "You are better than everyone else");
			break;
		case LIBRA:
			JOptionPane.showMessageDialog(null, "You will experience the biggest of OOFS");
			break;
		case SCORPIO:
			JOptionPane.showMessageDialog(null, "You secretly love Jesus");
			break;
		case SAGITTARIUS:
			JOptionPane.showMessageDialog(null, "You are an alchohlic");
			break;
		case CAPRICORN:
			JOptionPane.showMessageDialog(null, "You are always right");
			break;
		case AQUARIUS:
			JOptionPane.showMessageDialog(null, "You are always wrong");
			break;
		case PISCES:
			JOptionPane.showMessageDialog(null, "You sare the worst person ever");
			break;
		}
	}
	// 3. Make a main method to test your method
	public static void main(String[] args) {
		Zodiac[] options = Zodiac.values();

		int input = JOptionPane.showOptionDialog(null, "What zodic are you", "Custom Buttons", 0, -1, null,
				options, 0);
		
		Zodiac chosen = options[input];
		horoscope(chosen);
	}
}
