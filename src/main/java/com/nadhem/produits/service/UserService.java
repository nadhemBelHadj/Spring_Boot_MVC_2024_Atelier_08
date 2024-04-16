package com.nadhem.produits.service;

import com.nadhem.produits.entities.Role;
import com.nadhem.produits.entities.User;

public interface UserService {
	void deleteAllusers();
	void deleteAllRoles();
	User saveUser(User user);
	
	User findUserByUsername (String username);
	Role addRole(Role role);
	User addRoleToUser(String username, String rolename);


}
