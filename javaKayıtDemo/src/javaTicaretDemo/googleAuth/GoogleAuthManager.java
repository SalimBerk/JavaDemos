package javaTicaretDemo.googleAuth;

import javaTicaretDemo.entities.concretes.User;

public class GoogleAuthManager {
	public void register(User user) {
		System.out.println("Kullanýcý google ile kayýt oldu."+" "+user.getEmail());
		
	}
	public void login(User user) {
		System.out.println("Kullanýcý google hesabýyla giriþ yaptý"+" "+user.getEmail());
		
	}
	

}
