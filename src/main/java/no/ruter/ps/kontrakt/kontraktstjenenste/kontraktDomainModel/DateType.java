package no.ruter.ps.kontrakt.kontraktstjenenste.kontraktDomainModel;


/**
 * Denne objektor representer en dagtype av en kontrackt med avstand
 *
 *
 * @ukbay.gebremeskel@ruter.no
 */

public enum DateType {

    EVERYDAY("12345","distnace","kontrackId"),
    SCHOOLDAY("12345","distance","contractId"),
    Saturday("6","distance","contractId"),
    Sunday("7","distance", "contractId");

    private String dateTypeCode;
    private String dateTypeDistance;
    private String contractId;

    public String getDateTypeCode() {
        return dateTypeCode;
    }

    public String getDateTypeDistance() {
        return dateTypeDistance;
    }

    public String getContractId() {
        return contractId;
    }

    private DateType(String dateTypeCode, String distanc, String kontractId) {
        this.dateTypeCode = dateTypeCode;
        this.dateTypeDistance = distanc;
        this.contractId = kontractId;
    }

}
