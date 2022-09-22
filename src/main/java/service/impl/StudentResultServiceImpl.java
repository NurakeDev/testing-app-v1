package service.impl;

import model.StudentResult;
import model.Subject;
import model.User;
import repository.StudentResultRepository;
import service.StudentResultService;

public class StudentResultServiceImpl implements StudentResultService {

    public void newResult(User user, Subject subject, double score) {
        StudentResultRepository.results.add(new StudentResult(
                (long)StudentResultRepository.results.size(),
                user, subject, score));

    }

}
