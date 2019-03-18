package no.ruter.ps.kontrakt.kontraktstjenenste.kontraktService;

import no.ruter.ps.kontrakt.kontraktstjenenste.testUtiles.ContractTestUtiles;
import no.ruter.ps.kontrakt.kontraktstjenenste.kontraktDomainModel.Kontrakt;
import no.ruter.ps.kontrakt.kontraktstjenenste.kontraktRepositories.KontraktRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.mockito.Mockito.when;


@RunWith(SpringRunner.class)
public class KontraktServiceTest {
    @InjectMocks
    private KontraktService kontraktService;
    @Mock
    private KontraktRepository kontraktRepository;
    private List<Kontrakt> contractList;
    private Kontrakt kontrakt;


    @Before
    public void setUp(){
        kontrakt = new Kontrakt(ContractTestUtiles.contractId,ContractTestUtiles.contractNumber,
                ContractTestUtiles.contractName,ContractTestUtiles.operatorName,ContractTestUtiles.validityPeriod,
                ContractTestUtiles.line,ContractTestUtiles.getTotalDistanceInKMPerDateType(),
                ContractTestUtiles.productionRequiredInPercent,ContractTestUtiles.plannedRequiredDistanceInKM,
                ContractTestUtiles.actualDistanceInKM,ContractTestUtiles.actualCalculatedInPercent,
                ContractTestUtiles.missedDistanceInPercent,ContractTestUtiles.totalFee,
                ContractTestUtiles.reasoningFromOperator,ContractTestUtiles.reasoningApproved);
        contractList = new ArrayList<>();
        contractList.add(kontrakt);
        when(kontraktRepository.findAll()).thenReturn(contractList);
        when(kontraktRepository.findById(ContractTestUtiles.contractId)).thenReturn(Optional.of(kontrakt));
        when(kontraktRepository.findByContractNumber(ContractTestUtiles.contractNumber)).thenReturn(Optional.of(kontrakt));
        when(kontraktRepository.save(kontrakt)).thenReturn(kontrakt);
    }


    /// *************************** GET ALL CONTRACT SERVICE  ******************************************** ///
    @Test
    public void getAllKontrakt_fetchsAllContract_ReturnsListOfContracts() throws Exception {
        List<Kontrakt> result = kontraktService.getAllKontrakt();
        Assert.assertNotNull(result);
        Assert.assertEquals(result,contractList);
        Assert.assertEquals(result.get(0).getContractId(),ContractTestUtiles.contractId);
    }


    /// *************************** GET A CONTRACT BY CONTRACT ID SERVICE  ******************************************** ///
    @Test
    public void getKontrakt_fetchAContractByContractId_ReturnsAContracts() throws Exception {
        Optional<Kontrakt> result = kontraktService.getKontraktByKontraktId(ContractTestUtiles.contractId);
        Assert.assertNotNull(result);
        Assert.assertEquals(result.get().getContractId(),ContractTestUtiles.contractId);
    }

    /// *************************** GET A CONTRACT BY CONTRACT NUMBER SERVICE  ******************************************** ///
    @Test
    public void getKontrakt_fetchAContractByContractNumber_ReturnsContracts() throws Exception {
        Optional<Kontrakt> result = kontraktService.getKontraktByKontraktNumber(ContractTestUtiles.contractNumber);
        Assert.assertNotNull(result);
        Assert.assertEquals(result.get().getContractNumber(),ContractTestUtiles.contractNumber);
        Assert.assertEquals(result.get().getContractId(),ContractTestUtiles.contractId);
    }

    /// *************************** SAVE A CONTRACT SERVICE  ******************************************** ///
    @Test
    public void saveAKontrakt_ReturnAContracts() throws Exception {
        Kontrakt result = kontraktService.saveKontract(kontrakt);
        Assert.assertNotNull(result);
        Assert.assertEquals(result, kontrakt);
        Assert.assertEquals(result.getContractId(),ContractTestUtiles.contractId);
    }

    /// *************************** change A CONTRACT SERVICE  ******************************************** ///
    @Test
    public void changeAOldKontraktProprties_ReturnANewChangedKontract() throws Exception {

        kontrakt.setContractName("newContractName");
        Kontrakt result = kontraktService.changeKontract(kontrakt);
        Assert.assertEquals(result.getContractName(),"newContractName");
    }

}
