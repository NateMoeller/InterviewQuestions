public class NateSolution
{
  public static void main(String[] args)
  {
    int[] a =  {10, 9, 2, 5, 3, 7, 101, 18};
    System.out.println(longestIncreasingSub(a));
  }
  
  public static int longestIncreasingSub(int[] arr){
    int longest = 0;
    int[] longestAtIndex = new int[arr.length];
    
    // init the array to 1 for each index
    for(int i = 0; i < longestAtIndex.length; i++){
      longestAtIndex[i] = 1;
    }
    
    int max = 0;
    for(int i = 1; i < arr.length; i++){
      for(int j = 0; j < i; j++){
        if(arr[j] < arr[i] && longestAtIndex[i] < longestAtIndex[j] +1){
        	longestAtIndex[i] = longestAtIndex[j] + 1;
          
          if(longestAtIndex[i] > max){
          	max = longestAtIndex[i]; 
          }
        }
      }
    }
    
    return max;
  }
}