package service.impl;

import model.Role;
import repository.RoleRepository;
import service.RoleService;

import java.util.Iterator;
import java.util.List;

public class RoleServiceImpl implements RoleService {

    public void save(Role role) {
        List<Role> roles = RoleRepository.getRoles();
        roles.add(role);
        RoleRepository.setRoles(roles);
    }

    public Role findByRoleName(String roleName) {
        List<Role> roles = RoleRepository.getRoles();
        Iterator var3 = roles.iterator();

        Role role;
        do {
            if (!var3.hasNext()) {
                return null;
            }

            role = (Role)var3.next();
        } while(!role.getName().equalsIgnoreCase(roleName));

        return role;
    }


}
