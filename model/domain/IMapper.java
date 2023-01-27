package OOP7.model.domain;

import OOP7.model.domain.entity.Note;

public interface IMapper {

    String map(Note note);

    Note map(String line);
}