class ArrayInsert{
	int insert(int arr[],int n,int x,int cap ,int pos){
		if(n==cap){
			return -1;
		}
		//we find required index where we are going to put element
		int index=pos-1;
		//now we will shift elements
		for(int i=n-1;i>=index;i--){
		arr[i+1]=arr[i];
		arr[index]=x;
		}
	return (n+1);
		
	}
	public static void main(String args[]){
		int arr[]=new int[5];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		//int arr[]={10,20,30, , };
		//pos=2
		//n=5;
		//cap=5;
		//pos=index=2
		ArrayInsert a= new ArrayInsert();
		int result=a.insert(arr,3,80,5,3);
		System.out.println("my result of insertion is--->\n "+result);
		
	}
}
