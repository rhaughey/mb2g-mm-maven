package guru.springframework.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by rfh on 11/4/2019
 */
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
public class User {
    @Id
    private Long id;

    private String firstName;
    private String lastName;
    private String email;
}
