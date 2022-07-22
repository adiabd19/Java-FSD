package synchronization;

public class TestSynchronization {

public static void main(String[] args) {
		
		Sender sender = new  Sender();
		
		User t1= new User("Tanu", "Hello Good morning....!", sender);
		User t2= new User("Adi","Hii!! how  are you?",sender);
		
		t1.start();
		t2.start();
	}

}
