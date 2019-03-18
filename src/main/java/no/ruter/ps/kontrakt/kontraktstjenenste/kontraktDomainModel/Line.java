package no.ruter.ps.kontrakt.kontraktstjenenste.kontraktDomainModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Line {

    private String lineNumber;
    private String lineCode;
    private String lineName;
}
