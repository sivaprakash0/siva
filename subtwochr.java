package gold;

import java.util.Scanner;

public class subtwochr {
public static void main(String[] args) {
	Scanner rd=new Scanner(System.in);
	String wr=rd.next();
	String wr1=rd.next();
	char c[]=wr.toCharArray();
	char c1[]=wr1.toCharArray();
	int sum=0,sub;
	for(int i=0;i<wr.length();i++){
		sub=Math.abs(c[i]-c1[i]);
		sum=sum+sub;
	}
	System.out.println(sum);
}
}
