package ua.hillel.hw10;

public class MyRunnable1 implements Runnable{

	@Override
	public void run() {
		ValueCalculator vc = new ValueCalculator();
		vc.loadArray(vc.firstArray);
		System.arraycopy(vc.firstArray, 0, vc.array, 0, vc.halfArray);
		
	}

}
