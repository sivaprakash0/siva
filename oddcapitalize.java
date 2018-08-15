package set4;

import java.util.Scanner;

public class oddcapitalize {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	String s=in.nextLine();
	String s3[]=s.split(" ");
	for(String s4:s3){
		String s2="";
		char s1[]=s4.toCharArray();
	for(int i=0;i<s4.length();i++){
		if(i%2==0){
			s2+=Character.toString(s1[i]).toUpperCase();
		}
		else{
			s2+=Character.toString(s1[i]);
		}
      }
	System.out.print(s2+" ");
    }
  }
}