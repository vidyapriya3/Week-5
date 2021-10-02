package state;

public class IdleState implements State {
	
	Trimmer trimmer;
	public IdleState(Trimmer operator ) {
		this.trimmer = operator;
	}
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Device already on!");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Trimmer turned off");
		trimmer.setState(trimmer.getOffState());
	}

	@Override
	public void turnIdle() {
		// TODO Auto-generated method stub
		System.out.println("Trimmer in Idle Mode");
		

	}

	@Override
	public void turnRunning() {
		System.out.println("Trimmer in running mode");
		if(trimmer.checkFuel()) {
			trimmer.setState(trimmer.getRunningState());
			trimmer.consumeFuel();
		}
		else {
			trimmer.setState(trimmer.getOffState());
		}

	}


	public String toString() {
		return " in idle state";
	}
	

}
