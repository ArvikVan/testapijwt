package arv.testapijwt.service;

import arv.testapijwt.model.Clients;
import arv.testapijwt.repo.ClientRepo;
import org.springframework.stereotype.Service;

/**
 * @author ArvikV
 * @version 1.0
 * @since 02.05.2022
 */
@Service
public class ClientServiceImpl implements ClientsService {
    private final ClientRepo clientRepo;

    public ClientServiceImpl(ClientRepo clientRepo) {
        this.clientRepo = clientRepo;
    }

    @Override
    public Clients createClient(Clients client) {
        return clientRepo.save(client);
    }
}
