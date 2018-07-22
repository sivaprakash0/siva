import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class pangram {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	String sen=in.nextLine().toLowerCase();
	String al=sen.replaceAll(" ","");
	char c1[]=al.toCharArray();
	Set set = new HashSet();
	 for(char c: c1){
         set.add(c);
     }
	if(set.size()==26){System.out.println("yes");}
	else{System.out.println("no");}
}
}
