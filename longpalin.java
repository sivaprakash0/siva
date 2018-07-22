import java.util.Scanner;
public class longpalin {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	String nm=in.next();
	int id=0;
	for(int i=1;i<=nm.length();i++){	
		String b=nm.substring(0,i);
		String a=new StringBuffer(b).reverse().toString();
		if(b.equals(a)){
		id=i;
		}
	}
	int brc=id;
	for(int i=1;i<=nm.length();i++){
		String nr=new StringBuffer(nm).reverse().toString();
		String b=nr.substring(0,i);
		String a=new StringBuffer(b).reverse().toString();
		if(b.equals(a)){
		id=i;
		}
	}
	int arc=id;
	if(brc>arc){
	System.out.println(nm.length()-brc);
	}
	else{
		System.out.println(nm.length()-arc);
	}	
}
}
