package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.model.Pet;
import guru.springframework.sfgpetclinic.services.PetService;

import java.util.Set;


public class PetMapService extends AbstractMapService<Pet, Long> implements PetService {
    @Override
    public Set<Pet> findAll33() {
        return super.findAll();
    }

    @Override
    public Pet findById33(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save33(Pet object) {
        return super.save(object);
    }

    @Override
    public void delete33(Pet object) {
        super.delete(object);
    }

    @Override
    public void deleteById33(Long id) {
        super.deleteById(id);
    }
}
