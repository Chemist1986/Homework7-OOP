package OOP7.di;

import OOP7.model.domain.INoteController;
import OOP7.model.domain.IRepository;
import OOP7.model.domain.IStorage;
import OOP7.views.IView;

public class Component {

    public IStorage storage;
    public IRepository repository;
    public INoteController noteController;
    public IView noteView;

    public Component() {

        storage = Module.provideStorage();
        repository = Module.provideRepository(storage, Module.provideMapper());
        noteController = Module.provideNoteController(repository, Module.provideValidator());
        noteView = Module.provideView(
                noteController,
                Module.providePromptable(
                        Module.provideLogger()
                ),
                Module.provideNotesAdapter(),
                Module.provideNotesFactory()
        );
    }
}