package OOP7.model.domain;

import OOP7.model.domain.entity.Note;

public interface INotesFactory {

    Note getNewNote(String header, String text);
}