package ch.aaap.taxrefund.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import ch.aaap.taxrefund.model.Purchase;

public interface PurchaseRepo extends CrudRepository<Purchase, Long> {
	List<Purchase> findByCustomerIdAndCertificateIdIsNull(@Param("customerId") Long customerId);
	List<Purchase> findByCustomerIdAndCertificateIdIsNotNull(@Param("customerId") Long customerId);
}
