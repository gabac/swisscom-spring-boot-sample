package ch.aaap.taxrefund.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "EXPORT_CERTIFICATE")
public class ExportCertificate implements Serializable {

	private static final long serialVersionUID = 639329711004507063L;

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "CERTIFIED_AT", nullable = false)
	private Date certifiedAt;

	@OneToMany
	@JoinColumn(name = "CERTIFICATE_ID")
	private Set<Purchase> certifiedPurchases;

	public Long getId() {
		return id;
	}

	public Set<Purchase> getCertifiedPurchases() {
		return certifiedPurchases;
	}

	public void setCertifiedPurchases(Set<Purchase> certifiedPurchases) {
		this.certifiedPurchases = certifiedPurchases;
	}

	public Date getCertifiedAt() {
		return certifiedAt;
	}

	public void setCertifiedAt(Date certifiedAt) {
		this.certifiedAt = certifiedAt;
	}

}
