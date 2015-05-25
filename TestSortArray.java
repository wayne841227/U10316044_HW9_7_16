public class TestSortArray{
	public static void main(String []args){
		
		int[][] list = {{4,2},{1,7},{4,5},{1,2},{1,1},{4,1}};                      //設一個二維陣列
		
		
		System.out.print("Before ");			
		for(int i=0;i< list.length;i++){
			
			System.out.print("{"+list[i][0] +","+ list[i][1] +"}"+ " ");	    //利用for把陣列第0,1個數印出來	
		}
		
		System.out.println(" ");
		
		SelectionSort.sort(list);						//呼叫method 傳入陣列list的值
		
		System.out.print("After ");
		for(int i=0;i< list.length;i++){
			
			System.out.print("{"+list[i][0] +","+ list[i][1] +"}"+ " ");
		}
	
	
	}

}

class SelectionSort {
  										/** The method for sorting the numbers */
  public static void sort(int[][] list) {
    for (int i = 0; i < list.length - 1; i++) {					//第i個陣列的第0個值
      									// Find the minimum in the list[i..list.length-1]
      int currentMin = list[i][0];					//找出目前最小的值
      int currentMinIndex = i;						

      for (int j = i + 1; j < list.length; j++) {				//找i的下一項
        if (currentMin > list[j][0] || currentMin == list[j][0] &&		//在i相同的情況下判斷j
        	 list[currentMinIndex][1] > list[j][1]) {
          currentMin = list[j][0];
          currentMinIndex = j;
        }
      }

								     // Swap list[i] with list[currentMinIndex] if necessary;
      if (currentMinIndex != i) {
      
      	int temp = list[currentMinIndex][0];
      	
        list[currentMinIndex][0] = list[i][0];				//temp,temp1與list[i][0,1]的交換確保最小
        list[i][0] = temp;
        
        int temp1 = list[currentMinIndex][1];
        
        list[currentMinIndex][1] = list[i][1];
        list[i][1] = temp1;
      }
    }
  }
}
