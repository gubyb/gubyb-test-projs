package numbeformattest;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTester {

		public static void main(String[] args) throws Exception {

			double num = 1323.526;

			NumberFormat defaultFormat = NumberFormat.getCurrencyInstance();
			System.out.println("US: " + defaultFormat.format(num));

			Locale norway = new Locale("da", "DK");
			NumberFormat norwayFormat = NumberFormat.getCurrencyInstance(norway);
			System.out.println("Denmark: " + norwayFormat.format(num));

		}

}
