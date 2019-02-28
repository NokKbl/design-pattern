package Question1.tax;

public class TaxNY implements TaxBehavior {

	@Override
	public double calculateTax(double purchase) {
		if (purchase > 100)
            purchase = purchase + (purchase*0.08);
		return purchase;
	}

}
