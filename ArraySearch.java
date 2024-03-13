//here arr[] is array in which we have to perform searching
//x is the number which we want to search
//n is number of time we need loop to run(no.of elements)



class Search{

	int search(int arr[],int n,int x){
	// as we access array with help of index i.e y we write arr[i] here i represents the index
		for(int i=0;i<=n;i++){
			if(arr[i]==x){
				return i;
			}
		}
		return -1;
	}
	public static void main(String args[]){
	Search s= new Search();
	int arr[]={10,20,30,40,50};
	//***while passing we write only name of array as we pass arr address not value of array
	int result=s.search(arr,4,3);
	System.out.println("element at this position--->"+result);
	}
}
	
	
