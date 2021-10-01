package peopletech.com;
//Find the occurrence of an integer[20] in the array[10].
public class OccuranceOf {
	public static int findOcurance(int arr[] ,int n) {

	int count=0;
	for(int i=0;i<arr.length;i++) {
	if(arr[i]==n) {
	count++;

	}
	}
	return count;
	}

	public static void main(String[] args) {
	int arr[]= {20,87,20,8,20,10,15,20,57,38};
	System.out.println(findOcurance(arr,20));
	}


	}



