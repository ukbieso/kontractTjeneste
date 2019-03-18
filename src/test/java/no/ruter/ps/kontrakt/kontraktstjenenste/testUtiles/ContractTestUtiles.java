package no.ruter.ps.kontrakt.kontraktstjenenste.testUtiles;

import no.ruter.ps.kontrakt.kontraktstjenenste.kontraktDomainModel.TotalPlannedDistanceInKontrak;

public class ContractTestUtiles {


    public static Integer contractId = 1235;
    public static String contractNumber = "contractNumber";
    public static String contractName = "contractName";
    public static String operatorName = "operatorName";
    public static String validityPeriod = "validityPeriod";
    public static String line = "line";
    public static TotalPlannedDistanceInKontrak totalDistanceInKMPerDateType ;
    public static String productionRequiredInPercent = "50%";
    public static String plannedRequiredDistanceInKM = "plannedRequiredDistanceInKM";
    public static String actualDistanceInKM = "actualDistanceInKM";
    public static String actualCalculatedInPercent = "actualCalculatedInPercent";
    public static String missedDistanceInPercent = "missedDistanceInPercent";
    public static long totalFee = 0l;
    public static String reasoningFromOperator = "reasoningFromOperator";
    public static String reasoningApproved = "reasoningApproved";
    public static  String totalDistanceInKM = "totalDistanceInKM";
    public static String diatnacePerEveryDay = "diatnacePerEveryDay";
    public static String distancePerEveryDaySchoole = "distancePerEveryDaySchoole";
    public static String distancePerSaturday = "distancePerSaturday";
    public static String distancePerSunday = "distancePerSunday";


    public static TotalPlannedDistanceInKontrak getTotalDistanceInKMPerDateType() {
        totalDistanceInKMPerDateType = new TotalPlannedDistanceInKontrak();
        totalDistanceInKMPerDateType.setDiatnacePerEveryDay(diatnacePerEveryDay);
        totalDistanceInKMPerDateType.setDistancePerEveryDaySchoole(distancePerEveryDaySchoole);
        totalDistanceInKMPerDateType.setDistancePerSaturday(distancePerSaturday);
        totalDistanceInKMPerDateType.setDistancePerSunday(distancePerSunday);
        totalDistanceInKMPerDateType.setTotalDistanceInKM(totalDistanceInKM);
        return totalDistanceInKMPerDateType;
    }
}
