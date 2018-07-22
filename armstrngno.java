import java.util.Scanner;
public class armstrngno {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int no=in.nextInt();
	String a=Integer.toString(no);
	int mul,sum=0;
	for(int i=0;i<a.length();i++){
		char c=a.charAt(i);
	    mul=(c-48)*(c-48)*(c-48);
	    sum=sum+mul;
	}
	if(sum==no){System.out.println("yes");}
	else{System.out.println("no");}
}
}
