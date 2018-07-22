package gold;

import java.util.Arrays;
import java.util.Scanner;

public class bignoarr {
	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int sz=in.nextInt();
	int arr[]=new int[sz];
	for(int i=0;i<sz;i++){
		arr[i]=in.nextInt();
	}
	Arrays.sort(arr);
	for(int j=sz-1;j>=0;j--){
		System.out.print(arr[j]);
	}
  }
}
