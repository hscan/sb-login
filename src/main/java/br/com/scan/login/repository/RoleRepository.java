package br.com.scan.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.scan.login.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{

}
