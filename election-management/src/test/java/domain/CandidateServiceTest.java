package domain;

import org.instancio.Instancio;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.verify;

import io.quarkus.test.InjectMock;
import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;

@QuarkusTest
public class CandidateServiceTest {

    @Inject
    CandidateService service;

    @InjectMock
    CandidateRepository repository;

    @Test
    void save() {
        Candidate candidate = Instancio.create(Candidate.class);

        service.save(candidate);
        verify(repository).save(candidate);

    }

    @Test
    void findAll() {
        service.findAll();
    }

}
