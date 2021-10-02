package state;

public class Trimmer {
	State onState;
	State offState;
	State idleState;
	State runningState;

	
	State state = offState;
	double fuel = 0.0;
	
	public Trimmer( double fuel ) { 
		onState = new OnState(this);
		offState = new OffState(this);
		idleState = new IdleState(this);
		runningState = new RunningState(this);
		
		this.fuel = fuel;
		if( fuel > 0) {
			state = offState;
		}
		
	}
	public void turnOn() {
		state.turnOn();
	}
	public void turnOff() {
		state.turnOff();
	}
	public void turnIdle() {
		state.turnIdle();
	}
	public void turnRunning() {
		state.turnRunning();
	}

	public State getRunningState() {
		return runningState;
	}
	public State getIdlingState() {
		return idleState;
	}
	public State getOffState() {
		return offState;
	}
	public State getOnState() {
		return onState;
	}

	public void setState(State state) {
		this.state = state;
	}
	public void consumeFuel() {
		this.fuel -= 25.0;
	}
	public boolean checkFuel() {
		return fuel > 25;
	}
	public double getFuel() {
		return fuel;
	}
	public void refuel(double fuel) {
		this.fuel += fuel;
	}
	
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nProfessional Lawn Mowers, Inc.");
		result.append("Fuel" + fuel + " L ");
		if( fuel != 1) {
			result.append("s");
		}
		result.append("\n");
		result.append("Trimmer is " + state + "\n");
		return result.toString();
	}
}
