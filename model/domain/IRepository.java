package OOP7.model.domain;

import OOP7.model.domain.entity.Note;

import java.util.List;

public interface IRepository {

    List<Note> getAllNotes();

    String createNote(Note note);

    void updateNote(Note note);

    void deleteNote(Note note);
}