import java.util.Scanner;
public class notsame {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	String wrd=in.next();
	String wrd1=in.next();
	char c[]=wrd.toCharArray();
	char c1[]=wrd1.toCharArray();
	int cn=0;
	if(wrd.length()<wrd1.length()){
	for(int i=0;i<wrd.length();i++){
		if(c[i]==c1[i]){
		    cn++;
		}
	      }
	    System.out.println(wrd1.length()-cn);
	}
	else{
	 for(int i=0;i<wrd1.length();i++){
		if(c[i]==c1[i]){
		     cn++;
		 }
	       }
	System.out.println(wrd.length()-cn);		
        }
}
}
