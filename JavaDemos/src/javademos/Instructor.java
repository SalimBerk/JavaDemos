package javademos;

public class Instructor extends User {
	public Instructor() {
		System.out.println("----Eğitmen  girişi yapıldı----\n");
	}
	String message;
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message=message;
	}
	
	}
	

