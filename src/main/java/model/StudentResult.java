package model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class StudentResult {

    private final Long ID;
    private User user;
    private Subject subject;
    private double score;


}
