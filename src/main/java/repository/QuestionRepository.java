package repository;

import model.Question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuestionRepository {

    public static List<Question> questions = new ArrayList();


    public static List<Question> getQuestions() {
        return questions;
    }

    public static Question getQuestion(Long id) {
        return (Question)questions.get(Integer.parseInt(Long.toString(id)) - 1);
    }

    public static void startQuestions() {
        questions = new ArrayList();
        questions.addAll(
                Arrays.asList(
                        new Question(1L, "Suv necha gradusda qaynaydi?", SubjectRepository.getSubject(1L)), new Question(2L, "Kuch yelkasi 2 marta orttirildi. Bunda kuchmomenti 6 marta kamaydi. Kuch qanday o`zgargan?", SubjectRepository.getSubject(1L)), new Question(3L, "Har 6 s da 2 marta aylanadigan jismning burchak tezligi qanday?", SubjectRepository.getSubject(1L)), new Question(4L, "Quyidagilardan qaysi biri yadro reaktorida 'yoqilg`i' sifatida ishlatiladi? ", SubjectRepository.getSubject(1L)), new Question(5L, "Prujinaga osilgan yukning massasi 2 marta orttirilsa uning bikrligi qanday o`zgaradi?", SubjectRepository.getSubject(1L))));
        questions.addAll(Arrays.asList(new Question(6L, "Axborotdan hayot faoliyatida foydalana olish uchun qaysi muhim xususiyatlarga ega bo`lishi lozim?", SubjectRepository.getSubject(2L)), new Question(7L, "Ikkilik sanoq sistemasida berilgan 1101110001111 sonini o`n oltilik sanoq sistemasiga o`tkazing", SubjectRepository.getSubject(2L)), new Question(8L, "Quyidagilardan qaysi biri elektron jadval hisoblanmaydi?", SubjectRepository.getSubject(2L)), new Question(9L, "Internet tarmog`idagi ma`lumotlar saqlanuvchi kompyuter qanday nomlanadi? ", SubjectRepository.getSubject(2L)), new Question(10L, "Pascal tilida o`zgaruvchilarni tavsiflash uchun qaysi identifikator ishlatiladi?", SubjectRepository.getSubject(2L))));
    }

    public static void setQuestions(List<Question> questions) {
        QuestionRepository.questions = questions;
    }

    public void viewQuestions() {
        System.out.println(questions);
    }

}
