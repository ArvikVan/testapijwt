package arv.manipulationservice.controller;

import arv.manipulationservice.model.Clients;
import arv.manipulationservice.model.Orders;
import arv.manipulationservice.service.ClientServiceImpl;
import arv.manipulationservice.service.OrdersServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
    @Autowired
    private OrdersServiceImpl ordersService;

    @PostMapping("/addClient")
    public ResponseEntity<Clients> addNewClient(@RequestBody Clients clients) {
        Clients saveClient = clientService.createClient(clients);
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("location", "/data/add" + saveClient.getName().toString());
        return new ResponseEntity<>(httpHeaders, HttpStatus.CREATED);
    }

    @PostMapping("/getAllClients")
    public List<Clients> getAllClients() {
        return clientService.getAllClients();
    }

    @PostMapping("/addOrder")
    public ResponseEntity<Orders> addNewOrder(@RequestBody Orders orders) {
        Orders saveOrder = ordersService.createOrders(orders);
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("location", "/data/addOrder" + saveOrder);
        return new ResponseEntity<>(httpHeaders, HttpStatus.CREATED);
    }

    @PostMapping("/getAllOrders")
    public List<Orders> getAllOrders() {
        return ordersService.getAllOrders();
    }

}
