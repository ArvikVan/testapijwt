package arv.manipulationservice.controller;

import arv.manipulationservice.model.Clients;
import arv.manipulationservice.model.Orders;
import arv.manipulationservice.service.ClientServiceImpl;
import arv.manipulationservice.service.OrdersServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

/**
 * @author ArvikV
 * @version 1.0
 * @since 02.05.2022
 */
@RestController
@RequestMapping("/update")
@RequiredArgsConstructor
public class UpdateController {
    private final ClientServiceImpl clientService;
    private final OrdersServiceImpl ordersService;

    @PostMapping("/orders/{id}")
    public Orders updateOrders(@RequestBody Orders orders, @PathVariable Long id) {
        orders.setId(id);
        return ordersService.createOrders(orders);
    }

    @PostMapping("/clients/{id}")
    public Clients updateClient(@RequestBody Clients clients,
                                @PathVariable Long id) {
        clients.setId(id);
        return clientService.createClient(clients);
    }
}
