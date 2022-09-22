import controller.UserController;
import repository.*;

public class Runnable {
    public static void main(String[] args) {
        RoleRepository.startRoles();
        UserRepository.startUser();
        SubjectRepository.startSubject();
        QuestionRepository.startQuestions();
        AnswerRepository.startAnswer();
        UserController userController = new UserController();
        userController.checkUser();
    }
}
