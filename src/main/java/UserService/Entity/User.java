package UserService.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity(name = "ECOMM_USER")
public class User extends BaseModel{
    private String name;
    private String emailId;
    private String password;   //won't store actual password in this
    @ManyToMany
    private List<Role> roles;
}
