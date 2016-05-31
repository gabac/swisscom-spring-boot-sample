package ch.aaap.taxrefund.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "PURCHASE")
public class Purchase implements Serializable {

	private static final long serialVersionUID = 5358675757895880265L;

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "MERCHANT_NAME", nullable = false)
	private String merchantName;

	@Column(name = "MERCHANT_City", nullable = false)
	private String merchantCity;

	@Column(name = "PURCHASE_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date purchaseDate;

	@OneToMany
	@JoinColumn(name = "PURCHASE_ID")
	private List<Item> items;

	@Column(name = "CUSTOMER_ID", nullable = false)
	private Long customerId;

	@Column(name = "CERTIFICATE_ID")
	private Long certificateId;

	public Long getId() {
		return id;
	}

	public String getMerchantName() {
		return merchantName;
	}

	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public Long getCertificateId() {
		return certificateId;
	}

	public void setCertificateId(Long certificateId) {
		this.certificateId = certificateId;
	}

	public String getMerchantCity() {
		return merchantCity;
	}

	public void setMerchantCity(String merchantCity) {
		this.merchantCity = merchantCity;
	}
}
