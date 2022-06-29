package projeto.crud.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import projeto.crud.crud.model.Sistema;



@Repository
public interface SistemaRepository extends JpaRepository<Sistema, Long> {

}
