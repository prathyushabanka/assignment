package peopletech.com;
//Write a program to reverse the array.
public class ReverseArray {
	public static void main(String[] args) {

		int arr[]={ 89,54,7,69,5};
		System.out.println("Originall array");
		for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
		}
		System.out.println("\n Reversed array ");
		for(int i=arr.length;i>0;i--) {
		System.out.print(arr[i-1]+" ");
		}

		}

		}




