package Question1.tax;

public class TaxTH implements TaxBehavior {

	@Override
	public double calculateTax(double purchase) {
		purchase = purchase + (purchase*0.07);
		return purchase;
	}

}
