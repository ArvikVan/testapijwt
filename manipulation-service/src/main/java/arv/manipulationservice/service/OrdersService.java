package arv.manipulationservice.service;

import arv.manipulationservice.model.Orders;

import java.util.List;

/**
 * @author ArvikV
 * @version 1.0
 * @since 02.05.2022
 */
public interface OrdersService {
  /*  Orders createOrders(Orders orders, Clients clients);*/
  Orders createOrders(Orders orders);
    List<Orders> getAllOrders();
}
