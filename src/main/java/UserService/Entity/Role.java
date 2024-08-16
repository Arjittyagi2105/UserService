package UserService.Entity;


import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "ECOMM_ROLE")
public class Role extends BaseModel{
    private String userRole;
    private String description;
}
