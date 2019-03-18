package no.ruter.ps.kontrakt.kontraktstjenenste.kontraktDomainModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * En kontrakt entity som skal lages på database
 *
 *
 * @ukbay.gebremeskel@ruter.no
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "contracts")
public class Kontrakt {
    /**@Id@GeneratedValue(generator = "contractId_generator")
    @SequenceGenerator(name = "contractId_generator", sequenceName = "contract_Id",initialValue = 100)**/

    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer contractId;
    @Column(name = "")@NotNull
    private String contractNumber;
    //@Column(name = "")
    @NotNull
    private String contractName;
    //@Column(name = "")
    @NotNull
    private String operatorName;
   // @Column(name ="" )
    @NotNull
    private String validityPeriod;
    //@Column(name = "")
    @NotNull
    private String line;
    //@OneToOne
    //@JoinColumn(name="idTotalPlannedDistanceInKontrak")@NotNull
    @Embedded
    private TotalPlannedDistanceInKontrak totalPlannedDistanceInKontrak;
    @NotNull
    private String productionRequiredInPercent;
    //@Column(name = "")
    private String plannedRequiredDistanceInKM;
    //@Column(name = "")
    private String actualDistanceInKM;
    //@Column(name = "")
    private String actualCalculatedInPercent;
    //@Column(name = "")
    private String missedDistanceInPercent;
   // @Column(name = "")
    private long totalFee;
    //@Column(name = "")
    private String reasoningFromOperator;
   // @Column(name = "")
    private String reasoningApproved;

}
