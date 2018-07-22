import java.util.Scanner;
public class stringencd {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	String w=in.next().toLowerCase();
         String w1=in.next().toLowerCase();
          String x="";
          char c[]=w.toCharArray();
          char c1[]=w1.toCharArray();
       for(int i=0;i<w.length();i++){
    	   int s=((c[i])-96+(c1[i])-96)+96;
        if(s>122){
           s=(s-122)+96;	
          }
          char a=(char)s;
            x=x+a;
       }
     System.out.println(x);
  }
}
