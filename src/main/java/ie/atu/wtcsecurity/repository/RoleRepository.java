package ie.atu.wtcsecurity.repository;

import ie.atu.wtcsecurity.models.ERole;
import ie.atu.wtcsecurity.models.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface RoleRepository extends MongoRepository<Role, String> {
    Optional<Role> findByName(ERole name);
}
