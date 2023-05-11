package ua.hillel.hw10;

public class MyRunnable2 implements Runnable{

	@Override
	public void run() {
		ValueCalculator vc = new ValueCalculator();
		vc.loadArray(vc.secondArray);
		System.arraycopy(vc.secondArray, 0, vc.array, vc.halfArray, vc.halfArray);
	}
	

}
