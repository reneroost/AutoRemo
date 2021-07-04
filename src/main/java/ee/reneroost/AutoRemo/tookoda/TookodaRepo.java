package ee.reneroost.AutoRemo.tookoda;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "tookojad", path = "tookojad")
public interface TookodaRepo extends JpaRepository<Tookoda, Long> {
}
