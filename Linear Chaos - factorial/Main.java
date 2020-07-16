import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    factorial z= (int x)->{
      int a=1;
      if(x>=0){
      for(int i=1;i<=x;i++){
        a=a*i;
    	}
        System.out.println(a);
      }
      else 
        System.out.println("Invalid Input");
      
    }; 
      int q=in.nextInt();
      z.abstractFact(q);
  }
}
interface factorial{
	void abstractFact(int x);
}