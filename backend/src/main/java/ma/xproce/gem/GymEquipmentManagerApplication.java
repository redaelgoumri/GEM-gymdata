package ma.xproce.gem;

import lombok.RequiredArgsConstructor;
import ma.xproce.gem.dao.entities.Equipment;
import ma.xproce.gem.dao.repositories.EquipmentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan("ma.xproce.gem.dao.entities")
@SpringBootApplication
@RequiredArgsConstructor
public class GymEquipmentManagerApplication implements CommandLineRunner {


    private final EquipmentRepository equipmentRepository;

    public static void main(String[] args) {
        SpringApplication.run(GymEquipmentManagerApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // Create test data
    }

}
