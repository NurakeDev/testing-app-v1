package repository;

import model.Role;
import model.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    public static List<User> users = new ArrayList();
    public static User myUser;

    public UserRepository() {
    }

    public static User getMyUser() {
        return myUser;
    }

    public static void setMyUser(User myUser) {
        UserRepository.myUser = myUser;
    }

    public static void startUser() {
        users = new ArrayList();
        users.add(new User(1L, "Nursulton Begmonov", "nurake@gmail.com", "12345678", (Role)RoleRepository.roles.get(0)));
        users.add(new User(2L, "Sanjar Umarov", "sancho02@gmail.com", "12345678", (Role)RoleRepository.roles.get(1)));
        users.add(new User(3L, "Hamdam Karimov", "hamdam@gmail.com", "12345678", (Role)RoleRepository.roles.get(2)));
    }

    public static List<User> getUsers() {
        return users;
    }

    public static User getUser(Long id) {
        return (User)users.get(Integer.parseInt(Long.toString(id)) - 1);
    }

    public static void setUsers(List<User> users) {
        UserRepository.users = users;
    }

    public static void viewUsers() {
        System.out.println(users);
    }

}
