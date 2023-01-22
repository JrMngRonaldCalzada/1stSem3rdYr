package SecondYearOOP;

class CarEngine {
	public void startEngine() {
		System.out.println("Car Engine Started.");
	}
	public void stopEngine() {
		System.out.println("Car Engine Stopped.");
	}
}
class Car {
	private String color;
	private int max_Speed;
	
	public void carDetails() {
		System.out.println("Car Color "  + color + "; Max Speed = " + max_Speed);
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setMaxSpeed(int max_Speed) {
		this.max_Speed = max_Speed;
	}
}

class Honda extends Car {
	public void HondaStart() {
		CarEngine Honda_Engine = new CarEngine();
		Honda_Engine.startEngine();
	}
	
	public void HondaStop() {
		CarEngine Honda_Engine = new CarEngine();
		Honda_Engine.stopEngine();
	}
}
public class Calzada {
	 public static void main(String[] args) {
		 Honda HondaCity = new Honda();
		 HondaCity.setColor("Silver");
		 HondaCity.setMaxSpeed(180);
		 HondaCity.carDetails();
		 HondaCity.HondaStart();
		 HondaCity.HondaStop();
	}
}