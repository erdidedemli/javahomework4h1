package javahomework4h1;

public class StarbucksCustomerCheck implements CustomerCheck{

	@Override
	public boolean isReal(Customer customer) {
			if(!customer.getFirstName().isEmpty()) {
				return true;
			}else {
				return false;
			}
			
		
		
	}

}
