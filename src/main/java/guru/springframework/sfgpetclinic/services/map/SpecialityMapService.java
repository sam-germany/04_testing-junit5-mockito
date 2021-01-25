package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.model.Speciality;
import guru.springframework.sfgpetclinic.services.SpecialtyService;

import java.util.Set;

public class SpecialityMapService extends AbstractMapService<Speciality, Long> implements SpecialtyService {

    @Override
    public Set<Speciality> findAll33() {
        return super.findAll();
    }

    @Override
    public Speciality findById33(Long id) {
        return super.findById(id);
    }

    @Override
    public Speciality save33(Speciality object) {
        return super.save(object);
    }

    @Override
    public void delete33(Speciality object) {
        super.delete(object);
    }

    @Override
    public void deleteById33(Long id) {
        super.deleteById(id);
    }
}
