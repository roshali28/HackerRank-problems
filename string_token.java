import java.io.*;
import java.util.*;

public class string_token {
	 public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        String s = scan.nextLine().trim();
	        if(s.isEmpty())
	        System.out.println("0");
	        else{
	        String arr[]=s.trim().split("[ !,?._'@]+");
	        int count=arr.length;
	        System.out.println(count);
	        for(int i=0;i<arr.length;i++){
	            System.out.println(arr[i]);
	        }
	        }
	        scan.close();
	    }
}
