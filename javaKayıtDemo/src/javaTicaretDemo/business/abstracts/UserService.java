package javaTicaretDemo.business.abstracts;

import java.util.List;

import javaTicaretDemo.entities.concretes.User;

public interface UserService {
	void add(User user);
	List<User> getAll();
}
