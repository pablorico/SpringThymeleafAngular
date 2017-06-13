package spring.thymeleaf.angular.repositories;

import org.springframework.data.repository.CrudRepository;
import spring.thymeleaf.angular.entities.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {
}
