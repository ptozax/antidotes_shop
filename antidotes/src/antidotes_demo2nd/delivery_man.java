
package antidotes_demo2nd;

import java.util.Scanner;
public class delivery_man extends send {
    delivery_man(double total,String name,String location ,int month){
        String name_dm=name;
        String location_dm=location;
        
        
        double total_dm=total;
        System.out.println("");
        System.out.println("====================================================");
        System.out.println("================= DELIVERY MAN =====================");
        System.out.println("====================================================");
        System.out.println("");
       
        
       
        
       Scanner kbn=new Scanner(System.in);
       System.out.print("Please enter distance(km.) : ");
       double distance=kbn.nextInt();
       distance=distance*1.5;
       total_dm=total_dm+distance;
       System.out.println("Charge is :"+distance);
       System.out.println("Total is : "+total_dm);
        
       
       double  money=0;
       
       do{
       System.out.print("Please enter your money : ");
       money=kbn.nextDouble();
       
       if(money<total_dm){ System.out.println("========== Please enter money again ==========");     }
       
       
       
       }while(money<total_dm);
       System.out.println("");
      
       System.out.println("==================== bill ===================="); 
       super.bill(total_dm,money,distance,name_dm,location_dm ,month);
      
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    
    
    
    
    
    }









}
