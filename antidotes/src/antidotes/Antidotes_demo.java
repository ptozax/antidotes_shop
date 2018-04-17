package antidotes;
import java.util.Scanner;
class engin {

   public static int login(){
   String id_in="aaa";
   String id;
   String pass_in="111";
   String pass;
   
  Scanner kbw=new Scanner(System.in);     
     
      Antidotes_demo m =new Antidotes_demo();
      
      
       System.out.print("enter ID: ");
       id=kbw.nextLine();
       
       System.out.print("enter password: ");
       pass=kbw.nextLine();
       if(!id_in.equals(id)||!pass.equals(pass_in)){
           m.count--;
           
       System.out.println("-----WRONG-----");  
       }
       else if(id_in.equals(id)&&pass_in.equals(pass)){
       m.count=0;
       
       }
   
   return m.count;
   
   }
}
abstract class animals{
     
     
}
abstract class snake extends animals{

}
    abstract class cobra extends snake{//1

    }
    abstract class king_cobra extends snake{//2

    }
    abstract class krait extends snake{//3

    }
    abstract class green_pit_vipers extends snake{//4

    }
    abstract class beaked_sea_snake extends snake{//5

    }
abstract class jellyfish extends animals{
    
    abstract class pmow extends jellyfish{//pmow=Portuguese Man o' War
    
    }
       
    abstract class sea_wasp extends jellyfish{
    
    }
       
    abstract class box_jellyfish extends jellyfish{
    
    }
       
    abstract class mobaka_sp extends jellyfish{
    
    }
           
    abstract class cup_child extends jellyfish{
    
    }
    
}
abstract class spider extends animals{

}
abstract class fish extends animals{

}
    //------------------------------Animals interface---------------------------
interface antidotes{
    
    void print_antidote();
    
}
interface poisons{
    
    void print_poison();
}
public class Antidotes_demo {

 static int a;
  static int count=3;
    public static void main(String[] args) {
          System.out.println("Welcome to Mia's Antidotes Shop");
         Scanner kbw =new Scanner(System.in);
        
        engin e =new engin();
         do{ 
         a=e.login();
         }while(a!=0);
         a a = new a();
         a.print();
    }
  
    
}
class a{
void print(){
    System.out.println("a");
}
}
//gg