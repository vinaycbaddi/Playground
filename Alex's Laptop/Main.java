
import java.util.Scanner;
public class Main {
    static class Laptop{
      public String brandName;
      public String processorName;
      public String os;
      public long processorRange;
      public long ram;
      public void displayLaptopDetails(){
          if(this.processorRange>0&&this.ram>0){
              System.out.println("Laptop Details");
              System.out.println("Laptop Brand: "+this.brandName);
              System.out.println("Processor Name: "+this.processorName);
              System.out.println("OS: "+this.os);
              System.out.println("Processor Range: "+this.processorRange+" bit");
              System.out.println("Ram: "+this.ram+" GB");
          }
          else
              System.out.println("Invalid Input");
      }


    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
	    Laptop a=new Laptop();
	    a.brandName=in.nextLine();
        a.processorName=in.nextLine();
        a.os=in.nextLine();
        a.processorRange=in.nextLong();
        a.ram=in.nextLong();
        a.displayLaptopDetails();
    }
}
