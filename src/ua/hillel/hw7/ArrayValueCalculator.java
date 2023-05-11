package ua.hillel.hw7;

public class ArrayValueCalculator {

	static int doCalc ( String[][] array) throws ArraySizeException,ArrayDataException {
		
		int sumAllElements = 0;
		if(array.length != 4) {
			throw new ArraySizeException("The array size does not match. Add a 4x4 array.");
		} else {
			for(int i = 0; i < array.length; i++) {
				if(array[i].length != 4) {
					throw  new ArraySizeException("The array size does not match. Add a 4x4 array.");
				}
				
				for(int j = 0; j < 4; j++) {
					try {
					
					sumAllElements += Integer.parseInt(array[i][j]);
					} catch (NumberFormatException e) {
						throw new ArrayDataException("Некорректные данные в array[" + i + "]" + "[" 
					+ j + "]" + "->\"" + array[i][j]+ "\"") ;
					}
				}
			}
		}
		System.out.println(sumAllElements);
		return sumAllElements;
		
		
		
		
	}
	
	public static void main(String[] args)  {
		
				  String [][] dArray = {{"15", "12", "2", "7"},
										{"1", "2", "17", "5"}, 
										{"11", "22", "23", "71"},
										{"9", "A", "13", "38"}};
				  
				  
				
					try {
						doCalc(dArray);
					} catch (ArraySizeException e) {
						
						System.out.println(e.getMessage());
					} catch (ArrayDataException e) {
						
						System.out.println(e.getMessage());
					}  
				
										
	}
}
