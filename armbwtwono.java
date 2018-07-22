package set1;

import java.util.Scanner;

public class armbwtwono {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int no=in.nextInt();
		int no1=in.nextInt();
		for(int i=no+1;i<no1;i++){
			int num=i;
			String a=Integer.toString(num);
			int mul,sum=0;
			for(int j=0;j<a.length();j++){
				char c=a.charAt(j);
			    mul=(c-48)*(c-48)*(c-48);
			    sum=sum+mul;
			 }
			  if(sum==num){
				System.out.println(sum);
				}
	  }
	}
}
