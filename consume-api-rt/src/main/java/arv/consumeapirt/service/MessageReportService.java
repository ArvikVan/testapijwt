package arv.consumeapirt.service;

import arv.consumeapirt.models.Datum;
import arv.consumeapirt.models.Message;
import org.springframework.http.ResponseEntity;

/**
 * @author ArvikV
 * @version 1.0
 * @since 06.06.2022
 */
public interface MessageReportService {
    ResponseEntity<Datum> getMessageInfo(String token, String dateFrom, String dateTo, String msids);
}
