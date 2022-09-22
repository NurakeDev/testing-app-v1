package repository;

import model.Role;

import java.util.ArrayList;
import java.util.List;

public class RoleRepository {
    public static List<Role> roles = new ArrayList();

    public RoleRepository() {
    }

    public static List<Role> getRoles() {
        return roles;
    }

    public static void setRoles(List<Role> roles) {
        RoleRepository.roles = roles;
    }

    public static void startRoles() {
        roles.add(new Role(1L, "STUDENT"));
        roles.add(new Role(2L, "TEACHER"));
        roles.add(new Role(3L, "DIRECTOR"));
    }

    public static void viewRoles() {
        System.out.println(roles);
    }

}
