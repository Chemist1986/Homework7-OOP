package OOP7.model.domain;

import OOP7.model.domain.entity.Note;

public interface IValidator {

    boolean validateNote(Note note);
}