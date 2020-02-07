package br.com.scan.login.service;

import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import br.com.scan.login.model.User;
import br.com.scan.login.repository.RoleRepository;
import br.com.scan.login.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RoleRepository roleRepository;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEnoder;

	@Override
	public void save(User user) {
		user.setPassword(bCryptPasswordEnoder.encode(user.getPassword()));
		user.setRoles(new HashSet(roleRepository.findAll()));
		userRepository.save(user);
		
	}

	@Override
	public User findByUsername(String username) {
		return userRepository.findByUsername(username);
	}

}
