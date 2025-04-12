package TaskTracker.TaskTracker.Entity;



import java.time.LocalDate;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data

@Entity
@Table(name="Task")
public class Task {

    @Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)

    private Long id;

    private String title;

    private Status status;

    private LocalDate localDate;

    private String username;

    private String name;

    private String phoneNumber;

    private String password;

   

    
}
