package ee.reneroost.AutoRemo.laoseis;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "laoseis", path = "laoseis")
public interface LaoseisRepo extends JpaRepository<Laoseis, LaoseisId> {
}
