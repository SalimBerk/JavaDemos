package javaTicaretDemo.googleAuth;

import javaTicaretDemo.entities.concretes.User;

public class GoogleAuthManager {
	public void register(User user) {
		System.out.println("Kullan�c� google ile kay�t oldu."+" "+user.getEmail());
		
	}
	public void login(User user) {
		System.out.println("Kullan�c� google hesab�yla giri� yapt�"+" "+user.getEmail());
		
	}
	

}
