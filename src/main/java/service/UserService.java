package service;

import model.Role;
import model.User;

public interface UserService {

    void newUser(String var1, String var2, String var3, Role var4);

    User findUserByFullName(String var1);

    User findUserByEmailAddressPassword(String var1, String var2);

}
