package javaTicaretDemo.business.abstracts;

import javaTicaretDemo.entities.concretes.User;

public interface AuthService {
	void register(User user);
	void login(User user);


}
