package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.model.PetType;
import guru.springframework.sfgpetclinic.services.PetTypeService;

import java.util.Set;

public class PetTypeMapService extends AbstractMapService<PetType, Long> implements PetTypeService {

    @Override
    public Set<PetType> findAll33() {
        return super.findAll();
    }

    @Override
    public PetType findById33(Long id) {
        return super.findById(id);
    }

    @Override
    public PetType save33(PetType object) {
        return super.save(object);
    }

    @Override
    public void delete33(PetType object) {
        super.delete(object);
    }

    @Override
    public void deleteById33(Long id) {
        super.deleteById(id);
    }
}
