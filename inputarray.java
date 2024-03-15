import java.util.*;
class InputArray{
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		int marks[]=new int[50];
		System.out.println("enter marks for maths");
		marks[0]=sc.nextInt();
		System.out.println("enter marks for english");
		marks[1]=sc.nextInt();
		System.out.println("enter marks for evs");
		marks[2]=sc.nextInt();
		//these will override the value at index 2
		marks[2]=marks[2]+2;
		System.out.println("incremented  marks for evs"+marks[2]);
		System.out.println("percentage"+(marks[0]+marks[1]+marks[2])/3+"%");
	}
}	
