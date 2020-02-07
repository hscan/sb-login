package br.com.scan.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.scan.login.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
	User findByUsername(String username);
}
