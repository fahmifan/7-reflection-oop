public class Car {
	private int speed = 0;

	//inner class
	private class Engine {

		public void startEngine() {
			System.out.println("Engine started");
		}

		public void stopEngine() {
			System.out.println("Engine stopped");
		}
	}

	
	
	public void move() {
		Engine e = new Engine();
		e.startEngine();
		System.out.println("Car moved");
	}

	public void stop() {
		System.out.println("Car stopped");
	}

	public void addSpeed(int speed) {
		this.speed += speed;
	}

	public int currentSpeed() {
		return this.speed;
	}

	public static void main(String[] args) {
		Car c = new Car();
		Car.Engine e = c.new Engine();
		c.addSpeed(5);
		c.move();
		System.out.println("Current Speed : " + c.currentSpeed());
		e.stopEngine();
		c.stop();
	}
}