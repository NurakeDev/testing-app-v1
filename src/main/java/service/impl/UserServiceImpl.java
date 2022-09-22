package service.impl;

import model.Role;
import model.User;
import repository.UserRepository;
import service.UserService;

import java.util.Iterator;
import java.util.List;

public class UserServiceImpl implements UserService {
    public void newUser(String name, String emailAddress, String password, Role role) {
        List<User> users = UserRepository.getUsers();
        users.add(new User((long)users.size(), name, emailAddress, password, role));
        UserRepository.setUsers(users);
    }

    public User findUserByFullName(String fullname) {
        List<User> users = UserRepository.getUsers();
        Iterator var3 = users.iterator();

        User user;
        do {
            if (!var3.hasNext()) {
                return null;
            }

            user = (User)var3.next();
        } while(!user.getFullName().equalsIgnoreCase(fullname));

        return user;
    }

    public User findUserByEmailAddressPassword(String emailAdd, String pass) {
        List<User> users = UserRepository.getUsers();
        Iterator var4 = users.iterator();

        User user;
        do {
            if (!var4.hasNext()) {
                return null;
            }

            user = (User)var4.next();
        } while(!user.getEmailAddress().equalsIgnoreCase(emailAdd) || !user.getPassword().equalsIgnoreCase(pass));

        return user;
    }
}
