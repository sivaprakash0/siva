package gold;

import java.util.Scanner;

public class reptno {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int sz=in.nextInt();
	int no[]=new int[sz];
	for(int i=0;i<sz;i++){
		no[i]=in.nextInt();
	}
	for(int i=0;i<sz;i++){
		for(int j=i+1;j<sz;j++){
	if(no[i]==no[j]){
		System.out.println(no[i]);
	}	
	}
	}
}
}
