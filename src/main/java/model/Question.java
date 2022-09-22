package model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Question {

    private final Long Id;
    private String text;
    private Subject subject;


}
