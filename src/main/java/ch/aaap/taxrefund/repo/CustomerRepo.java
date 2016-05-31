package ch.aaap.taxrefund.repo;

import org.springframework.data.repository.CrudRepository;

import ch.aaap.taxrefund.model.Customer;

public interface CustomerRepo extends CrudRepository<Customer, Long> {
}
