package model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Answer {

    private final Long ID;
    private String text;
    private boolean status;
    private Question question;

}
