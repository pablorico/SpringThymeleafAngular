package spring.thymeleaf.angular.services;

import spring.thymeleaf.angular.entities.Usuario;

public interface UsuarioService {
    Iterable<Usuario> listAllUsuarios();

    Usuario getUsuarioById(Integer id);

    Usuario saveUsuario(Usuario usuario);
    
    void deleteUsuario(Integer id);
}