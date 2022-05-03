package arv.manipulationservice.controller;

import arv.apijtt.model.Clients;
import arv.apijtt.model.Orders;
import arv.apijtt.service.ClientServiceImpl;
import arv.apijtt.service.OrdersServiceImpl;
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
