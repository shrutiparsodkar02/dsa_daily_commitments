class LargestElementArray{
	int largestElement(int[] arr){
		int k=0;
		for(int i=0;i<arr.length-1;i++){
			if(arr[i]>arr[i+1]){
				arr[k]=arr[i+1];
			}
		}
		return -1;
	}
	public static void main(String args[]){
		LargestElementArray l1= new LargestElementArray();
		int[] arr={10,20,30,40,50};
		System.out.println("largest element in the index--->"+l1.largestElement(arr));
	}
}
