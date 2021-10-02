package state;

public class OnState implements State {
	Trimmer trimmer;
	public OnState(Trimmer operator ) {
		this.trimmer = operator;
	}
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Trimmer on!");
		//operator.setState(operator.getOnState());
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Trimmer turned off!");
		trimmer.setState(trimmer.getOffState());
	}

	@Override
	public void turnIdle() {
		System.out.println("Trimmer in Idle mode");
		trimmer.setState(trimmer.getIdlingState());
		trimmer.consumeFuel();
		
	}

	@Override
	public void turnRunning() {
		System.out.println("Trimmer running mode");
		if(trimmer.checkFuel()) {
			trimmer.setState(trimmer.getRunningState());
			trimmer.consumeFuel();
		}
		else {
			trimmer.setState(trimmer.getOffState());
		}
	}


	public String toString() {
		return " on";
	}
}
