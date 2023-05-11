package ua.hillel.hw10;

public class ValueCalculator {

	float[] array = new float[30000000];
	int halfArray = array.length / 2;
	float[] firstArray = new float[halfArray];
	float[] secondArray = new float[halfArray];

	public void arrayManipulation() throws InterruptedException {
		long start = System.currentTimeMillis();

		// Set 1.0 to all values of an array:
		for (int i = 0; i < array.length; i++) {
			array[i] = 1;
		}

		Thread thread1 = new Thread(new MyRunnable1());
		Thread thread2 = new Thread(new MyRunnable2());
		
		thread1.start();
		thread1.join();;
		thread2.start();
		thread2.join();;

		long end = System.currentTimeMillis();
		long operationTime = (end - start);

		System.out.println("operationTime = " + operationTime + " millisec.");

	}

	public void loadArray(float[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = (float) (array[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
			
		}
	}

	

}
