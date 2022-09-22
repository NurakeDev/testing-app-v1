package controller;

import java.util.Scanner;
import model.User;
import repository.SubjectRepository;

public class StudentController {
    Scanner in = new Scanner(System.in);
    public void startExam(User user) {
        in = new Scanner(System.in);
        System.out.println("Select testing subject \n1. Fizika\n2. Informatika\n0. Exit\n");
        int selectSubject = this.in.nextInt();
        QuestionController questionController = new QuestionController();
        switch(selectSubject) {
            case 1:
                questionController.showQuestion(SubjectRepository.getSubject(1L));
                SubjectRepository.setSelectSubject(SubjectRepository.getSubject(1L));
                break;
            case 2:
                questionController.showQuestion(SubjectRepository.getSubject(2L));
                SubjectRepository.setSelectSubject(SubjectRepository.getSubject(2L));
                break;
            default:
                return;
        }

    }

}
