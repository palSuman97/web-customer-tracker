package allPackages.dao;

import java.util.List;

import allPackages.entity.Customer;

public interface CustomerDAO {
	
	List<Customer> getCustomerList();

	void saveCustomer(Customer customer);

	Customer getCustomerWithId(int customerId);

	void deleteCustomer(int customerId);
}
