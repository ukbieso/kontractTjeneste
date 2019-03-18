package no.ruter.ps.kontrakt.kontraktstjenenste.dataTransferObjects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class KontractDto {

    private String contractNumber;
    private String contractName;
    private String operatorName;
    private String validityPeriod;
    private String line;
    private String totalDistanceInKM;
    private String distancePerEveryDay;
    private String distancePerEveryDaySchool;
    private String distancePerSaturday;
    private String distancePerSunday;
    private String productionRequiredInPercent;
    private String plannedRequiredDistanceInKM;
    private String actualDistanceInKM;
    private String actualCalculatedInPercent;
    private String missedDistanceInPercent;
    private long totalFee;
    private String reasoningFromOperator;
    private String reasoningApproved;

}
