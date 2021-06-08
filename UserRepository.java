package br.com.Minitwitter.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.Minitwitter.model.User;


public interface UserRepository extends CrudRepository<User, String>{

	User findByUsername(String string);

}
