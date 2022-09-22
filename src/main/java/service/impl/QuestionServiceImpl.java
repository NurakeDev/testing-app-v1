package service.impl;

import model.Question;
import model.Subject;
import repository.QuestionRepository;
import service.QuestionService;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class QuestionServiceImpl implements QuestionService {

    public void newQuestion(String text, Subject subject) {
        List<Question> questions = QuestionRepository.getQuestions();
        questions.add(new Question((long)questions.size(), text, subject));
        QuestionRepository.setQuestions(questions);
    }

    public Question findQuestionByText(String text, Subject subject) {
        List<Question> questions = QuestionRepository.getQuestions();
        Iterator var4 = questions.iterator();

        Question question;
        do {
            if (!var4.hasNext()) {
                return null;
            }

            question = (Question)var4.next();
        } while(!question.getText().equalsIgnoreCase(text));

        return question;
    }

    public List<Question> getAllQuestionsBySubjectName(String subjectName) {
        List<Question> questionList = new ArrayList();
        List<Question> questions = QuestionRepository.getQuestions();
        Iterator var4 = questions.iterator();

        while(var4.hasNext()) {
            Question question = (Question)var4.next();
            if (question.getSubject().getName().equalsIgnoreCase(subjectName)) {
                questionList.add(question);
            }
        }

        return questionList;
    }

    public Question findQuestionById(Long ID) {
        List<Question> questions = QuestionRepository.getQuestions();
        Iterator var3 = questions.iterator();

        Question question;
        do {
            if (!var3.hasNext()) {
                return null;
            }

            question = (Question)var3.next();
        } while(!question.getId().equals(ID));

        return question;
    }

}
