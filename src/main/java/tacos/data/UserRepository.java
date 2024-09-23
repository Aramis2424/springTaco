package tacos.data;

import org.springframework.data.repository.CrudRepository;
import tacos.UserTaco;

public interface UserRepository extends CrudRepository<UserTaco, Long> {
    UserTaco findByUsername(String username);
}