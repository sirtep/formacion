package com.login.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.login.controllers.entities.User;

@RestController
@RequestMapping("/api")
public class UsersController {
	/* Inyectamos el jdbcTemplate mediante la anotación Autowired (inyección de dependencias)
	*/
	@Autowired private
	JdbcTemplate jdbcTemplate;
	
	@RequestMapping(value = "/users", method = RequestMethod.GET)
	public List<User> getAllUsers() {
		// La query que ejecutaremos/lanzaremos jdbcTemplate
		final String QUERY = "SELECT * FROM USERS;";
		
		// Guardamos el resultado de la query
		List<Map<String, Object>> results = jdbcTemplate.queryForList(QUERY);
		
		// Creamos el userlist en el que guardaremos los usuarios
		List<User> userList = new ArrayList<User>();
		
		// Recorremos los resultados
		for (Map<String, Object> row: results) {
			// Creamos el usuario
			User user = new User();
			// Setteamos el campo ID
			user.setId(((Integer) row.get("ID")).longValue());
			// Setteamos el campo NAME
			user.setName((String) row.get("NOMBRE"));
			// Setteamos el campo SURNAME
			user.setSurname((String) row.get("APELLIDOS"));
			// Una vez guardados los valores, añadimos el elemento a la lista de Users
			userList.add(user);
			System.out.println(user.toString());
		}
		return userList; // Devolvemos el listado
	}
}