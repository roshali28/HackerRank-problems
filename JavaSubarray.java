import java.io.*;
import java.util.*;

public class JavaSubarray {
	 public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in);
	     int n=sc.nextInt();
	     int arr[]=new int[n];
	     for(int m=0;m<n;m++){
	         arr[m]=sc.nextInt();
	     }
	     int count=0;
	     for(int i=0;i<n;i++){  //starting index
	     int sum=0;
	         for(int j=i;j<n;j++){ //ending index
	             sum=sum+arr[j];
	             if(sum<0){
	               count++;
	               }
	          
	         }   
	     }
	     System.out.println(count);
	    }
}
