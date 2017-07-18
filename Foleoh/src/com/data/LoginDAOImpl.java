package com.data;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class LoginDAOImpl implements LoginDAO{

	@PersistenceContext
	private EntityManager em;
	
	
	@Override
	public void User(String username, String password) {
		// TODO Auto-generated method stub
		
	}

}
