package peopletech.com;
//Write a program to sort the given array.
public class SortArray {
	public static void main(String[] args) {
		int arr[]= {44,67,90,12,45};
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++)
			{
				int temp;
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}	
			}
			System.out.println(arr[i]+" ");
		}
	}
}





