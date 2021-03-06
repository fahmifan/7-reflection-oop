//main class Car
public class Car 
	{
		//instance variable
		private int speed = 0;

		//Inner Class
		private class Engine 
			{
				//Inner Class method
				public void startEngine() 
					{
						System.out.println("Engine started");
					}

				//Inner Class method
				public void stopEngine() 
					{
						System.out.println("Engine stopped");
					}
			}

		//main Class method
		public void move() 
			{
				//instansiasi object Inner class
				Engine e = new Engine();

				//object Inner class memanggil method Inner class
				e.startEngine();
				System.out.println("Car moved");
			}

		//main Class method
		public void stop() {
			this.speed = 0;
			Car c = new Car();
			
			//method local inner class
			class StopCar {
				public void carStop() {
					System.out.println("Current Speed : " + c.currentSpeed());
					System.out.println("Car stopped");
				}
			}

			StopCar sc = new StopCar();
			sc.carStop();
		}

		//main Class method
		public void addSpeed(int speed) 
			{
				this.speed += speed;
			}

		//main Class method
		public int currentSpeed() 
			{
				return this.speed;
			}

		//mai Class main method
		public static void main(String[] args) 
			{
				//instansiasi object main class
				Car c = new Car();

				//instansiasi object Inner class
				Car.Engine e = c.new Engine();

				//object main class memanggil method main class
				c.addSpeed(5);
				c.move();
				System.out.println();

				System.out.println("Current Speed menggunakan method Main Class : " + c.currentSpeed());

				//Anonymous Inner Class
				AnonymousInner anon = new AnonymousInner()
					{
						//method Main class diOverride oleh method Anonymous Inner Class
						public void stop()
							{
								System.out.println("Car Stopped (Anonymous Inner Class)");
							}

					};
				e.stopEngine();

				//object Anonymous Inner class memanggil method stop() yang telah dioverride
				anon.stop();
				System.out.println();
				
				//object Inner class memanggil method Inner class
				
				//menggunakan method local inner class;
				c.stop();
				System.out.println("(Menggunakan Method Local Inner Class)");
			}
	}