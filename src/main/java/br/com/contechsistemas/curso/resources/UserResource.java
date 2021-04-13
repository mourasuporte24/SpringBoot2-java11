package br.com.contechsistemas.curso.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.contechsistemas.curso.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	// End point
	// ResponseEntity = tipo de retorno de requisicões do Spring
	// tipo da responta <> é a classe

	@GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User(1, "Adenilson Moura", "mourasuporte24@gmail.com", "162090");
		return ResponseEntity.ok().body(u);
	}

}
