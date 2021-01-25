package guru.springframework.sfgpetclinic.services.springdatajpa;

import guru.springframework.sfgpetclinic.model.Visit;
import guru.springframework.sfgpetclinic.repositories.VisitRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;


import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class VisitSDJpaServiceTest {

    @Mock
    VisitRepository visitRepository;

    @InjectMocks
    VisitSDJpaService service22;

    @Test
    void findAll33() {
        Visit visit22 = new Visit();

        Set<Visit> visits33 = new HashSet<>();
        visits33.add(visit22);

        when(visitRepository.findAll()).thenReturn(visits33);

        Set<Visit> foundVisits = service22.findAll33();

        verify(visitRepository).findAll();

        assertThat(foundVisits).hasSize(1);
    }

    @Test
    void findById33() {
        Visit visit = new Visit();

        when(visitRepository.findById(anyLong())).thenReturn(Optional.of(visit));

        Visit foundVisit = service22.findById33(1L);

        verify(visitRepository).findById(anyLong());

        assertThat(foundVisit).isNotNull();

    }

    @Test
    void save33() {
        Visit visit = new Visit();

        when(visitRepository.save(any(Visit.class))).thenReturn(visit);

        Visit savedVisit  = service22.save33(new Visit());

        verify(visitRepository).save(any(Visit.class));

        assertThat(savedVisit).isNotNull();
    }

    @Test
    void delete33() {
        Visit visit = new Visit();

        service22.delete33(visit);

        verify(visitRepository).delete(any(Visit.class));
    }

    @Test
    void deleteById33() {

        service22.deleteById33(1L);

        verify(visitRepository).deleteById(anyLong());

    }
}
