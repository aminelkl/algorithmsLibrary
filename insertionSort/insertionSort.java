//  O(n) time complexity

	public static void main(String[] args) {

		int array[] = {20, 35, -15, 7, 55, 1, -22}; 
		
		for (int firstUnsortedIndex = 1 ; firstUnsortedIndex < array.length ; firstUnsortedIndex++) {
			int tempo = array[firstUnsortedIndex];
			
			int i;
			
			for (i = firstUnsortedIndex ; i > 0 && array[i - 1] > tempo ; i--) {
			      	array[i] = array[i - 1];
			}
			
			array[i] = tempo;
		}
		
		for (int i = 0 ; i < array.length ; i++) {
			System.out.println(array[i]);
		}
		
	}

