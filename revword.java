import java.util.Scanner;
public class revword {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	String s=in.nextLine();
	String s1[]=s.split(" ");
	for(String s2:s1){
	String s3=new StringBuffer(s2).reverse().toString();
	System.out.print(s3+" ");
  }
}	
}
