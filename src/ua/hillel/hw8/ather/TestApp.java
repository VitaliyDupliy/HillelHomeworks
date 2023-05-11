package ua.hillel.hw8.ather;

public class TestApp {

	public static void main(String[] args) {
		Participant human = new Human();
		Participant cat = new Cat();
		Participant robot = new Robot();
		Barrier rt = new RunningTrack(300);
		Barrier w = new Wall(1.5);

		Participant[] pt = { human, cat, robot };
		Barrier[] br = { rt, w };
		

		for (Participant i : pt) {
			for (Barrier j : br) {
				
				if (j.checkAbilities(i)) {
					j.overcome(i);
				} else {
					System.out.println("Participant " + "[" + i.getClass().getSimpleName() + "] didn't pass the barrier " + "["
							+ j.getClass().getSimpleName() + "] and quit game");
					break;
				}
				
			}
			
		}
	}

}
