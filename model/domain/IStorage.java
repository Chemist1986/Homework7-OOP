package OOP7.model.domain;

import java.util.List;

public interface IStorage {

    List<String> readAllLines();

    void saveAllLines(List<String> lines);
}