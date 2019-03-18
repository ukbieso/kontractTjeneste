package no.ruter.ps.kontrakt.kontraktstjenenste.kontraktService;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import no.ruter.ps.kontrakt.kontraktstjenenste.kontraktDomainModel.Kontrakt;
import no.ruter.ps.kontrakt.kontraktstjenenste.kontraktRepositories.KontraktRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 *
 *en kontarkt tjeneste ....
 *
 * @ukbay.gebremeskel@ruter.no
 */

@Service
@AllArgsConstructor
@Slf4j
public class KontraktService {

    private KontraktRepository kontraktRepository;
    //private TotalPlannedDistanceRepository totalPlannedDistanceRepository;
    /**
     *  hents alle kontrakter fra database
     * @return
     */
    public List<Kontrakt> getAllKontrakt(){
        return kontraktRepository.findAll();
    }

    /**
     *  hents et kontrakt etter søking med gitt kontrak Id, hvis det finnes
     * @param kontraktId
     * @return
     */
    public Optional<Kontrakt> getKontraktByKontraktId(Integer kontraktId){
        return kontraktRepository.findById(kontraktId);
    }

    /**
     * hents et kontrakt etter søking med gitt kontrakt nummer, hvis det finnes
     * @param kontraktNumer
     * @return
     */
    public Optional<Kontrakt> getKontraktByKontraktNumber(String kontraktNumer){
        return kontraktRepository.findByContractNumber(kontraktNumer);
    }

    /**
     *  bruks til å lagre en kontrak
     * @param kontrakt
     */
    public Kontrakt saveKontract(Kontrakt kontrakt){  //, TotalPlannedDistanceInKontrak totalPlannedDistanceInKontrak
        //TotalPlannedDistanceInKontrak s =totalPlannedDistanceRepository.save(totalPlannedDistanceInKontrak);
        //log.info("\n\n\nthe id of the obejct is: {}\n\n",s.getIdTotalPlannedDistanceInKontrak());
        //kontrakt.setTotalPlannedDistanceInKontrak(s);
        return kontraktRepository.save(kontrakt);
    }

    /**
     * bruks til å lagre en bulk kontrakts
     *
     * @param kontraktList
     */
    public void saveListOfKontrakts(List<Kontrakt> kontraktList){
        kontraktRepository.saveAll(kontraktList);
    }

    /**
     *
     * bruks til redigere en kontrakt
     * @param kontrakt
     * @return
     */
    public Kontrakt changeKontract(Kontrakt kontrakt){
        Kontrakt kontractOld = kontraktRepository.findByContractNumber(kontrakt.getContractNumber()).get();
        kontractOld.setContractName(kontrakt.getContractName());
        kontractOld.setLine(kontrakt.getLine());
        return kontraktRepository.save(kontractOld);
    }

}
