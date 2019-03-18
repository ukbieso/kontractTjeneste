
package no.ruter.ps.kontrakt.kontraktstjenenste.kontraktDomainModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@AllArgsConstructor
@Data
@NoArgsConstructor
//@Entity
//@Table(name = "DateType_IN_CONTRACT")
@Embeddable
public class TotalPlannedDistanceInKontrak {

    /**@Id@GeneratedValue(generator = "dageTypeInKontrakGenerator")
    @SequenceGenerator(name = "dageTypeInKontrakGenerator", sequenceName = "dagetypeId",initialValue = 100)**/

    //@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    //private Integer idTotalPlannedDistanceInKontrak;
    //@NotNull
    //private String contractNumber;
    @Column(name = "")@NotNull
    private String totalDistanceInKM;
    private String diatnacePerEveryDay;
    //@Column(name = "")
    private String distancePerEveryDaySchoole;
    //@Column(name = "")
    private String distancePerSaturday;
    //@Column(name = "")
    private String distancePerSunday;
}

