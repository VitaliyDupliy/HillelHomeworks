package ua.hillel.hw8.ather;

public class Wall implements Barrier {

	double height;

	public Wall(double height) {
		this.height = height;
	}

	@Override
	public void overcome(Participant pt) {

		if (this.height <= pt.getJumpable()) {

			System.out.println("Participant " + "[" + pt.getClass().getSimpleName() + "]" 
			+ pt.jump() + " the wall height = " + this.height + " meters");
			
		}
		

	}

	@Override
	public boolean checkAbilities(Participant pt) {
		return (pt.getJumpable() > this.height);
	}
}
