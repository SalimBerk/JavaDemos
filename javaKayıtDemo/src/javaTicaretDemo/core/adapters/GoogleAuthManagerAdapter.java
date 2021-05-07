package javaTicaretDemo.core.adapters;

import javaTicaretDemo.business.abstracts.AuthService;
import javaTicaretDemo.entities.concretes.User;
import javaTicaretDemo.googleAuth.GoogleAuthManager;

public class GoogleAuthManagerAdapter implements AuthService{

	@Override
	public void register(User user) {
		GoogleAuthManager authManager=new GoogleAuthManager();
		authManager.register(user);
		
	}

	@Override
	public void login(User user) {
		GoogleAuthManager authManager=new GoogleAuthManager();
		authManager.login(user);
		
	}



}
