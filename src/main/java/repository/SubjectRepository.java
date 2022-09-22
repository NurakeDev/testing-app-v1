package repository;

import model.Subject;

import java.util.ArrayList;
import java.util.List;

public class SubjectRepository {

    public static List<Subject> subjects = new ArrayList();
    public static Subject selectSubject;

    public SubjectRepository() {
    }

    public static Subject getSelectSubject() {
        return selectSubject;
    }

    public static void setSelectSubject(Subject selectSubject) {
        SubjectRepository.selectSubject = selectSubject;
    }

    public static void startSubject() {
        subjects.add(new Subject(1L, "Fizika"));
        subjects.add(new Subject(2L, "Informatika"));
    }

    public static Subject getSubject(Long id) {
        return (Subject)subjects.get(Integer.parseInt(Long.toString(id)) - 1);
    }

    public static List<Subject> getSubjects() {
        return subjects;
    }

    public static void setSubjects(List<Subject> subjects) {
        SubjectRepository.subjects = subjects;
    }

}
