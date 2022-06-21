package arv.consumeapirt.service;


import arv.consumeapirt.models.Dat;
import arv.consumeapirt.models.Datum;
import arv.consumeapirt.models.Message;
import arv.consumeapirt.models.dto.MessagesInfos;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author ArvikV
 * @version 1.0
 * @since 06.06.2022
 */
@Service
public class MessageReportServiceImpl implements MessageReportService {
    private final RestTemplate restTemplate;

    private static final String url = "https://api.mcommunicator.ru/v2/messageManagement/messages";

    public MessageReportServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public Dat.Mess[] getMesss(String dateFrom, String dateTo, String msids) {
        String token = "83d70801-3d6c-4399-abab-f357204f4b84";
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.set("Authorization", "Bearer " + token);
        HttpEntity<Dat.Mess> request = new HttpEntity<>(httpHeaders);
        ResponseEntity<Dat.Mess[]> messageReport = restTemplate.exchange(
                url + "?dateFrom="+dateFrom+"&dateTo="+dateTo+"&msids="+msids, HttpMethod.GET, request, Dat.Mess[].class);

        return messageReport.getBody();
    }

    @Override
    public ResponseEntity<Datum> getMessageInfoDatum(String token, String dateFrom, String dateTo, String msids) {
        token = "83d70801-3d6c-4399-abab-f357204f4b84";
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.set("Authorization", "Bearer " + token);
        HttpEntity<Datum> request = new HttpEntity<Datum>(httpHeaders);
        ResponseEntity<Datum> messageReport = restTemplate.exchange(
                url + "?dateFrom="+dateFrom+"&dateTo="+dateTo+"&msids="+msids, HttpMethod.GET, request, Datum.class);

        return messageReport;
    }

    /**
     *
     * @param dateFrom дата от
     * @param dateTo дата до
     * @param msids номер телефона
     * @return на выходе джсон с нужными параметрами
     */
    public Message getMass(String dateFrom, String dateTo, String msids) {
        String token = "83d70801-3d6c-4399-abab-f357204f4b84";
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.set("Authorization", "Bearer " + token);
        HttpEntity<Message> request = new HttpEntity<>(httpHeaders);
        return restTemplate.exchange(
                url + "?dateFrom="+dateFrom+"&dateTo="+dateTo+"&msids="+msids, HttpMethod.GET, request, Message.class).getBody();
    }

    /**
     *
     * @param dateFrom дата от
     * @param dateTo дата до
     * @param msids номер телефона
     * @return на выходе нужный нам джсон
     */
    public MessagesInfos getMD(String dateFrom, String dateTo, String msids) {
        String token = "83d70801-3d6c-4399-abab-f357204f4b84";
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.set("Authorization", "Bearer " + token);
        HttpEntity<MessagesInfos> request = new HttpEntity<>(httpHeaders);
        return restTemplate.exchange(
                url + "?dateFrom="+dateFrom+"&dateTo="+dateTo+"&msids="+msids, HttpMethod.GET, request, MessagesInfos.class).getBody();
    }

    /**
     *
     * @param messageID айди сообщения
     * @return на выходе данные сообщения
     */
    public Message getMessageByMessageID(String messageID) {
        String token = "83d70801-3d6c-4399-abab-f357204f4b84";
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.set("Authorization", "Bearer " + token);
        HttpEntity<Message> request = new HttpEntity<>(httpHeaders);
        return restTemplate.exchange(url + "/" + messageID, HttpMethod.GET, request, Message.class).getBody();
    }
}
