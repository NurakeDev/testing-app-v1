package controller;

import model.Role;
import model.User;

public class RoleController {
    public void checkRole(User user) {
        Role role = user.getRole();
        if (role.getName().equalsIgnoreCase("student")) {
            StudentController studentController = new StudentController();
            studentController.startExam(user);
        } else if (role.getName().equalsIgnoreCase("teacher")) {
            new TeacherController();
        } else if (role.getName().equalsIgnoreCase("director")) {
            new DirectorController();
        }

    }
}
