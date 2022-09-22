package model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {

    private final Long ID;
    private String fullName;
    private String emailAddress;
    private String password;
    private Role role;

}
