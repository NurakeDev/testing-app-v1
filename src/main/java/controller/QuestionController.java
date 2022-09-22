package controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;
import model.Answer;
import model.Question;
import model.Subject;
import repository.AnswerRepository;
import repository.QuestionRepository;
import repository.SubjectRepository;
import repository.UserRepository;
import service.StudentResultService;
import service.impl.StudentResultServiceImpl;

public class QuestionController {

    private Scanner in;
    private List<Question> questions;
    private static double score = 0.0D;

    public QuestionController() {
        this.in = new Scanner(System.in);
        this.questions = QuestionRepository.getQuestions();
    }

    public void showQuestion(Subject subject) {
        int go = 0;
        int j = 0;

        for(int questionsSize = this.questions.size(); go < questionsSize; ++go) {
            Question question = (Question)this.questions.get(go);
            if (question.getSubject().getName().equalsIgnoreCase(subject.getName())) {
                int var10001 = j++;
                System.out.println(var10001 + ". " + question.getText());
            }
        }

        System.out.println("\nAre you ready? 1. Yes 2. No");
        go = this.in.nextInt();
        switch(go) {
            case 1:
                this.startTest(subject);
                return;
            default:
        }
    }

    public void startTest(Subject subject) {
        int allAnswers = 0;
        int trueAnswers = 0;
        Iterator var4 = this.questions.iterator();

        while(var4.hasNext()) {
            Question question = (Question)var4.next();
            if (question.getSubject().getName().equalsIgnoreCase(subject.getName())) {
                List<Question> questionList = new ArrayList();
                questionList.add(question);
                System.out.println(question.getText());
                if (this.selectAnswer(question).isStatus()) {
                    ++trueAnswers;
                }

                ++allAnswers;
            }
        }

        score = (double)(trueAnswers * 100 / allAnswers);
        System.out.printf("\nYour score: %.02f, %d then %d right.\n", score, allAnswers, trueAnswers);
        StudentResultService studentResultService = new StudentResultServiceImpl();
        studentResultService.newResult(UserRepository.getMyUser(), SubjectRepository.getSelectSubject(), score);
    }

    private Answer selectAnswer(Question question) {
        Map<Character, Integer> lettersMap = new LinkedHashMap();
        lettersMap.put('A', 0);
        lettersMap.put('B', 1);
        lettersMap.put('C', 2);
        lettersMap.put('D', 3);
        List<Answer> answers = AnswerRepository.getAnswers();
        this.in = new Scanner(System.in);
        List<Answer> answerList = new ArrayList();
        Iterator var5 = answers.iterator();

        while(var5.hasNext()) {
            Answer answer = (Answer)var5.next();
            if (answer.getQuestion().getText().equalsIgnoreCase(question.getText())) {
                answerList.add(answer);
            }
        }

        this.customShuffle(answerList, answers.size());
        var5 = lettersMap.entrySet().iterator();

        while(var5.hasNext()) {
            Entry<Character, Integer> entry = (Entry)var5.next();
            Character key = (Character)entry.getKey();
            Integer value = (Integer)entry.getValue();
            System.out.println(key + ". " + ((Answer)answerList.get(value)).getText());
        }

        System.out.println("Your answer: ");
        char myAnswer = this.in.next().charAt(0);
        Integer index = (Integer)lettersMap.get(myAnswer);
        return (Answer)answerList.get(index);
    }

    public void customShuffle(List<Answer> list, int size) {
        while(true) {
            Collections.shuffle(list);

            for(int i = 0; i < size; ++i) {
                if (((Answer)list.get(i)).isStatus()) {
                    return;
                }
            }
        }
    }
}
