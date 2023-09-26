import java.io.*;
import java.util.*;

public class java_arraylist {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
	        int n = sc.nextInt();
	        for(int i=0;i<n;i++){
	            ArrayList<Integer> arr1 = new ArrayList<>();
	            int m = sc.nextInt();
	            for(int j=0;j<m;j++){
	                arr1.add(sc.nextInt());
	            }
	            arr.add(arr1);
	        }
	        int q = sc.nextInt();
	        for(int i=0;i<q;i++){
	            int x=sc.nextInt();
	            int y=sc.nextInt();
	            if(y>arr.get(x-1).size())
	            System.out.println("ERROR!");
	            else
	            System.out.println(arr.get(x-1).get(y-1));
	        }
	    }
	}

