package javahomework4h1;

public class StarbucksCustomerManager extends BaseCustomerManager{

	CustomerCheck customerCheck;
	
	public StarbucksCustomerManager (CustomerCheck customerCheck) {
		this.customerCheck=customerCheck;
	}
	
	@Override
	public void add(Customer customer) {
		if(customerCheck.isReal(customer)) {
			System.out.println(customer.getFirstName()+" "+customer.getLastName()
			+" kullan�c�s� starbucksa eklendi");
		}
		else {
			System.out.println("Kullan�c� ekleme i�lemi ba�ar�s�z");
		}
		
		
	}
}
