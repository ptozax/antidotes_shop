package antidotes_demo2nd;
import java.util.Scanner;
class Analyze{
   cobra cob =new cobra();
   king_cobra kcob = new king_cobra();
   krait kra = new krait();
   green_pit_vipers gpv = new green_pit_vipers();
   blackwidow blw = new blackwidow();
   brownwidow brw = new brownwidow();
   brs brs = new brs();
  fish puf =new pufferfish();
  fish sting =new stingray();
  fish lion =new lionfish();
  jellyfish mow = new pmow();
  jellyfish sw = new sea_wasp();
  jellyfish ch = new cup_child();
  Dowanttobuy dwtb = new Dowanttobuy();
    String ana_c1,
            ana_c2a,ana_c2b,
            ana_c3a,ana_c3b,ana_c3c,ana_c3d,
            ana_c4,yn; int checkw=0;
            int choice1_2;
    Scanner scana = new Scanner(System.in);    
    Scanner scanchoice = new Scanner(System.in);
    void ana1(){// บกหรือน้ำ
       do{ System.out.println("On the [1]Earth or in the [2]Water");
        ana_c1=scana.nextLine();
        if(ana_c1.equals("1")){
            ana2A();    checkw=0;
        }else if(ana_c1.equals("2")){
            ana2B();    checkw=0;
        }else{System.out.println("Press only '1' or '2' Please");checkw=1;}
    }while(checkw==1);}
    
    void ana2A(){// snake or spider
 do{System.out.println("[1]Snake or [2]Spider");
        ana_c2a=scana.nextLine();
        if(ana_c2a.equals("1")){checkw=0;
          do{ printsnake1 prts1 = new printsnake1();
            System.out.println("Yes[Y] No[N]");
             yn=scana.nextLine();
                if(yn.equals("Y") || yn.equals("y")){//have borahood or not
                    do{System.out.println("How about it ?");
                    System.out.println("[1]"+cob.prominents());
                        System.out.println("[2]"+kcob.prominents());
                            choice1_2=scanchoice.nextInt();
                            if (choice1_2==1){
                                System.out.println(cob.print());
                                dwtb.Dowanttobuy_print();
                               dwtb.calprice(500);
                                
                                checkw=0;}
                                    else if(choice1_2==2){
                                            System.out.println(kcob.print());
                                            dwtb.Dowanttobuy_print();
                                dwtb.calprice(800);
                                         
                                checkw=0; }
                              else{System.out.println("[1] or [2] Please"); checkw=1;}
                    }while(checkw==1);
                  checkw=0;
                }else if(yn.equals("n") || yn.equals("N")){checkw=0;
                 do{ printsnake2 a = new printsnake2();
                        System.out.println("[1]"+kra.prominents()+"  [2]"+gpv.prominents());
                        choice1_2=scanchoice.nextInt();
                        if(choice1_2==1){
                            System.out.println( kra.print()); checkw=0;
                            dwtb.Dowanttobuy_print();
                                dwtb.calprice(700);
                        }else if(choice1_2==2){
                            System.out.println(gpv.print());
                            dwtb.Dowanttobuy_print();
                                dwtb.calprice(650);checkw=0;
                        }else{System.out.println("Please answer again");checkw=1;}

                 }while(checkw==1);
                }else{System.out.println("Please answer again");checkw=1;}
          }while(checkw==1);
               
        }else if(ana_c2a.equals("2")){checkw=0;
            do{ printspider prd = new printspider();
            System.out.println("Yes[Y] No[N]");
             yn=scana.nextLine();
                if(yn.equals("Y") || yn.equals("y")){//have borahood or not
                    do{System.out.println("How about it ?");
                    System.out.println("[1]"+blw.prominents());
                        System.out.println("[2]"+brw.prominents());
                            choice1_2=scanchoice.nextInt();
                            if (choice1_2==1){
                                System.out.println(blw.print());
                                dwtb.Dowanttobuy_print();
                                dwtb.calprice(1000);
                                checkw=0;}
                                    else if(choice1_2==2){
                                            System.out.println(brw.print());
                                            dwtb.Dowanttobuy_print();
                                             dwtb.calprice(1000);
                                             checkw=0;

                                checkw=0; }
                              else{System.out.println("[1] or [2] Please"); checkw=1;}
                    }while(checkw==1);
                  checkw=0;
                }else if(yn.equals("n") || yn.equals("N")){
                            System.out.println( brs.print());
                            dwtb.Dowanttobuy_print();
                }else{System.out.println("Please answer again");checkw=1;}
          }while(checkw==1);
            
        }
        else{System.out.println("Press only '1' or '2' Please");checkw=1;}
        
    }while(checkw==1);}
    
        
    void ana2B(){//ปลา แมงกะพรุน หอย
        do{System.out.println(" [1]Fish  [2]Jellyfish ");
        ana_c2b=scana.nextLine();
        if(ana_c2b.equals("1")){do{ pf pf = new pf();
                    do{System.out.println("How about it ?");
                    System.out.println("[1]"+puf.prominents());
                    System.out.println("[2]"+lion.prominents());
                    System.out.println("[3]"+sting.prominents());
                            choice1_2=scanchoice.nextInt();
                            if (choice1_2==1){
                                System.out.println(puf.print());
                                checkw=0;}
                                    else if(choice1_2==2){
                                            System.out.println(lion.print()); }
                                    else if(choice1_2==3){System.out.println(sting.print());}
                              else{System.out.println("[1] or [2] Please"); checkw=1;}
                    }while(checkw==1);
                  checkw=0;
          }while(checkw==1);
            
            
        }else if(ana_c2b.equals("2")){//แมงกะพรุน
            do{ pjfish pf = new pjfish();
                    do{System.out.println("How about it ?");
                    System.out.println("[1]"+mow.prominents());
                    System.out.println("[2]"+sw.prominents());
                    System.out.println("[3]"+ch.prominents());
                            choice1_2=scanchoice.nextInt();
                            if (choice1_2==1){
                                System.out.println(mow.print());
                                checkw=0;}
                                    else if(choice1_2==2){
                                            System.out.println("[2]"+sw.print()); }
                                    else if(choice1_2==3){System.out.println("[3]"+ch.print());}
                              else{System.out.println("[1]  [2] or [3] Please"); checkw=1;}
                    }while(checkw==1);
                  checkw=0;
          }while(checkw==1);
            
        }

        else{System.out.println("Press only '1' or '2' Please"); checkw=1;}
    }while(checkw==1);
   }
    }