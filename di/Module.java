package OOP7.di;

import OOP7.controllers.NoteController;
import OOP7.model.data.FileStorage;
import OOP7.model.domain.ILogger;
import OOP7.model.domain.IMapper;
import OOP7.model.domain.INoteController;
import OOP7.model.domain.INotesFactory;
import OOP7.model.domain.IRepository;
import OOP7.model.domain.IStorage;
import OOP7.model.domain.IValidator;
import OOP7.model.domain.LoggerImpl;
import OOP7.model.domain.MapperIml;
import OOP7.model.data.RepositoryImpl;
import OOP7.model.domain.NotesFactory;
import OOP7.views.INotesAdapter;
import OOP7.views.IView;
import OOP7.views.NoteView;
import OOP7.views.NotesAdapterImpl;
import OOP7.views.Promptable;
import OOP7.views.PromptableImpl;
import OOP7.views.PromptableLoggingDecorator;

public class Module {

    public static IStorage provideStorage() {
        return new FileStorage("notes.txt");
    }

    public static IMapper provideMapper() {
        return new MapperIml();
    }

    public static IValidator provideValidator() {
        return new MapperIml();
    }

    public static IRepository provideRepository(
            IStorage storage,
            IMapper mapper
    ) {
        return new RepositoryImpl(mapper, storage);
    }

    public static INoteController provideNoteController(
            IRepository repository,
            IValidator validator
    ) {
        return new NoteController(repository, validator);
    }

    public static ILogger provideLogger() {
        return new LoggerImpl("log.txt");
    }

    public static Promptable providePromptable(
            ILogger logger
    ) {
        return new PromptableLoggingDecorator(
                new PromptableImpl(),
                logger
        );
    }

    public static INotesAdapter provideNotesAdapter() {
        return new NotesAdapterImpl();
    }

    public static INotesFactory provideNotesFactory() {
        return new NotesFactory();
    }

    public static IView provideView(
            INoteController controller,
            Promptable promptable,
            INotesAdapter notesAdapter,
            INotesFactory notesFactory
    ) {
        return new NoteView(controller, promptable, notesAdapter, notesFactory);
    }
}