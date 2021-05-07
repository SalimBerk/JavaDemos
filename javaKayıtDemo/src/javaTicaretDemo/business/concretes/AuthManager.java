package javaTicaretDemo.business.concretes;




import javaTicaretDemo.business.abstracts.AuthService;
import javaTicaretDemo.business.abstracts.UserService;

import javaTicaretDemo.entities.concretes.User;

public class AuthManager implements AuthService {
	private UserService userService;

	public AuthManager(UserService userService) {
		
		this.userService = userService;
	}

	@Override
	public void register(User user) {
		this.userService.add(user);
		
	}

	@Override
	public void login(User user) {
		if(!checkMail(user.getEmail())) {
			System.out.println("Email hatalı.");
			
		}
		if(!checkPassword(user.getPassword())) {
			System.out.println("şifre hatalı");
		}
		
	}

	private boolean checkPassword(String password) {
		for (User user : this.userService.getAll()) {
			
			if(user.getPassword() == password) {
				return true;
			}
			
		}
		
		return false;
	}
	

	private boolean checkMail(String email) {
		for(User user:this.userService.getAll()) {
			if(user.getEmail()==email) {
				return true;
				
			}
			
		}
		return false;
	}
	
}
