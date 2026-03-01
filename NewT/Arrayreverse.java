package NewT;
import java.util.*;

public class Arrayreverse {

	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int n= sc.nextInt();
		System.out.println("enter the elements into the array:");
		int[] arr=new int[5];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("original array:");
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]+" ");
		}
		System.out.println("reversed array:");
		for(int i=n-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
		
		// min element
		int min=arr[0];
		for(int i=0;i<n;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("minimum element is:"+min);
		
		//sum of array
		int sum=0;
		for(int i=0;i<n;i++) {
			sum+=arr[i];
			
		}
		System.out.println("sum of array is="+sum);
		
		//linear search
		System.out.println("Enter a element to search:");
		int t=sc.nextInt();
		for(int i=0;i<n;i++) {
			if(arr[i]==t) {
				System.out.println("element found at index "+i);
						break;}
			else if(i==n-1 && arr[i]!=t) {
				System.out.println("element not found");
			}
			
		}
			
	  }
	}
