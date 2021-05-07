package javaTicaretDemo.business.concretes;

import java.util.List;

import javaTicaretDemo.business.abstracts.UserService;
import javaTicaretDemo.core.utils.Validation;
import javaTicaretDemo.dataAccess.abstracts.UserDao;
import javaTicaretDemo.dataAccess.concretes.InMemoryUserDao;
import javaTicaretDemo.entities.concretes.User;

public class UserManager implements UserService {
	private UserDao userDao;

	public UserManager(UserDao userDao) {
		
		this.userDao = userDao;
	}

	@Override
	public void add(User user) {
		if(minCharacterLength(2, user.getFirstName())) {
			System.out.println("isim 2 karakterden küçük olamaz");
			return;
		}
		
		if(minCharacterLength(2, user.getLastName())) {
			System.out.println("soyad 2 karakterden küçük olamaz");
			return;
		}
		
		if(isEmailExists(user.getEmail())) {
			System.out.println("email var");
			return;
		}
		
		if(!Validation.validateEmail(user.getEmail())) {
			System.out.println("geçersiz email");
			return;
		}
		
		if(minCharacterLength(6,user.getPassword())){			
			System.out.println("þifre 6 karakterden küçük olamaz");
			return;
		}
		this.userDao.add(user);
		System.out.println("Kayýt yapýldý."+user.getFirstName()+" "+user.getLastName());
		
	}

	private boolean isEmailExists(String email) {
		for (User user : getAll()) {
			
			if(user.getEmail() == email) {
				return true;
			}
			
		}
		
		return false;
	}

	private boolean minCharacterLength(int min, String item) {
		if(item.length()<min) {
			return true;
		}
		return false;
	}

	@Override
	public List<User> getAll() {
		
		return userDao.getAll();	}

}
