package ma.xproce.gem.dao.repositories;

import ma.xproce.gem.dao.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Integer> {
}
