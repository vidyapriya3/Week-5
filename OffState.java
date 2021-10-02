/**
 * 
 */
package state;


public class OffState implements State {
	Trimmer trimmer;
	public OffState( Trimmer operator ) {
		this.trimmer = operator;
	}
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		
		if(trimmer.checkFuel()) {
			System.out.println("Trimmer turned on");
			trimmer.setState(trimmer.getOnState());
		}
		else {
			System.out.println("Refuel Device as its out fuel");
			trimmer.setState(trimmer.getOffState());
		}
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Trimmer is off");
//		operator.setState(operator.getOffState());
	}

	@Override
	public void turnIdle() {
		// TODO Auto-generated method stub
		System.out.println("Trimmer is off switch on the trimmer first");

	}

	@Override
	public void turnRunning() {
		// TODO Auto-generated method stub
		System.out.println("Trimmer is off, Switch trimmer on first");
	}


	public String toString() {
		return " Off";
	}

}
