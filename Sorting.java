
public class Sorting {
	
	public static void selectionSort(int[] numbers){
		
		for(int i=0; i < numbers.length-1; i++){
			int indexMin = i;
			for(int j = i + 1; j < numbers.length; j++){
				if( numbers[j] < numbers[indexMin]){
					indexMin = j;
					
				}
			}
//			swap(numbers, indexMin, i);
		}
	}
	
	public static void insertionSort(int[] vals){
		int currInd = -1;
		for( int pos = 1; pos < vals.length; pos++){
			while(currInd > 0 && vals[currInd] < vals[currInd-1]){
//				swap(vals, currInd, currInd-1);
				currInd = currInd - 1;
				
				
			}
			
		}
	}
}
