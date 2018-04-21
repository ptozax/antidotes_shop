
package antidotes_demo2nd;
import java.util.Scanner;
//เอาไปใส่ในช้อยส์ ของ analyze
class Dowanttobuy {
    private int price;
    static int priceshow;
    static int amout;
 void Dowanttobuy_print(){
        String yn;
        int check;
        Scanner want = new Scanner(System.in);
        Scanner amo = new Scanner(System.in);
       do{ System.out.println("Do you want to buy this antidote(s) [Y/N] ?");
       check=0;
           System.out.print("===>");
            yn=want.nextLine();
            
            if(yn.equals("y" )|| yn.equals("Y")){
               
                
             do{   
                
                
                System.out.println("How much");
                System.out.print("===>");
                amout=amo.nextInt();  
            if(amout<1){
                System.out.println("========== Please enter number again ==========");
            
            }
             }while(amout<1);
            
            
            
            }
            else if(yn.equals("n" )|| yn.equals("N")){
                System.out.println("We hoping for a quick turnaround on your ailment."); 
            }else{System.out.println("Please answer [Y] or [N]");
            check=0;
            }
       }while (check==1); 
    }
  void calprice(int price){
      this.price = Dowanttobuy.amout*price;
      System.out.println("Total price is "+this.price);
      priceshow=this.price;
  }
  int priceback(){
  return price;
  }
  }


