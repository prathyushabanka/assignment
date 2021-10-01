package peopletech.com;
//Find the minimum and maximum element in an array.
public class MInimumAndMaximum {
	public static void main(String[] args) {
		int large,small,i;
		int a[] = {9,2,7,6,3};
		int n = a.length;
		large = small = a[0];
		for(i=1;i<n;i++)
		{
		if(a[i]>large)
		large = a[i];



		if(a[i]<small)
		small = a[i];



		}
		System.out.println("small value "+small);
		System.out.println("large value "+large);
		}



		}


