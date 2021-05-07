package javaTicaretDemo;

import java.util.Scanner;

import javaTicaretDemo.business.abstracts.AuthService;
import javaTicaretDemo.business.abstracts.UserService;
import javaTicaretDemo.business.concretes.AuthManager;
import javaTicaretDemo.business.concretes.UserManager;
import javaTicaretDemo.core.adapters.GoogleAuthManagerAdapter;
import javaTicaretDemo.dataAccess.concretes.InMemoryUserDao;
import javaTicaretDemo.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		User user1 = new User(2,"salim","uzun","salim123@gmail.com","123456");
		
		UserService userService=new UserManager(new InMemoryUserDao());
		AuthService authService=new AuthManager(userService);
		
		
		
		System.out.println("Google doğrulaması\n");
		Scanner input=new Scanner(System.in);
		System.out.println("1-Kullanıcı kayıt işlemi\n2-Google hesap kontrolü");
		int option=input.nextInt();
		if(option==1) {
			authService.register(user1);
			
		}
		else if(option==2) {
			GoogleAuthManagerAdapter managerAdapter=new GoogleAuthManagerAdapter();
			managerAdapter.login(user1);
			
		}
		

	}

}
