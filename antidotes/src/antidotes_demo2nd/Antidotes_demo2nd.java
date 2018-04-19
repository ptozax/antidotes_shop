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
 abstract class animals{
  
}
abstract class snake extends animals{
 void snake1(){
  
    System.out.println("Do it have cobra hood  ?");
}
}
class printsnake extends snake{
    printsnake(){snake1();
}
   
}

    class cobra extends snake{//1
       String cobrap(){
            return "small cobra hood";
        }
    }
    class king_cobra extends snake{//2
        String king_cobrap(){
            return "big cobra hood";
        }
    }
    class krait extends snake{//3

    }
    class green_pit_vipers extends snake{//4

    }
    class beaked_sea_snake extends snake{//5

    }
abstract class jellyfish extends animals{
    
   class pmow extends jellyfish{//pmow=Portuguese Man o' War
    
    }
       
    class sea_wasp extends jellyfish{
    
    }
       
    class box_jellyfish extends jellyfish{
    
    }
       
    class mobaka_sp extends jellyfish{
    
    }
           
    class cup_child extends jellyfish{
    
    }
    
}
abstract class spider extends animals{
    class blackwidow extends spider{
        
    }
     class brownwidow extends spider{
        
    }
     class brs extends spider{//brown recluse spider
        
    }
}

abstract class fish extends animals{
    class pufferfish extends fish{
}
    class lionfish extends fish{
}
    class stingray extends fish{
}
}
    //------------------------------Animals interface---------------------------
interface antidotes{
    
    void print_antidote();
    
}
interface poisons{
    
    void print_poison();
}







    //-----------------------------------Analyze-------------------------------------
class Analyze{
   cobra cob =new cobra();
   king_cobra kcob = new king_cobra();
    String ana_c1,
            ana_c2a,ana_c2b,
            ana_c3a,ana_c3b,ana_c3c,ana_c3d,
            ana_c4,yn; int checkw=0;
    Scanner scana = new Scanner(System.in);       
    void ana1(){// ?????????
       do{ System.out.println("On the [1]Earth or in the [2]Water");
        ana_c1=scana.nextLine();
        if(ana_c1.equals("1")){
            ana2A();    checkw=0;
        }else if(ana_c1.equals("2")){
            ana2B();    checkw=0;
        }else{System.out.println("Press only '1' or '2' Please");checkw=1;}
    }while(checkw==1);}
    
    void ana2A(){// snake or spider
 do{System.out.println("[1]Snake or [2]Spider [3]Uncertain");
        ana_c2a=scana.nextLine();
        if(ana_c2a.equals("1")){checkw=0;
          do{ printsnake prts = new printsnake();
            System.out.println("Yes[Y] No[N]");
               yn=scana.nextLine();
                if(yn.equals("Y") || yn.equals("y")){//have borahood or not
                    System.out.println("How about it ?");
                    System.out.println("[1]"+cob.cobrap());
                  System.out.print("[2]"+kcob.king_cobrap());
                    kcob.king_cobrap(); checkw=0;
                }else if(yn.equals("n") || yn.equals("N")){checkw=0;
                
                }else{System.out.println("Please answe again");checkw=1;}
          }while(checkw==1);
               
        }else if(ana_c2a.equals("2")){checkw=0;
            
        }else if(ana_c2a.equals("3")){checkw=0;
            
        }
        else{System.out.println("Press only '1' '2' or '3' Please");checkw=1;}
    }while(checkw==1);}
    
        void ana3A(){
            do{System.out.println("[1]Snake or [2]Spider [3]Uncertain");
        ana_c2a=scana.nextLine();
        if(ana_c2a.equals("1")){
            
        }else if(ana_c2a.equals("2")){checkw=0;
            
        }else if(ana_c2a.equals("3")){checkw=0;
            
        }
        else{System.out.println("Press only '1' '2' or '3' Please");checkw=1;}
            
            
            }while(checkw==1);
        
        }
    
    
    
    
    
    
    
    
    
    
    
    
    void ana2B(){//??? ????????? ???
        do{System.out.println(" [1]Fish  [2]Jellyfish [3]Shell [4]Uncertain");
        ana_c2b=scana.nextLine();
        if(ana_c2b.equals("1")){
            
        }else if(ana_c2b.equals("2")){
            
        }else if(ana_c2b.equals("3")){
            
        }
    else if(ana_c2b.equals("4")){
            
        }
        else{System.out.println("Press only '1' '2' '3' or '4' Please"); checkw=1;}
    }while(checkw==1);
   }
    }
    
    











public class Antidotes_demo2nd {


    
    
    
 static int login_c;
  static int count=3;
    public static void main(String[] args) {
        send s = new send();
        s.sum_Express(500);
                
        
        
          System.out.println("Welcome to Mia's Antidotes Shop");
         Scanner kbw =new Scanner(System.in);
        Analyze anl = new Analyze();
        engin e =new engin();
         do{
         login_c=e.login();
         if(login_c==4){
             System.out.println("=====Login completed=====");
             anl.ana1();}
         }while(login_c!=0 && login_c!=4);
    }
}

