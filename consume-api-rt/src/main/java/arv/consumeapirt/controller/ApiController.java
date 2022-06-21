package arv.consumeapirt.controller;

import arv.consumeapirt.models.Dat;
import arv.consumeapirt.models.Datum;
import arv.consumeapirt.models.Message;
import arv.consumeapirt.models.dto.MessageInfo;
import arv.consumeapirt.models.dto.MessagesInfos;
import arv.consumeapirt.service.MessageReportServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
        return messageReportService.getMessageInfoDatum(token, dateFrom, dateTo, msids);
    }

    @GetMapping("/getMass")
    public ResponseEntity<Message> getMess(@RequestParam String dateFrom,
                                           @RequestParam String dateTo,
                                           @RequestParam String msids) {
        return ResponseEntity.ok(messageReportService.getMass(dateFrom, dateTo, msids));
    }
    @GetMapping("/getMasss")
    public List<Dat.Mess> getMesss(Dat dat) {
        //messageReportService.getMessageInfo(token, dateFrom, dateTo, msids);
        return dat.getMessList();
    }
    @GetMapping("/getMD")
    public ResponseEntity<MessagesInfos> getMD(
                                @RequestParam String dateFrom,
                                @RequestParam String dateTo,
                                @RequestParam String msids) {
        return ResponseEntity.ok(messageReportService.getMD(dateFrom, dateTo, msids));
    }
}
