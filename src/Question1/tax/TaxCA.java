package Question1.tax;

public class TaxCA implements TaxBehavior {

	@Override
	public double calculateTax(double purchase) {
		purchase = purchase + (purchase*0.075);
		return purchase;
	}

}
