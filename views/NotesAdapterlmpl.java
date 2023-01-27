package OOP7.views;

import OOP7.model.domain.entity.Note;

public class NotesAdapterlmpl implements INotesAdapter {

    @Override
    public String getView(Note note) {
        return note.toString();
    }
}