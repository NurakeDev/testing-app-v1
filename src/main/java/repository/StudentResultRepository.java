package repository;

import model.StudentResult;

import java.util.ArrayList;
import java.util.List;

public class StudentResultRepository {

    public static List<StudentResult> results = new ArrayList();

    public StudentResultRepository() {
    }

    public static StudentResult getResult(Long id) {
        return (StudentResult)results.get(Integer.parseInt(Long.toString(id)) - 1);
    }

    public static List<StudentResult> getResults() {
        return results;
    }

}
