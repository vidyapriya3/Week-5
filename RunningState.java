package state;

public class RunningState implements State {
	Trimmer trimmer;
	public RunningState( Trimmer operator ) {
		this.trimmer = operator;
	}
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		if (trimmer.checkFuel()) {
			System.out.println("The trimmer is already on");
			trimmer.consumeFuel();
		}
		else {
			trimmer.setState(trimmer.getOffState());
			System.out.println("Trimmer out of fuel");
		}
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Trimmer turned off");
		trimmer.setState(trimmer.getOffState());
	}

	@Override
	public void turnIdle() {
		if(trimmer.checkFuel()) {
			System.out.println("Idle mode activated");
			trimmer.consumeFuel();
			trimmer.setState(trimmer.getIdlingState());
		}
		else {
			System.out.println("Trimmer out of fuel");
			trimmer.setState(trimmer.getOffState());
			
		}

	}

	@Override
	public void turnRunning() {
		// TODO Auto-generated method stub
		System.out.println("Trimmer ready to cut");
		

	}


	
	public String toString() {
		return "Trimmer is in running state";
	}

}
