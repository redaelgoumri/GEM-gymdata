package ma.xproce.gem.web;

import lombok.RequiredArgsConstructor;
import ma.xproce.gem.dao.entities.Client;
import ma.xproce.gem.services.ClientManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/clients")
@RequiredArgsConstructor
public class ClientController {
    private final ClientManager clientManager;

    @GetMapping
    public List<Client> getAllClients() {
        return clientManager.getAllClients();
    }

    @GetMapping("/{id}")
    public Client getClientById(@PathVariable Integer id) {
        return clientManager.getClientById(id);
    }

    @PostMapping
    public Client addClient(@RequestBody Client client) {
        return clientManager.addClient(client);
    }

    @PutMapping("/{id}")
    public Client updateClient(@PathVariable Integer id, @RequestBody Client client) {
        client.setId(id);
        return clientManager.updateClient(client);
    }

    @DeleteMapping("/{id}")
    public boolean deleteClient(@PathVariable Integer id) {
        return clientManager.deleteClient(id);
    }
}
