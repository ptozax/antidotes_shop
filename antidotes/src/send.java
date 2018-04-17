
import java.util.Scanner;




public class send {
    int end_total;
    String location;
    
    
    public void  sum_Express(int total){
    end_total=total;
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
       System.out.println("Plese provide an address.");
       location=kbw.nextLine();
       end_total=end_total+200;
       
       
       
       
       
       
    }
    
    
    else{
    System.out.println("Plese provide an address.");
    location=kbw.nextLine();
    
    
    }
    
    


}
    
    
    
    
    
}
