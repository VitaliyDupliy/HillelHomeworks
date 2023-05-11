package ua.hillel.hw8.ather;

public class RunningTrack implements Barrier {

	double longitude;

	public RunningTrack(int longitude) {

		this.longitude = longitude;
	}
	

	@Override
	public void overcome(Participant pt) {

		if (this.longitude <= pt.getRunable()) {

			System.out.println(
					"Participant " + "[" + pt.getClass().getSimpleName() + "]" + pt.run() 
					+ " the running track " + this.longitude + " meters");
			
		}
		

	}


	@Override
	public boolean checkAbilities(Participant pt) {
		return (pt.getRunable() >= this.longitude);
	}

}
