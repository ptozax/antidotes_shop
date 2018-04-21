package antidotes_demo2nd;
import java.util.Scanner;
class engin {
   public static int login(){
   String id_in="aaa";
   String id;
   String pass_in="111";
   String pass;
  Scanner kbw=new Scanner(System.in);     
      Antidotes_demo2nd m =new Antidotes_demo2nd();
       System.out.print("enter ID: ");
       id=kbw.nextLine();
       System.out.print("enter password: ");
       pass=kbw.nextLine();
       if(!id_in.equals(id)||!pass.equals(pass_in)){
           m.count--;
       System.out.println("-----WRONG-----");  
       }
       else if(id_in.equals(id)&&pass_in.equals(pass)){
       m.count=4;
       }
   return m.count;
   }
}
public class Antidotes_demo2nd {

 static int login_c;
  static int count=3;
  
    public static void main(String[] args) {
        Dowanttobuy wanna = new Dowanttobuy();
          System.out.println("Welcome to Mia's Antidotes Shop");
         Scanner kbw =new Scanner(System.in);
        Analyze anl = new Analyze();
        engin e =new engin();
         do{
         login_c=e.login();
         if(login_c==4){
             System.out.println("=====Login completed=====");
             System.out.println("Analyze Process");
             anl.ana1();
             
         }
         }while(login_c!=0 && login_c!=4);
    }
}

