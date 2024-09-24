package tacos.data;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import tacos.Taco;

import java.util.List;
import java.util.Optional;

public interface TacoRepository extends PagingAndSortingRepository<Taco, Long> {
    Optional<Taco> findById(Long id);

    Taco save(Taco taco);
}
