package gold;

import java.util.Arrays;
import java.util.Scanner;

public class rptno {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int sz=in.nextInt();
	int arr[]=new int[sz];
	for(int i=0;i<sz;i++){
		arr[i]=in.nextInt();
	}
	Arrays.sort(arr);
	String s="";
	for(int j=0;j<sz-1;j++){
		if(arr[j]==arr[j+1]){
			s=s+arr[j];
		}
	}
	System.out.println(s.replaceAll(""," ").trim());
}
}
