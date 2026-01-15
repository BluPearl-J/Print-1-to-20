package repositories;
import models.Bus;
import java.util.List;

public interface BusRepository {
    Bus save(Bus bus);
    Bus findById(int id);
    List<Bus> findAll();
    void deleteById(int id);
    void deleteAll();
    void delete(Bus bus);
    long count();
}
