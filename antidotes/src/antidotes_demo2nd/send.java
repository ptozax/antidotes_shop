 package antidotes_demo2nd;


import java.util.Scanner;





public class send {
    double [] array_money =new double [12];
     int  [] array_stock =new  int  [6];
     
    
  
    
    
    
    
    
    
    
    
    
    double i1,i2;
     double total=0;
     int end_total1=0;
     double end_total2=0;
     int change=0;
     int money_in=0;
     String location="";
     String name="";
     int month=0;
     double delivery_fee=0;
    // private double money_1,money_2,money_3,money_4,money_5,money_6,money_7,money_8,money_9,money_10,money_11,money_12;
       public void  sum_Express(int total , int month){
    
     
     
     end_total1=total;
        this.month=month;
        Scanner kbn =new Scanner(System.in);
        Scanner kbw =new Scanner(System.in);
   
        int push=0;
        do{
          System.out.println("Express delivery Push: 1");
          System.out.println("Normal  delivery Push: 2");
          System.out.print("===>");
          push=kbn.nextInt();
          if(push<1||push>2){     System.out.println("========== Please enter again ==========");            }
          
          
          
        }while(push<1||push>2);
    
        
        
        if(push==2){
           
            
            System.out.print("Please enter name ==>");
            name=kbw.nextLine();
            System.out.print("Please provide an address ==>");
            location=kbw.nextLine();
            
            end_total1=end_total1+200;
       
             do{
                 System.out.println("delivery fee is : 200");
                 System.out.println("Total is : "+end_total1);
            
                System.out.print("Please enter your money ==>");
                 money_in=kbn.nextInt();
                  if(money_in<end_total1){
             
                    System.out.println("========== Please enter number again ==========");                     
                  }
            }while(money_in<end_total1);
        
        change=money_in-end_total1;
        
        this.bill1(end_total1, change,money_in ,this.month);
        
        
        
        
        
        
        }
       
    
     
     else  {
            
            
            System.out.print("Please enter name ==>");
            name=kbw.nextLine();
            System.out.print("Please provide an address ==>");
            location=kbw.nextLine();
            System.out.println("");
            if(end_total1<=1500){    
                delivery_fee=0.3*end_total1;   
           // System.out.println("delivery fee is : "+delivery_fee);
            }
            
            
            else if(end_total1>1500&&end_total1<=2500){    
                delivery_fee=0.25*end_total1; 
           // System.out.println("delivery fee is : "+delivery_fee);
            }
            else if(end_total1>2500&&end_total1<=4000){    
                delivery_fee=0.2*end_total1;   
           // System.out.println("delivery fee is : "+delivery_fee);
            }
            else if(end_total1>4000&&end_total1<=6000){    
                delivery_fee=0.15*end_total1;      
            System.out.println("delivery fee is : "+delivery_fee);
            }
            else if(end_total1>6000){
           // System.out.println("delivery fee is free ");
            }
            
           end_total2 =end_total1+delivery_fee;
            this.bill2(end_total2, change,delivery_fee,month);
            
         }
    }
    
 public void  bill1 (  int end_total ,int change ,int money_in ,int month ){
             int   total=end_total;
             int   change_bill =change;
             int   money_bill  =money_in;
             int month_in=month;
         try {
            
             System.out.println("=====Please wait 2 seconds. =====");
             Thread.sleep(2000);
              System.out.println("Delivery to   : "+this.name);
              System.out.println("Location      : "+this.location);
              System.out.println("Total is      : "+total);
              System.out.println("Your money is : "+money_bill);
              System.out.println("Change is     : "+change_bill);
              System.out.println("==================== Thank you ====================");
         } catch (java.lang.InterruptedException iex) {
             System.out.println("iex");;
        }
   

       array_money[month_in]= array_money[month_in]+total;
       
 
 
 
 
 
 
 
 
 
 } 
 
 
 
 
 
 
 
 
 public void  bill2 (  double end_total ,int change,double delivery_fee ,int month){
             total=end_total;
             double   delivery=delivery_fee;
             int   change_bill =change;
             int   money_bill  =money_in;
         
             
     try {
             
             System.out.println("=====Please wait 2 seconds. =====");
              Thread.sleep(2000);
              System.out.println("Delivery to     : "+this.name);
              System.out.println("Location        : "+this.location);
              System.out.println("Delivery fee is : "+delivery);
              System.out.println("Total is        : "+total);
              
              
              System.out.println("========= Have expenses follow the distance =========");
              System.out.println("========== Please wait an hour and a half ==========");
              System.out.println("==================== Thank you ====================");
            
             
              
         } catch (java.lang.InterruptedException iex) {
             System.out.println("iex");
        
         
         }
      try {
       Thread.sleep(2000);
       delivery_man dm=new delivery_man(total ,this.name,this.location,month );
           } catch (java.lang.InterruptedException iex) {
             System.out.println("iex");
        
         
                          }
       
 }
 
 
 
 
 
 
 
 public void  bill3(double total_dm ,double  money,double distance,String name ,String location, int month ){
             int month_in=month;
             double   total_in=total_dm;
             double  money_in=money;
             double distance_in= distance;
             double change_bill=money_in-total_in;
             String name_in=name;
             String location_in= location;    
                 try {
             
                    System.out.println("=====Please wait 2 seconds. =====");
                       Thread.sleep(2000);
                    System.out.println("Delivery to  : "+name_in);
                    System.out.println("Location     : "+location_in);
              
             
                    System.out.println("Charge is    : "+distance_in);
                    System.out.println("Total is     : "+total_in);
                    System.out.println("You moeny is : "+money_in);
                    System.out.println("Change is    : "+change_bill);
                    System.out.println("==================== Thank you ====================");
                    } 
                 catch (java.lang.InterruptedException iex) {
                        System.out.println("iex");;
                        }
            array_money[month_in]= array_money[month_in]+total;
     
            
            
            
            
            
            
            
            
 }       

 }
 