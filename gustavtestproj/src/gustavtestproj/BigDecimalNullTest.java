package gustavtestproj;

import java.math.BigDecimal;

public class BigDecimalNullTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BigDecimal big = new BigDecimal(0);
		
		big.add(new BigDecimal(1));
		big.add(null);

		System.out.println(big.toString());
	}

}
