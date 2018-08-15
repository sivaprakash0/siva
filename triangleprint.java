package set5;

import java.util.Scanner;

public class triangleprint {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int a=in.nextInt();
	int b=1;
	for(int i=0;i<a;i++){
		for(int j=1;j<=b;j++){
			System.out.print("1");
		}
		System.out.print("\n");
		b=b+2;
	}
}
}
