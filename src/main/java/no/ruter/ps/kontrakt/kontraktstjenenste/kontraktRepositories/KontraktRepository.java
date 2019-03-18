package no.ruter.ps.kontrakt.kontraktstjenenste.kontraktRepositories;

import no.ruter.ps.kontrakt.kontraktstjenenste.kontraktDomainModel.Kontrakt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 *
 * kontrakt repository
 * @ukbay.gebremeskel@ruter.no
 *
 */
@Repository
public interface KontraktRepository extends JpaRepository<Kontrakt,Integer> {
    Optional<Kontrakt> findByContractNumber(String kontraktNumer);
}
