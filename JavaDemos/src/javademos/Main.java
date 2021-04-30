package javademos;

public class Main {

	public static void main(String[] args) {
		Instructor instructor=new Instructor();
		instructor.setId(143);
		instructor.setName("Engin");
		instructor.setPassword("Engns123");
		instructor.setEmail("Engindemiroğ123@gmail.com");
		instructor.setMessage("Arkadaşlar bugün saat 9.30 da derstesiniz.\n");
		
		Student student=new Student();
		student.setId(145);
		student.setName("Salim");
		student.setPassword("Sans123");
		student.setEmail("Salimbrk123@gmail.com");
		
		InstructorManager manager= new InstructorManager();
		manager.login(instructor);
		manager.description(instructor);
		
		StudentManager smanager=new StudentManager();
		smanager.login(student);
		
		
	}

}
