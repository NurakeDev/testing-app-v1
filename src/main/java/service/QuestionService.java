package service;

import model.Question;
import model.Subject;

import java.util.List;

public interface QuestionService {

    void newQuestion(String var1, Subject var2);

    Question findQuestionByText(String var1, Subject var2);

    Question findQuestionById(Long var1);

    List<Question> getAllQuestionsBySubjectName(String var1);


}
