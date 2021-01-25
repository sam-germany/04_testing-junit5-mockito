package guru.springframework.sfgpetclinic.services.springdatajpa;

import guru.springframework.sfgpetclinic.model.Speciality;
import guru.springframework.sfgpetclinic.repositories.SpecialtyRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class SpecialitySDJpaServiceTest {

    @Mock
    SpecialtyRepository specialtyRepository;

    @InjectMocks
    SpecialitySDJpaService service22;











    @Test
    void testDeleteByObject() {
        Speciality speciality = new Speciality();
        service22.delete33(speciality);

        verify(specialtyRepository).delete(any(Speciality.class));
    }

    @Test
    void findByIdTest() {
         Speciality speciality = new Speciality();

         when(specialtyRepository.findById(1L)).thenReturn(Optional.of(speciality));

         Speciality foundSpecialty = service22.findById33(1L);

         assertThat(foundSpecialty).isNotNull();

         verify(specialtyRepository).findById(anyLong());
    }



    @Test
    void deleteById() {
        service22.deleteById33(1l);
        service22.deleteById33(1l);

        verify(specialtyRepository, times(2)).deleteById(1l);
    }

    @Test
    void deleteByIdALeast() {
        service22.deleteById33(1l);
        service22.deleteById33(1l);

        verify(specialtyRepository, times(2)).deleteById(1l);
    }

    @Test
    void deleteByIdAtMost() {
        service22.deleteById33(1l);
        service22.deleteById33(1l);

        verify(specialtyRepository, atMost(5)).deleteById(1l);
    }

    @Test
    void deleteByIdAtNever() {
        service22.deleteById33(1l);
        service22.deleteById33(1l);

        verify(specialtyRepository, never()).deleteById(5l);
    }

    @Test
    void testDelete() {
        service22.delete33(new Speciality());

    }





}
