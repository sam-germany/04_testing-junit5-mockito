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

import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class SpecialitySDJpaServiceTest {

    @Mock
    SpecialtyRepository specialtyRepository;

    @InjectMocks
    SpecialitySDJpaService service22;

    @Test
    void testDeleteByObject() {

     //given
        Speciality speciality = new Speciality();
     //when
        service22.delete33(speciality);
     //then
        then(specialtyRepository).should().delete(any(Speciality.class));
     //verify(specialtyRepository).delete(any(Speciality.class));
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
    void findByBddTest() {
        Speciality speciality = new Speciality();

   //given
        given(specialtyRepository.findById(1L)).willReturn(Optional.of(speciality));

   //when
        Speciality foundSpeciality = service22.findById33(1L);

   //then
        assertThat(foundSpeciality).isNotNull();
   //   verify(specialtyRepository).findById(anyLong());
   //    then(specialtyRepository).should().findById(anyLong());
        then(specialtyRepository).should(times(1)).findById(anyLong());
        then(specialtyRepository).shouldHaveNoMoreInteractions();
    }






    @Test
    void deleteById() {
        //given     -- none    , means nothing is given

        //when
        service22.deleteById33(1l);
        service22.deleteById33(1l);

        //then
        then(specialtyRepository).should(times(2)).deleteById(1L);

        //    verify(specialtyRepository, times(2)).deleteById(1l);
    }

    @Test
    void deleteByIdALeast() {
        //given    -- none

        //when
        service22.deleteById33(1l);
        service22.deleteById33(1l);

        //then
        then(specialtyRepository).should(atLeastOnce()).deleteById(1L);

    //    verify(specialtyRepository, times(2)).deleteById(1l);
    }

    @Test
    void deleteByIdAtMost() {
        //given    -- none

        // when
        service22.deleteById33(1l);
        service22.deleteById33(1l);

        //then
        then(specialtyRepository).should(atMost(5)).deleteById(1L);

        //     verify(specialtyRepository, atMost(5)).deleteById(1l);
    }

    @Test
    void deleteByIdAtNever() {

        //when
        service22.deleteById33(1l);
        service22.deleteById33(1l);

        //then
        then(specialtyRepository).should

        verify(specialtyRepository, never()).deleteById(5l);
    }

    @Test
    void testDelete() {
        service22.delete33(new Speciality());

    }





}
