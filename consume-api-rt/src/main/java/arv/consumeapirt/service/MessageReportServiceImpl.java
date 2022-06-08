package arv.consumeapirt.service;


import arv.consumeapirt.models.Datum;
import arv.consumeapirt.models.Message;
import com.fasterxml.jackson.databind.util.JSONPObject;
import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Map;

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
    public ResponseEntity<Datum> getMessageInfo(String token, String dateFrom, String dateTo, String msids) {
        token = "83d70801-3d6c-4399-abab-f357204f4b84";
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.set("Authorization", "Bearer " + token);
        HttpEntity<Datum> request = new HttpEntity<Datum>(httpHeaders);
        ResponseEntity<Datum> messageReport = restTemplate.exchange(
                url + "?dateFrom="+dateFrom+"&dateTo="+dateTo+"&msids="+msids, HttpMethod.GET, request, Datum.class);

        return messageReport;
    }

    public ResponseEntity<Message> getMass(String dateFrom, String dateTo, String msids) {
        String token = "83d70801-3d6c-4399-abab-f357204f4b84";
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.set("Authorization", "Bearer " + token);
        HttpEntity<Message> request = new HttpEntity<>(httpHeaders);
        ResponseEntity<Message> messageReport = restTemplate.exchange(
                url + "?dateFrom="+dateFrom+"&dateTo="+dateTo+"&msids="+msids, HttpMethod.GET, request, Message.class);
        return messageReport;
    }
}
