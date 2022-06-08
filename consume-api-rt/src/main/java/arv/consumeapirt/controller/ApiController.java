package arv.consumeapirt.controller;

import arv.consumeapirt.models.Dat;
import arv.consumeapirt.models.Datum;
import arv.consumeapirt.models.Message;
import arv.consumeapirt.service.MessageReportServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ArvikV
 * @version 1.0
 * @since 20.05.2022
 */
@RestController
public class ApiController {
    private final MessageReportServiceImpl messageReportService;

    public ApiController(MessageReportServiceImpl messageReportService) {
        this.messageReportService = messageReportService;
    }
    @GetMapping("/")
    public ResponseEntity<Datum> getMessageInfo(@RequestHeader("Authorization") String token,
                                                @RequestParam String dateFrom,
                                                @RequestParam String dateTo,
                                                @RequestParam String msids) {
        return messageReportService.getMessageInfo(token, dateFrom, dateTo, msids);
    }

    @GetMapping("/getMass")
    public ResponseEntity<Message> getMess(@RequestParam String dateFrom,
                                                 @RequestParam String dateTo,
                                                 @RequestParam String msids) {
        //messageReportService.getMessageInfo(token, dateFrom, dateTo, msids);
        return messageReportService.getMass(dateFrom, dateTo, msids);
    }
}
