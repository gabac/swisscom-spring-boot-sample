package ch.aaap.taxrefund.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import ch.aaap.taxrefund.model.CreditCard;

public interface CreditCardRepo extends CrudRepository<CreditCard, Long> {

	CreditCard findByCardPan(@Param("cardPan") String pan);

}
