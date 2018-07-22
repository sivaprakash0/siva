package gold;

import java.util.Scanner;

public class longpalin {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	String nm=in.next();
	int id=0;
	//System.out.println("Before Reverse String Value :");
	
	for(int i=1;i<=nm.length();i++){
	
		String b=nm.substring(0,i);
		String a=new StringBuffer(b).reverse().toString();
		//System.out.println(b+" : rev is : "+a);
		if(b.equals(a)){
		id=i;
		//System.out.println("pali = "+a+" at ind of : "+id);
		}
	}
	int brc=id;
	//System.out.println("After Reverse String Value :");
	for(int i=1;i<=nm.length();i++){
		String nr=new StringBuffer(nm).reverse().toString();
		String b=nr.substring(0,i);
		String a=new StringBuffer(b).reverse().toString();
		//System.out.println(b+" : rev is : "+a);
		if(b.equals(a)){
		id=i;
		//System.out.println("pali = "+a+" at ind of : "+id);
		}
	}
	int arc=id;
	if(brc>arc){
	System.out.println("Remaing char count : "+(nm.length()-brc));
	}
	else{
		System.out.println("Remaing char count : "+(nm.length()-arc));
	}
	
}
}
