package service.impl;

import model.Answer;
import model.Question;
import repository.AnswerRepository;
import service.AnswerService;

import java.util.List;

public class AnswerServiceImpl implements AnswerService {
    public void newAnswer(String text, boolean status, Question question) {
        List<Answer> answers = AnswerRepository.getAnswers();
        answers.add(new Answer((long)answers.size(), text, status, question));
        AnswerRepository.setAnswers(answers);
    }
}
