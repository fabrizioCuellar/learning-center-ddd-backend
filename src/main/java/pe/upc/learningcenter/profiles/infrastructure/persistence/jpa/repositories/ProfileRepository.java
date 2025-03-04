package pe.upc.learningcenter.profiles.infrastructure.persistence.jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.upc.learningcenter.profiles.domain.model.aggregates.Profile;
import pe.upc.learningcenter.profiles.domain.model.valueobjects.EmailAddress;
import pe.upc.learningcenter.profiles.domain.model.valueobjects.PersonName;
import pe.upc.learningcenter.profiles.domain.model.valueobjects.UserId;

import java.util.Optional;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, Long> {
    Optional<Profile> findByPersonName(PersonName name);
    Optional<Profile> findByEmail(EmailAddress id);
    Optional<Profile> findByUserId(UserId userId);
}
