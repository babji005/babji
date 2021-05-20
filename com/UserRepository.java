package com;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

	User findByUsernameAndPassword(String username, String password);

}
