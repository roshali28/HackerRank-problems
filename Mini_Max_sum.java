import java.util.*;
public class Mini_Max_sum {
	public static void miniMaxSum(List<Integer> arr) {
        long sum=0;
        long max=0,min=0;
       for(int i=0;i<arr.size();i++){
           sum=sum+arr.get(i);
       }
       min=sum-Collections.max(arr);
       max=sum-Collections.min(arr);
       System.out.println(min+" "+max);
    }

	public static void main(String[] args) {
	 ArrayList<Integer> arr = new ArrayList<>();
	 arr.add(256741038);
	 arr.add(623958417);
	 arr.add(467905213);
	 arr.add(714532089);
	 arr.add(938071625);
	 miniMaxSum(arr);
	}

}
