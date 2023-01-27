package OOP7.model.domain;

import OOP7.model.domain.entity.Note;

import java.util.List;

public interface INoteController {

    void saveNote(Note note) throws Exception;

    Note readNote(String noteId) throws Exception;

    List<Note> readList();

    void updateNote(String noteId, Note newNote) throws Exception;

    void deleteNote(String noteId) throws Exception;

    void idPresenceValidation(String noteId) throws Exception;
}