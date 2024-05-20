import java.util.*;
public class coin_game {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int arr[] = new int[n];
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	int sum=0;
	int ans=0;
	int j=0;
	while(arr[j] >= 0) {
		sum=sum+arr[j];
		j++;
	}
	if(sum < Math.abs(arr[j])) {
		ans = Math.abs(arr[j]) - sum;
	}
	else {
		ans = 0;
	}
	System.out.println("minimum number is : "+ans);
	}

}
