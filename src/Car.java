
public class Car extends Machine {

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Car started");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Car stopped");
	}

	public void showInfo() {
		System.out.println("name is: " + name);
	}
	
}
