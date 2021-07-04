package ee.reneroost.AutoRemo.rehv;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "rehvitootjad", path = "rehvitootjad")
public interface RehvTootjaRepo extends JpaRepository<RehvTootja, Long> {
}
