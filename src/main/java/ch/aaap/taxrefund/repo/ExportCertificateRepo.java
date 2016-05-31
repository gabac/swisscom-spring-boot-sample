package ch.aaap.taxrefund.repo;

import org.springframework.data.repository.CrudRepository;

import ch.aaap.taxrefund.model.ExportCertificate;

public interface ExportCertificateRepo extends CrudRepository<ExportCertificate, Long> {

}
