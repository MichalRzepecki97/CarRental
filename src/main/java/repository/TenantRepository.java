package repository;

import org.springframework.data.repository.CrudRepository;
import security.Tenant;

public interface TenantRepository extends CrudRepository<Tenant,Long> {

    Tenant findOneByLogin(String login);

}
