package arv.testapijwt.controller;

import arv.testapijwt.model.Clients;
import arv.testapijwt.service.ClientServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author ArvikV
 * @version 1.0
 * @since 02.05.2022
 */
@RestController
@RequestMapping("/data")
public class DataController {
    @Autowired
    private ClientServiceImpl clientService;

    @PostMapping("/add")
    public ResponseEntity<Clients> addNewClient(@RequestBody Clients clients) {
        Clients saveClient = clientService.createClient(clients);
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("location", "/data/add" + saveClient.getName().toString());
        return new ResponseEntity<>(httpHeaders, HttpStatus.CREATED);
    }
}
