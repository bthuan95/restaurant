package com.restaurant.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.restaurant.entities.Customer;

@Component
public class CustomerDAO {
	// Dummy database. Initialize with some dummy values.
		private static List<Customer> customers;
		{
			customers = new ArrayList<Customer>();
			customers.add(new Customer(101, "John", "Doe", "djohn@gmail.com", "121-232-3435"));
			customers.add(new Customer(201, "Russ", "Smith", "sruss@gmail.com", "343-545-2345"));
			customers.add(new Customer(301, "Kate", "Williams", "kwilliams@gmail.com", "876-237-2987"));
			customers.add(new Customer(System.currentTimeMillis(), "Viral", "Patel", "vpatel@gmail.com", "356-758-8736"));
		}

		/**
		 * Returns list of customers from dummy database.
		 * 
		 * @return list of customers
		 */
		public List<Customer> list() {
			return customers;
		}
}
