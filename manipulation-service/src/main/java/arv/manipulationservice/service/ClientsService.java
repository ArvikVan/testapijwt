package arv.manipulationservice.service;

import arv.manipulationservice.model.Clients;

import java.util.List;

/**
 * @author ArvikV
 * @version 1.0
 * @since 02.05.2022
 */
public interface ClientsService {
    Clients createClient(Clients client);
    List<Clients> getAllClients();
}
