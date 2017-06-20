package spring.thymeleaf.angular.bootstrap;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import spring.thymeleaf.angular.entities.Usuario;
import spring.thymeleaf.angular.repositories.UsuarioRepository;

@Component
public class UsuarioLoader implements ApplicationListener<ContextRefreshedEvent> {

	private UsuarioRepository usuarioRepository;

	private Logger log = Logger.getLogger(UsuarioLoader.class);

	@Autowired
	public void setUsuarioRepository(UsuarioRepository usuarioRepository) {
		this.usuarioRepository = usuarioRepository;
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {

		Usuario pablo = new Usuario();
		pablo.setApellido("Rico");
		pablo.setNombre("Pablo Eduardo");
		pablo.setImageUrl(
				"https://springframework.guru/wp-content/uploads/2015/04/spring_framework_guru_shirt-rf412049699c14ba5b68bb1c09182bfa2_8nax2_512.jpg");
		pablo.setUsuarioId("PER");
		usuarioRepository.save(pablo);

		log.info("Saved Pablo - id: " + pablo.getId());

		Usuario mariela = new Usuario();
		mariela.setApellido("Stronati");
		mariela.setNombre("Mariela Andrea");
		mariela.setImageUrl(
				"https://springframework.guru/wp-content/uploads/2015/04/spring_framework_guru_shirt-rf412049699c14ba5b68bb1c09182bfa2_8nax2_512.jpg");
		mariela.setUsuarioId("MAS");
		usuarioRepository.save(mariela);

		log.info("Saved Mariela - id: " + mariela.getId());

	}
}