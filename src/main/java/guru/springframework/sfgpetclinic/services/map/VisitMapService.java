package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.model.Visit;
import guru.springframework.sfgpetclinic.services.VisitService;

import java.util.Set;

public class VisitMapService extends AbstractMapService<Visit, Long> implements VisitService {

    @Override
    public Set<Visit> findAll33() {
        return super.findAll();
    }

    @Override
    public Visit findById33(Long id) {
        return super.findById(id);
    }

    @Override
    public Visit save33(Visit visit) {

        if(visit.getPet() == null || visit.getPet().getOwner() == null || visit.getPet().getId() == null
            || visit.getPet().getOwner().getId() == null){
            throw new RuntimeException("Invalid Visit");
        }

        return super.save(visit);
    }

    @Override
    public void delete33(Visit object) {
        super.delete(object);
    }

    @Override
    public void deleteById33(Long id) {
        super.deleteById(id);
    }
}
