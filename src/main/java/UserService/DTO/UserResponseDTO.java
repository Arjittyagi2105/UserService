package UserService.DTO;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class UserResponseDTO {
    private String name;
    private String email;
    List<RoleResponseDTO> roles;
}
