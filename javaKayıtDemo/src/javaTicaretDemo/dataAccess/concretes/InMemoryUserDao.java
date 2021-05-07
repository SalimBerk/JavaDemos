package javaTicaretDemo.dataAccess.concretes;


import java.util.ArrayList;
import java.util.List;

import javaTicaretDemo.dataAccess.abstracts.UserDao;
import javaTicaretDemo.entities.concretes.User;

public class InMemoryUserDao implements UserDao {
	List<User> users;

	public InMemoryUserDao() {

		this.users =new ArrayList<User>();
	}

	@Override
	public void add(User user) {
		this.users.add(user);
		
	}

	@Override
	public List<User> getAll() {
		
		return users;
	}



	}
	

