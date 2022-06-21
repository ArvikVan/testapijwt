package arv.consumeapirt.service;

import arv.consumeapirt.models.Dat;
import arv.consumeapirt.models.Datum;
import org.springframework.http.ResponseEntity;

/**
 * @author ArvikV
 * @version 1.0
 * @since 06.06.2022
 */
public interface MessageReportService {
    //List<Dat> getMessageInfoDat(String dateFrom, String dateTo, String msids);
    Dat.Mess[] getMesss(String dateFrom, String dateTo, String msids);
    ResponseEntity<Datum> getMessageInfoDatum(String token, String dateFrom, String dateTo, String msids);


}
