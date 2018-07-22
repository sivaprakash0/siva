import java.util.Scanner;
public class subtwochr {
public static void main(String[] args) {
	Scanner rd=new Scanner(System.in);
	String wr=rd.next().toLowerCase();
	String wr1=rd.next().toLowerCase();
	char c[]=wr.toCharArray();
	char c1[]=wr1.toCharArray();
	int sum=0,sub,tot=0,fn=0;
	int ans=0;
	 if(wr.length()<wr1.length()){
		for(int i=0;i<wr.length();i++){
			sub=Math.abs(c[i]-c1[i]);
			sum=sum+sub;
			fn=i;
		      }
		  for(int j=fn+1;j<wr1.length();j++){
			tot=wr1.charAt(j)-96+tot;
		      }
		         ans=sum+tot;
		   }
	 else{
		for(int i=0;i<wr1.length();i++){
			sub=Math.abs(c[i]-c1[i]);
			sum=sum+sub;
			fn=i;
		       }	
		  for(int j=fn+1;j<wr.length();j++){
			tot=wr.charAt(j)-96+tot;
		       }
			  ans=sum+tot;
		     }
	     System.out.println(ans);
}
}
