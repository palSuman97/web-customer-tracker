package allPackages.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import allPackages.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public List<Customer> getCustomerList() {
		
		Session session= sessionFactory.getCurrentSession();
		Query<Customer> customerQuery= session.createQuery("from Customer", Customer.class);
		List<Customer> customerList= customerQuery.getResultList();
		
		return customerList;
	}

	@Override
	public void saveCustomer(Customer customer) {
		
		Session session= sessionFactory.getCurrentSession();
		session.saveOrUpdate(customer);
	}

	@Override
	public Customer getCustomerWithId(int customerId) {
		
		Session session= sessionFactory.getCurrentSession();
		Customer customer= session.get(Customer.class, customerId);
		return customer;
	}

	@Override
	public void deleteCustomer(int customerId) {
		
		Session session= sessionFactory.getCurrentSession();
		
		Query query= session.createQuery("delete from Customer where id=:customerId");
		query.setParameter("customerId", customerId);
		query.executeUpdate();
	}

}
