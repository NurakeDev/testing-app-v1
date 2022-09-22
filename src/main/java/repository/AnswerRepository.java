package repository;

import model.Answer;
import model.Question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnswerRepository {

    public static List<Answer> answers = new ArrayList();

    public AnswerRepository() {
    }

    public static List<Answer> getAnswers() {
        return answers;
    }

    public static Answer getAnswer(Long id) {
        return (Answer) answers.get(Integer.parseInt(Long.toString(id)) - 1);
    }

    public static void startAnswer() {
        answers = new ArrayList();
        Arrays.asList(
                Arrays.asList(
                        new Answer(1L, "80 gradusda", false, (Question) QuestionRepository.getQuestions().get(0)),
                        new Answer(2L, "90 gradusda", false, (Question) QuestionRepository.getQuestions().get(0)),
                        new Answer(3L, "100 gradusda", true, (Question) QuestionRepository.getQuestions().get(0)),
                        new Answer(4L, "120 gradusda", false, (Question) QuestionRepository.getQuestions().get(0))),
                Arrays.asList(
                        new Answer(1L, "12 marta kamaygan", true, (Question) QuestionRepository.getQuestions().get(1)), new Answer(2L, "3 marta ortgan", false, (Question) QuestionRepository.getQuestions().get(1)), new Answer(3L, "3 marta kamaygan", false, (Question) QuestionRepository.getQuestions().get(1)), new Answer(4L, "12 marta ortgan", false, (Question) QuestionRepository.getQuestions().get(1))), Arrays.asList(new Answer(1L, "60 grad/s", false, (Question) QuestionRepository.getQuestions().get(2)), new Answer(2L, "90 grad/s", false, (Question) QuestionRepository.getQuestions().get(2)), new Answer(3L, "120 grad/s", true, (Question) QuestionRepository.getQuestions().get(2)), new Answer(4L, "96 grad/s", false, (Question) QuestionRepository.getQuestions().get(2))), Arrays.asList(new Answer(1L, "og`ir suv", false, (Question) QuestionRepository.getQuestions().get(3)), new Answer(2L, "ko`mir", false, (Question) QuestionRepository.getQuestions().get(3)), new Answer(3L, "suyuq natriy", false, (Question) QuestionRepository.getQuestions().get(3)), new Answer(4L, "plutoniy", true, (Question) QuestionRepository.getQuestions().get(3))), Arrays.asList(new Answer(1L, "O`zgarmaydi", true, (Question) QuestionRepository.getQuestions().get(4)), new Answer(2L, "2 marta ortadi", false, (Question) QuestionRepository.getQuestions().get(4)), new Answer(3L, "2 marta kamayadi", false, (Question) QuestionRepository.getQuestions().get(4)), new Answer(4L, "1.41 marta ortadi", false, (Question) QuestionRepository.getQuestions().get(4))), Arrays.asList(new Answer(1L, "qimmatli, to`liqlk, va ishonchli", true, (Question) QuestionRepository.getQuestions().get(5)), new Answer(2L, "tushunarli, qisqa va ishonchli", false, (Question) QuestionRepository.getQuestions().get(5)), new Answer(3L, "foydali, qisqa va ishonchli", false, (Question) QuestionRepository.getQuestions().get(5)), new Answer(4L, "ortiqchalilik, to`liqlk va foydali", false, (Question) QuestionRepository.getQuestions().get(5))), Arrays.asList(new Answer(1L, "7055", false, (Question) QuestionRepository.getQuestions().get(6)), new Answer(2L, "111815", false, (Question) QuestionRepository.getQuestions().get(6)), new Answer(3L, "FB81", false, (Question) QuestionRepository.getQuestions().get(6)), new Answer(4L, "1B8F", true, (Question) QuestionRepository.getQuestions().get(6))), Arrays.asList(new Answer(1L, "MS Access", true, (Question) QuestionRepository.getQuestions().get(7)), new Answer(2L, "1C buxgalteriya", false, (Question) QuestionRepository.getQuestions().get(7)), new Answer(3L, "Framework", false, (Question) QuestionRepository.getQuestions().get(7)), new Answer(4L, "Master", false, (Question) QuestionRepository.getQuestions().get(7))), Arrays.asList(new Answer(1L, "gipertekst", false, (Question) QuestionRepository.getQuestions().get(8)), new Answer(2L, "world wide web", false, (Question) QuestionRepository.getQuestions().get(8)), new Answer(3L, "web server", true, (Question) QuestionRepository.getQuestions().get(8)), new Answer(4L, "internet server", false, (Question) QuestionRepository.getQuestions().get(8))), Arrays.asList(new Answer(1L, "x va y", false, (Question) QuestionRepository.getQuestions().get(9)), new Answer(2L, "char", false, (Question) QuestionRepository.getQuestions().get(9)), new Answer(3L, "const", false, (Question) QuestionRepository.getQuestions().get(9)), new Answer(4L, "var", true, (Question) QuestionRepository.getQuestions().get(9)))).forEach(answerList -> answers.addAll(answerList));
    }

    public static void setAnswers(List<Answer> answers) {
        AnswerRepository.answers = answers;
    }


}
