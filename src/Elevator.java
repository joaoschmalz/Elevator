public class Elevator {

	private int maxPassangers;
	private int passangers;
	private int currentFloor;
	private int lastFloor;

	public Elevator(int maxPassangers, int lastFloor) {
		this.maxPassangers = maxPassangers;
		this.lastFloor = lastFloor;
	}

	public Elevator(int maxPassangers, int passangers, int currentFloor, int lastFloor) {
		this.maxPassangers = maxPassangers;
		this.passangers = passangers;
		this.currentFloor = currentFloor;
		this.lastFloor = lastFloor;
	}

	public int getMaxPassangers() {
		return maxPassangers;
	}

	public void setMaxPassangers(int maxPassangers) {
		this.maxPassangers = maxPassangers;
	}

	public int getPassangers() {
		return passangers;
	}

	public void setPassangers(int passangers) {
		this.passangers = passangers;
	}

	public int getCurrentFloor() {
		return currentFloor;
	}

	public void setCurrentFloor(int currentFloor) {
		this.currentFloor = currentFloor;
	}

	public int getLastFloor() {
		return lastFloor;
	}

	public void setLastFloor(int lastFloor) {
		this.lastFloor = lastFloor;
	}

	private boolean canGoUp(int currentFloor) {
		return currentFloor < this.lastFloor ? true : false;
	}

	public int nextFloor() {
		if (canGoUp(currentFloor)) {
			setCurrentFloor(this.currentFloor += 1);
			return this.currentFloor;
		} else {
			return currentFloor;
		}
	}

	private boolean canGoDown(int currentFloor) {
		return currentFloor >= 1 ? true : false;
	}

	public int previousFloor() {
		if (canGoDown(this.currentFloor)) {
			setCurrentFloor(this.currentFloor -= 1);
			return this.currentFloor;
		} else {
			return currentFloor;
		}
	}

	private boolean canAddNewPassanger(int passangers) {
		return passangers >= this.maxPassangers ? true : false;
	}

	public int addPassanger() {
		if (canAddNewPassanger(passangers)) {
			setPassangers(this.passangers += 1);
			return this.passangers;
		} else {
			return passangers;
		}
	}

	private boolean canRemovePassanger(int passangers) {
		return passangers >= 1 ? true : false;
	}

	public int removePassanger() {
		if (canRemovePassanger(passangers)) {
			setPassangers(this.passangers -= 1);
			return this.passangers;
		} else {
			return passangers;
		}
	}
}