package allPackages.service;

import java.util.List;

import allPackages.entity.Customer;

public interface CustomerService {

	public List<Customer> getCustomerList();

	public void saveCustomer(Customer customer);

	public Customer getCustomerWIthId(int customerId);

	public void deleteCustomer(int customerId);
}
