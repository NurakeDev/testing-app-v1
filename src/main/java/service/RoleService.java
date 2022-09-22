package service;

import model.Role;

public interface RoleService {
    void save(Role var1);

    Role findByRoleName(String var1);
}
