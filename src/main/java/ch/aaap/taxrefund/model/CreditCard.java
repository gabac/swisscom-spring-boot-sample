package ch.aaap.taxrefund.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CREDIT_CARD")
public class CreditCard implements Serializable {

	private static final long serialVersionUID = 7629110436717809352L;

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "CARD_PAN", nullable = false, unique = true)
	private String cardPan;

	@Column(name = "OWNER_ID", nullable = false)
	private String ownerId;

	public Long getId() {
		return id;
	}

	public String getCardPan() {
		return cardPan;
	}

	public void setCardPan(String cardPan) {
		this.cardPan = cardPan;
	}

	public String getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}

}
