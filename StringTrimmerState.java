package state;

public class StringTrimmerState {

	public static void main(String[] args) {
		Trimmer trimmer = new Trimmer(100);
		System.out.println(trimmer);
		System.out.println("=========");
		trimmer.turnOff();
		System.out.println(trimmer);
		System.out.println("=========");
		trimmer.turnOn();
		System.out.println(trimmer);
		//idle mode
		System.out.println("=========");
		trimmer.turnIdle();
		System.out.println(trimmer);
		System.out.println("=========");
		trimmer.turnOn();
		System.out.println(trimmer);
		System.out.println("=========");
	
		trimmer.turnRunning();
		System.out.println(trimmer);
		System.out.println("=========");
		
		trimmer.turnOff();
		System.out.println(trimmer);
		System.out.println("=========");
	
//		//running mode
		trimmer.turnOn();
		System.out.println(trimmer);
		System.out.println("=========");
	
		trimmer.turnIdle();
		trimmer.turnRunning();
		trimmer.turnIdle();
		trimmer.turnOn();
		trimmer.refuel(200);
		trimmer.turnOn();
		trimmer.turnRunning();
		trimmer.turnOff();
		trimmer.turnOn();
		trimmer.turnOn();
		trimmer.turnOff();
		trimmer.turnOff();
		trimmer.turnOn();
		trimmer.turnOn();
		trimmer.turnRunning();
		trimmer.turnRunning();
		trimmer.turnIdle();
		
		System.out.println(trimmer);
		
		
	}

}
