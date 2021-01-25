package guru.springframework.sfgpetclinic.services;

import java.util.Set;

public interface CrudService<T, ID> {

    Set<T> findAll33();

    T findById33(ID id);

    T save33(T object);

    void delete33(T object);

    void deleteById33(ID id);
}
