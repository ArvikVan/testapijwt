package arv.manipulationservice.service;

import arv.manipulationservice.model.Clients;
import arv.manipulationservice.model.Orders;
import arv.manipulationservice.repo.ClientRepo;
import arv.manipulationservice.repo.OrderRepo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ArvikV
 * @version 1.0
 * @since 02.05.2022
 */
@Service
public class OrdersServiceImpl implements OrdersService {
    private final OrderRepo orderRepo;

    private final ClientRepo clientRepo;

    public OrdersServiceImpl(OrderRepo orderRepo, ClientRepo clientRepo) {
        this.orderRepo = orderRepo;
        this.clientRepo = clientRepo;
    }

   @Override
   public Orders createOrders(Orders orders) {
       return orderRepo.save(orders);
   }

    public Clients findById(Long id) {
       return clientRepo.findById(id).get();
    }

    @Override
    public List<Orders> getAllOrders() {
        return orderRepo.findAll();
    }
/*
    public Clients findClientsId(Long id) {
        return clientRepo.findById(id).get();
    }*/
}
