package br.com.scan.login.service;

import br.com.scan.login.model.User;

public interface UserService {
	
	void save(User user);
	
	User findByUsername(String username);

}
