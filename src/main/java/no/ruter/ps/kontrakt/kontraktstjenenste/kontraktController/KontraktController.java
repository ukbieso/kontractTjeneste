package no.ruter.ps.kontrakt.kontraktstjenenste.kontraktController;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import no.ruter.ps.kontrakt.kontraktstjenenste.dataTransferObjects.KontractDto;
import no.ruter.ps.kontrakt.kontraktstjenenste.kontraktDomainModel.Kontrakt;
import no.ruter.ps.kontrakt.kontraktstjenenste.kontraktDomainModel.TotalPlannedDistanceInKontrak;
import no.ruter.ps.kontrakt.kontraktstjenenste.kontraktService.KontraktService;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/contracts")
@AllArgsConstructor
@Slf4j
public class KontraktController {

    private KontraktService kontraktService;

    @GetMapping("/all")
    public List<Kontrakt> getAllKontracts(){
        return kontraktService.getAllKontrakt();
    }

    @GetMapping("/contract/{contractId}")
    public Kontrakt getKontraktByKontraktId(@PathVariable(value = "contractId") Integer id){
        return kontraktService.getKontraktByKontraktId(id).isPresent()?
                kontraktService.getKontraktByKontraktId(id).get():new Kontrakt();
    }
    @GetMapping("/contract/{contractNumber}")
    public Kontrakt getKontractByKontractNumber(@PathVariable(value = "contractNumber") String kontractNumber){
        return kontraktService.getKontraktByKontraktNumber(kontractNumber).isPresent()?
                kontraktService.getKontraktByKontraktNumber(kontractNumber).get():new Kontrakt();
    }

    @PostMapping("/contract")
    public String saveKontrakt(@RequestBody KontractDto kontraktDto){
        log.info("input data is: {}",kontraktDto);
        ModelMapper mapper = new ModelMapper();
        Kontrakt kontrakt = new Kontrakt();
        TotalPlannedDistanceInKontrak totalPlannedDistanceInKontrak = new TotalPlannedDistanceInKontrak();
        mapper.map(kontraktDto,totalPlannedDistanceInKontrak);
        mapper.map(kontraktDto,kontrakt);
        log.info("after mapping the model: {} \n {}",kontrakt,totalPlannedDistanceInKontrak);
        kontraktService.saveKontract(kontrakt);//,totalPlannedDistanceInKontrak);
        return "successfuly save to database";
    }

    @PutMapping("/contract")
    public Kontrakt editKontractByKontraktNumber(@RequestBody Kontrakt kontract){
        log.info("Input kontract number: {}", kontract);
        return kontraktService.changeKontract(kontract);
    }

}
