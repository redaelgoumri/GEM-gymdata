package ma.xproce.gem.dao.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Session {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @Temporal(TemporalType.DATE)
    private Date sessionDate;

    @Temporal(TemporalType.TIME)
    private Date sessionTime;

    @ManyToOne
    private Coach coach;
    @ManyToOne
    private Client client;
}
