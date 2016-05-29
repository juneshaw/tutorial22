

public class App {

	public static void main(String[] args) {
		
		Machine machine1 = new Machine();
		
		Machine machine2 = new Machine("Junebug");
		
		Machine machine3 = new Machine("Festus", 2);
		
		Car car1 = new Car();
		car1.start();
		car1.stop();
		car1.showInfo();
	}

}
