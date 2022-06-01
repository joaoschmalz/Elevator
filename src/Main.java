public class Main {

	public static void main(String[] args) {

		Elevator e = new Elevator(3, 3);
		Elevator e1 = new Elevator(3, 2, 1, 3);

		e.addPassanger();
		e.nextFloor();
		e.removePassanger();
		e.nextFloor();
		e.previousFloor();
		e.addPassanger();

		System.out.println(e.getCurrentFloor());
		System.out.println(e.getPassangers());
	}
}