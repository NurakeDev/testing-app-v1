package service.impl;

import model.Subject;
import repository.SubjectRepository;
import service.SubjectService;

import java.util.Iterator;
import java.util.List;

public class SubjectServiceImpl implements SubjectService {

    public void newSubject(String subName) {
        List<Subject> subjects = SubjectRepository.getSubjects();
        subjects.add(new Subject((long)subjects.size(), subName));
        SubjectRepository.setSubjects(subjects);
    }

    public Subject findBySubjectName(String subName) {
        List<Subject> subjects = SubjectRepository.getSubjects();
        Iterator var3 = subjects.iterator();

        Subject subject;
        if (!var3.hasNext()) return null;

        subject = (Subject)var3.next();
        while (!subject.getName().equalsIgnoreCase(subName)) {
            if (!var3.hasNext()) {
                return null;
            }
            subject = (Subject) var3.next();
        }

        return subject;
    }

}
