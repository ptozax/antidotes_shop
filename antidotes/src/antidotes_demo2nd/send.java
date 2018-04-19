package antidotes_demo2nd;


import java.util.Scanner;




public class send {
  
     int end_total1;
     int end_total2;
     int change;
     int money_in;
     String location;
     String name;
    
       public void  sum_Express(int total){
        end_total1=total;
        end_total2=total;
        Scanner kbn =new Scanner(System.in);
        Scanner kbw =new Scanner(System.in);
   
        int push=0;
        do{
          System.out.println("Express delivery Push: 1");
          System.out.println("Normal  delivery Push: 2");
          System.out.print("===>");
          push=kbn.nextInt();
        }while(push>=1&&push<=2);
    
        
        
        if(push==2){
           
            
            System.out.print("Please enter name ==>");
            name=kbw.nextLine();
            System.out.println("Please provide an address.");
            location=kbw.nextLine();
            
            end_total1=end_total1+200;
       
             do{
            
                System.out.print("Please enter your money ==>");
                 money_in=kbn.nextInt();
                  if(money_in<=end_total1){
             
                    System.out.println("********************** Please enter number again **********************");                     
                  }
            }while(money_in>=end_total1);
        
        change=money_in-end_total1;
        
        this.bill(end_total1, change,money_in );
        
        
        
        
        
        
        }
       
    
    
    else{
             
            int delivery_fee;
            System.out.print("Please enter name ==>");
            name=kbw.nextLine();
            System.out.println("Please provide an address.");
            location=kbw.nextLine();
            
            if(end_total2<=1500){    
                delivery_fee=(30/100)*end_total2;   
            System.out.println("delivery fee is : "+delivery_fee);}
            
            
            else if(end_total2>1500&&end_total2<=2500){    
                delivery_fee=(25/100)*end_total2; 
            System.out.println("delivery fee is : "+delivery_fee);}
            else if(end_total2>2500&&end_total2<=4000){    
                delivery_fee=(20/100)*end_total2;   
            System.out.println("delivery fee is : "+delivery_fee);}
            else if(end_total2>4000&&end_total2<=6000){    
                delivery_fee=(15/100)*end_total2;      
            System.out.println("delivery fee is : "+delivery_fee);}
            else if(end_total2>6000){
              System.out.println("delivery fee is free");
            }
            
         
            
            
             
            
            
            
            
            
            
            
            
            
            
            
           
    
    }
    
    


}
    
 public void  bill (  int end_total ,int change ,int money_in  ){
     
      int   total=end_total;
      int   change_bill =change;
      int   money_bill  =money_in;
 
     System.out.print("Delivery to : "+this.name);
     System.out.print("Location : "+this.location);
     System.out.print("Total is : "+total);
     System.out.print("Your money is : "+money_bill);
     System.out.println("Change is : "+change_bill);      
 
 
 
 }      
       
       
       
       
       
       
       
    
    
    
    
}
