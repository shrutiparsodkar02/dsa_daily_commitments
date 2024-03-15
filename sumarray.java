class SumArray{
	int calculate(int arr[]){
		int sum=0;
		for(int i=0;i<arr.length;i++){
			sum=sum+arr[i];
			
		}
		return sum;
	}
	int[] randomArray(int arr[]){
		//int arr[]=new int[50];
		for(int i=0;i<50;i++){
			arr[i]=randomNum();
			// if we do arr then it will print address
			//System.out.println(arr[i]);
		}
		return arr;
	}
	static int randomNum(){
		long num=((System.nanoTime()%10)*10)+((System.nanoTime()%10));
		//System.out.println(num);
		return (int)num;
		}
	public static void main(String arg[]){
		SumArray s= new SumArray();
		int arr[]=new int[50];
		//int num=randomNum();
		
		int arr2[]=s.randomArray(arr);
	
		/*for(int i=0;i<50;i++){
			System.out.println(arr2[i]);
		}
		*/
		int res=s.calculate(arr2);
		System.out.println(res);
		
	}
}
