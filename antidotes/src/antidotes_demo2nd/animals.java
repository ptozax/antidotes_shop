
package antidotes_demo2nd;

abstract class animals implements prominents{
  public abstract  String prominents();
}
abstract class snake extends animals{
    public String snakeo;
public  abstract  String prominents();
 void snake1(){
  
    System.out.println("Do it have cobra hood  ?");
}void snake2(){
            System.out.println("What is prominents point of this snake ?");
}
 String print(){
     return snakeo;}
}
class printsnake1 extends snake{
    public String prominents(){
    
    return "";}
    printsnake1(){snake1();}
}class printsnake2 extends snake{
    public String prominents(){
    
    return "";}
    printsnake2(){snake2();
    }
    
    }

   


    class cobra extends snake implements antidotes{//1
      public  String prominents(){
            return "small cobra hood";
        }
       public String print_antidote(){
       return "Cobra poison serum";}
       String print(){
 return "The snake was bit you is Cobra."+"\nAntidote is "+print_antidote()+".";
       }
    }

    class king_cobra extends snake  implements antidotes{//2
       public  String prominents(){
            return "big cobra hood";
        }
        public String print_antidote(){
       return "King Cobra poison serum";}
        String print(){
       return "The snake was bit you is King Cobra."+"\nAntidote is "
               +print_antidote()+".";
       }
    }

    class krait extends snake implements antidotes{//3
       public  String prominents(){
        return "Articulate Stripped";
        }
         public String print_antidote(){
       return "Krait poison serum";}
          String print(){
 return "The snake was bit you is Krait."+"\nAntidote is "+print_antidote()+".";
       }

    }
    class green_pit_vipers extends snake{//4
        
  public String prominents(){
    
    return "Brown-tail";}
public String print_antidote(){
       return "Green pit viper poison serum";}
          String print(){
       return "The snake was bit you is Green pit viper."+"\nAntidote is "+
               print_antidote()+".";
       }
    }

abstract class jellyfish extends animals implements antidotes{
String print(){return "";}
void jfish(){
        System.out.println("Do it have Hourglass stripped on it's Belly");
    }
}class pjfish extends jellyfish{
  public String prominents(){return "";}
public String print_antidote(){
       return "";}
pjfish(){
super.jfish();
}
}
    
   class pmow extends jellyfish{//pmow=Portuguese Man o' War
     public  String prominents(){
    
    return "Like a umbrella with red-fire color body";}
public String print_antidote(){
       return "Clean wounds with vinegar";}
          String print(){
       return "The Jellyfish was thorn you is Portuguese Man o' War."
               +"\nTreatment is "+print_antidote()+".";
       }
    }
       
    class sea_wasp extends jellyfish{
     public  String prominents(){
    
    return "Box head with thread arm";}
public String print_antidote(){
       return "Remove Poisonous Sting and Call Rescue officer";}
          String print(){
       return "The Jellyfish was thorn you is Green pit sea wasp."
               +"\nTreatment is "+print_antidote()+".";
       }
    }
       
           
    class cup_child extends jellyfish{
      public String prominents(){
    
    return "cylinder head with big 4 thread arm";}
public String print_antidote(){
       return "Clean your wounds with vinear and Go hospital";}
          String print(){
       return "The Jellyfish was bit you is Green pit viper."
               +"\nTreatments is "+print_antidote()+".";
       }
    }
    

abstract class spider extends animals  implements antidotes{
    void spider1(){
        System.out.println("Do it have Hourglass stripped on it's Belly");
    }
}class printspider extends spider{
  public String prominents(){return "";}
public String print_antidote(){
       return "";}
printspider(){
super.spider1();
}
}
        
    
    
    

    class blackwidow extends spider{
         public  String prominents(){
    
    return "Have red Hourglass stripped on it's black Belly";}
public String print_antidote(){
       return "Black Widow Anti-poisonous serum ";}
          String print(){
       return "The Spider was bit you is Black Widow."+"\nAntidote is "
               +print_antidote()+".";
       }
    }
     class brownwidow extends spider{
         
         public  String prominents(){
    
    return "Have red Hourglass stripped on it's brown Belly";}
public String print_antidote(){
       return "Brown Widow Anti-poisonous serum";}
          String print(){
       return "The snake was bit you is Green pit viper."+"\nAntidote is "
               +print_antidote()+".";
       }
    }
     class brs extends spider {//brown recluse spider
          public String prominents(){
    
    return "Small leg and brown body ";}
public String print_antidote(){
       return "Clean your wouds and GO TO HOSPITAL ACCELERATED !!! ";}
          String print(){
   return "The spider was bit you is Brown recluse spider."+"\nTreatnent : "
               +print_antidote()+".";
       }
    }


abstract class fish extends animals implements antidotes{
    String print(){return "";}
    public String print_antidote(){return "";}
void fish1(){
    System.out.println("What Prominents point that you have saw ?");
}}
 class pf extends fish{
      public String prominents(){return "";}
    pf(){
     fish1();
     
}
 
}

    class pufferfish extends fish{
          public String prominents(){
    
    return "Have thorn around the body";}
public String print_antidote(){
       return "You have to go to Hospitol only it's don't have any"+
               " antidotes for it";}
          String print(){
       return "The fish you was ate is."+"\n "+print_antidote()+".";
       }
}
    class lionfish extends fish{
         public  String prominents(){
    
    return "Have Hard Dorsal fins and Bighead";}
public String print_antidote(){
       return "Heat the wounds";}
          String print(){
       return "The Fish was hit you is Lion fish."+"\nTreatment is "
               +print_antidote()+".";
       }
}
    class stingray extends fish{
         public  String prominents(){
    
    return "Flat and round";}
public String print_antidote(){
       return "Stop the bleeding first and then heat the wound if it "
               + "isn't better go to hospital";}
          String print(){
       return "The Fish was hit you is Stingray."+"\nAntidote is "
               +print_antidote()+".";
       }
}

    //------------------------------Animals interface---------------------------
interface antidotes{
    
    String print_antidote();
    
}
interface prominents{
    
    String prominents();
}
    

