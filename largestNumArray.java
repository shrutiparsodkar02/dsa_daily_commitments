class Largestnum{
	int[] large(int arr[],int n){
		for(int i=0;i<n;i++){
			if(arr[i]>arr[i+1]){
				arr[i]=arr[i+1];
				i++;
				//System.out.println(arr[0]);
			}
		return arr;
		}
	//while returning we dont need to write square brackets
	return arr;
	}
	void printarr(int arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.print(" " +arr[i]);
		}
	}
	public static void main(String args[]){
		int arr[]={110,50,10,60};
		Largestnum l=new Largestnum();
		int arr1[]=l.large(arr,4);
		//while returning or printing we dont need square brackete
		//System.out.println(arr1);
		l.printarr(arr1);
	}
}
