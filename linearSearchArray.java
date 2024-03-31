class LinerSearchArrays{
	int linerSearch(int[] arr,int num){
		for(int i=0;i<arr.length;i++){
			if(num==arr[i]){
				return i;
			}
			
		}
		return -1;
	}
	public static void main(String args[]){
		LinerSearchArrays l1= new LinerSearchArrays();
		int[] arr={10,30,20,30,40,50};
		int num=30;
		System.out.println("the element at position is--->"+l1.linerSearch(arr,num));
	}

}
