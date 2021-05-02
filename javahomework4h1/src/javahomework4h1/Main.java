package javahomework4h1;

public class Main {

	public static void main(String[] args) {
	     Customer customer=new Customer();
	     customer.setId(1);
	     customer.setFirstName("Erdi");
	     customer.setLastName("Dedemli");
	     customer.setNationalityId("1234562");
	     
	     NeroCustomerManager neroCustomerManager=new NeroCustomerManager();
	     neroCustomerManager.add(customer);
	     
	     Customer customer1=new Customer();
	     customer1.setId(1);
	     customer1.setFirstName("Emre");
	     customer1.setLastName("Dedemli");
	     customer1.setNationalityId("78905446");
	     
	     StarbucksCustomerManager starbucksCustomerManager=new StarbucksCustomerManager(new StarbucksCustomerCheck());
	     starbucksCustomerManager.add(customer1);
	
	}

}
