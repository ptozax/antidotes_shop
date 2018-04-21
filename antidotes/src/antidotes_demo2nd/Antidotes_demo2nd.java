package antidotes_demo2nd;
import java.util.Scanner;
class get{
      int i;
        int getloginval(){
       this.i=engin.maincount;
    return this.i;
    }
}
class engin {
    
    static int maincount;
    engin(){
  
   String id_in="aaa";
   String id;
   String pass_in="111";
   String pass;
  Scanner kbw=new Scanner(System.in);     
      Antidotes_demo2nd m =new Antidotes_demo2nd();
       System.out.print("enter ID      : ");
       id=kbw.nextLine();
       System.out.print("enter password: ");
       pass=kbw.nextLine();
       if(!id_in.equals(id)||!pass.equals(pass_in)){
       System.out.println("-----WRONG-----");  
       m.count=0;
       }
       else if(id_in.equals(id)&&pass_in.equals(pass)){
       }
       maincount=m.count;
    }
}
class  login extends engin{
    
    login(){
        super();}
}

public class Antidotes_demo2nd {

 static int login_c;

static int count=3,month,b=1;
  
    public static void main(String[] args) {
         send se =new send();
       
        
        
        Dowanttobuy wanna = new Dowanttobuy();
          System.out.println("Welcome to Mia's Antidotes Shop");
         Scanner sci =new Scanner(System.in);
        Analyze anl = new Analyze();
     //send se= new send();
        get got=new get();
      int a;
        login log = new login();
        a=got.getloginval(); 
           while(a!=0){
               anl.ana1();
               a=0;
           }
          
         }

           }

 

