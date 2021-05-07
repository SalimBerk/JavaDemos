package javaTicaretDemo.dataAccess.abstracts;

import java.util.List;

import javaTicaretDemo.entities.concretes.User;

public interface UserDao {
	void add(User user);
	List<User> getAll();


}
