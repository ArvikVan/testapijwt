package arv.manipulationservice.controller;

import arv.manipulationservice.model.Clients;
import arv.manipulationservice.model.Orders;
import arv.manipulationservice.service.ClientServiceImpl;
import arv.manipulationservice.service.OrdersServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public Clients creatClients(@RequestBody Clients clients) {
        return clientService.createClient(clients);
    }

    @PostMapping("/getAllClients")
    public List<Clients> getAllClients() {
        return clientService.getAllClients();
    }

    @PostMapping("/addOrder/{id}")
    public Orders creatOrders(@RequestBody Orders orders, @PathVariable Long id) {
        Clients clients = clientService.getById(id);
        orders.setClients(clients);
        return ordersService.createOrders(orders);
    }

    @PostMapping("/getAllOrders")
    public List<Orders> getAllOrders() {
        return ordersService.getAllOrders();
    }

}
