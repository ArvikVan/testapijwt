package arv.consumeapirt.controller;

import arv.consumeapirt.models.Datum;
import arv.consumeapirt.models.Message;
import arv.consumeapirt.service.MessageReportService;
import arv.consumeapirt.service.MessageReportServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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

    /*    private static final String url = "https://jsonplaceholder.typicode.com/users";

        @GetMapping("/consume-api-by-rest-template")
        public List<Object> getSomeApi() {
            Object[] hhruapi = restTemplate.getForObject(url, Object[].class);
            assert hhruapi != null;
            return Arrays.asList(hhruapi);
        }*/
    @GetMapping("/")
    public ResponseEntity<Datum> getMessageInfo(@RequestHeader("Authorization") String token,
                                                @RequestParam String dateFrom,
                                                @RequestParam String dateTo,
                                                @RequestParam String msids) {
        //return new ResponseEntity<>(messageReportService.getMessageInfo(token, dateFrom, dateTo, msids, type), HttpStatus.OK);
        return messageReportService.getMessageInfo(token, dateFrom, dateTo, msids);
    }
}
