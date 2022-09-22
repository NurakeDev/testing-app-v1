package controller;

import java.util.Scanner;
import model.Role;
import model.User;
import repository.RoleRepository;
import repository.UserRepository;
import service.RoleService;
import service.UserService;
import service.impl.RoleServiceImpl;
import service.impl.UserServiceImpl;

public class UserController {
    private UserService userService = new UserServiceImpl();
    private RoleService roleService = new RoleServiceImpl();
    private RoleController roleController = new RoleController();
    private Scanner in = new Scanner(System.in);

    public UserController() {
        this.in = new Scanner(System.in);
    }

    public void checkUser() {
        this.in = new Scanner(System.in);
        boolean exit = true;

        while(exit) {
            this.showMainMenu();
            int operation = this.in.nextInt();
            switch(operation) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    this.signUp();
                    break;
                case 2:
                    this.signIn();
            }
        }

    }

    private void signIn() {
        this.in = new Scanner(System.in);
        System.out.println("Your email address: ");
        String emailAddress = this.in.nextLine();
        System.out.println("Password: ");
        String pass = this.in.nextLine();
        User user = this.userService.findUserByEmailAddressPassword(emailAddress, pass);
        if (user == null) {
            System.out.println("This user not found!");
        } else {
            this.roleController.checkRole(user);
            UserRepository.setMyUser(user);
        }

    }

    private void signUp() {
        this.in = new Scanner(System.in);
        System.out.println("Your name: ");
        String name = this.in.nextLine();
        System.out.println("Your email address: ");
        String emailAddress = this.in.nextLine();
        System.out.println("Password: ");
        String pass = this.in.nextLine();
        Role role = this.selectRole();
        this.userService.newUser(name, emailAddress, pass, role);
        User user = this.userService.findUserByEmailAddressPassword(emailAddress, pass);
        UserRepository.setMyUser(user);
        this.roleController.checkRole(user);
    }

    private Role selectRole() {
        System.out.println("Your role: \n1. Student\n2. Teacher\n3. Director");
        int roleId = this.in.nextInt();
        return (Role)RoleRepository.roles.get(roleId - 1);
    }

    private void showMainMenu() {
        System.out.println("========================");
        System.out.println("1. Sign In");
        System.out.println("2. Log In");
        System.out.println("0. Exit");
        System.out.println("========================");
    }
}
