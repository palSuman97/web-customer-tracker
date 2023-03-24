package allPackages.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import allPackages.dao.CustomerDAO;
import allPackages.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerDAO customerDAO;
	
	@Override
	@Transactional
	public List<Customer> getCustomerList() {
		
		return customerDAO.getCustomerList();
	}

	@Override
	@Transactional
	public void saveCustomer(Customer customer) {
		
		customerDAO.saveCustomer(customer);	
	}

	@Override
	@Transactional
	public Customer getCustomerWIthId(int customerId) {
		
		Customer customer= customerDAO.getCustomerWithId(customerId);
		return customer;
	}

	@Override
	@Transactional
	public void deleteCustomer(int customerId) {
		
		customerDAO.deleteCustomer(customerId);
	}

}
