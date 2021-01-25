package guru.springframework.sfgpetclinic.services.springdatajpa;

import guru.springframework.sfgpetclinic.model.Pet;
import guru.springframework.sfgpetclinic.repositories.PetRepository;
import guru.springframework.sfgpetclinic.services.PetService;

import java.util.HashSet;
import java.util.Set;


public class PetSDJpaService implements PetService {

    private final PetRepository petRepository;

    public PetSDJpaService(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    @Override
    public Set<Pet> findAll33() {
        Set<Pet> pets = new HashSet<>();
        petRepository.findAll().forEach(pets::add);
        return pets;
    }

    @Override
    public Pet findById33(Long aLong) {
        return petRepository.findById(aLong).orElse(null);
    }

    @Override
    public Pet save33(Pet object) {
        return petRepository.save(object);
    }

    @Override
    public void delete33(Pet object) {
        petRepository.delete(object);
    }

    @Override
    public void deleteById33(Long aLong) {
        petRepository.deleteById(aLong);
    }
}
