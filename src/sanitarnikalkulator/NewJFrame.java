
package kalkulator;

/**
 *
 * @author LugalJoshua
 */
public class NewJFrame extends javax.swing.JFrame {
  

public NewJFrame()
       {
        initComponents();
       }
    
    
    public void sanitarni_kalkulator(){
       String man = Man.getText();
       int man1 = Integer.parseInt(man);
       String women = Women.getText();
       int women1 = Integer.parseInt(women);
       
         if( man1>=1&&man1<=9){
         String totalman ="1 LAVABO SA DRŽAČEM ZA PAPIR(SUŠAČ ZA RUKE) 1 WC ŠOLJA";
         TotalMan.setText(totalman); 
         
     }   else if( man1>=10&&man1<=14){
         String totalman ="1 LAVABO SA 1 DRŽAČEM ZA PAPIR(SUŠAČ ZA RUKE) 1 WC ŠOLJA 1 TUŠ KABINA ";
         TotalMan.setText(totalman);  
         
     } else if( man1>=15&&man1<=19){
         String totalman ="2 LAVABOA SA 2 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 1 WC ŠOLJA 1 PISOAR 1 TUŠ KABINA";
         TotalMan.setText(totalman);    
     }
         else if(man1>=20&&man1<=29)
       {
         String totalman ="2 LAVABOA SA 2 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 2 WC ŠOLJE 2 PISOARA 2 TUŠ KABINE ";
          TotalMan.setText(totalman);
         
      } else if(man1>=30&&man1<=39)
       {
          String totalman ="3 LAVABOA SA 3 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 2 WC ŠOLJE 2 PISOARA 3 TUŠ KABINE";
          TotalMan.setText(totalman);
        }  
         else if(man1>=40&&man1<=44)
       {
         String totalman ="3 LAVABOA SA 3 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 3 WC ŠOLJE 3 PISOARA 4 TUŠ KABINE ";
         TotalMan.setText(totalman);
        } 
          else if(man1>=45&&man1<=49)
       {
          String totalman ="4 LAVABOA SA 4 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 3 WC ŠOLJE 3 PISOARA 4 TUŠ KABINE ";
          TotalMan.setText(totalman);
          
       }else if(man1>=50&&man1<=59)
       {
          String totalman ="4 LAVABOA SA 4 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 3 WC ŠOLJE 3 PISOARA 5 TUŠ KABINA ";
          TotalMan.setText(totalman);
       }  
         else if(man1>=60&&man1<=69)
       {
         String totalman =" 5 LAVABOA SA 5 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 4 WC ŠOLJE 4 PISOARA 6 TUŠ KABINA ";
         TotalMan.setText(totalman);
         
          
       }else if(man1>=70&&man1<=74)
       {
         String totalman ="5 LAVABOA SA 5 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 4 WC ŠOLJE 4 PISOARA 7 TUŠ KABINA";
         TotalMan.setText(totalman);
         
       }
         
         else if(man1>=75&&man1<=79)
       {
         String totalman ="6 LAVABOA SA 6 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 4 WC ŠOLJE 4 PISOARA 7 TUŠ KABINA";
         TotalMan.setText(totalman);
         
       } else if(man1>=80&&man1<=89)
       {
         String totalman ="6 LAVABOA SA 6 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 5 WC ŠOLJA 5 PISOARA 8 TUŠ KABINA";
         TotalMan.setText(totalman);
         
       }  else if(man1>=90&&man1<=99)
       {
         String totalman ="7 LAVABOA SA 7 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 5 WC ŠOLJA 5 PISOARA 9 TUŠ KABINA";
         TotalMan.setText(totalman);
         
       } else if(man1>=100&&man1<=104)
       {
         String totalman ="7 LAVABOA SA 7 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 6 WC ŠOLJA 6 PISOARA  10 TUŠ KABINA";
         TotalMan.setText(totalman);
         
       } else if(man1>=105&&man1<=109)
       {
         String totalman ="8 LAVABOA SA 8 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 6 WC ŠOLJA 6 PISOARA 10 TUŠ KABINA ";
         TotalMan.setText(totalman);
         
       }
       else if(man1>=110&&man1<=119)
       {
         String totalman ="8 LAVABOA SA 8 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 6 WC ŠOLJA 6 PISOARA 11 TUŠ KABINA ";
         TotalMan.setText(totalman);
         
       } else if(man1>=120&&man1<=129)
       {
         String totalman ="9 LAVABOA SA 9 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 7 WC ŠOLJA 7 PISOARA 12 TUŠ KABINA ";
         TotalMan.setText(totalman);
         
       } else if(man1>=130&&man1<=134)
       {
         String totalman ="9 LAVABOA SA 9 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 7 WC ŠOLJA 7 PISOARA 13 TUŠ KABINA";
         TotalMan.setText(totalman);
         
       } else if(man1>=135&&man1<=139)
       {
         String totalman ="10 LAVABOA SA 10 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 7 WC ŠOLJA 7 PISOARA 13 TUŠ KABINA";
         TotalMan.setText(totalman);
         
       } else if(man1>=140&&man1<=149)
       {
         String totalman ="10 LAVABOA SA 10 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 8 WC ŠOLJA 8 PISOARA 14 TUŠ KABINA";
         TotalMan.setText(totalman); 
         
       } else if(man1>=150&&man1<=159)
       {
         String totalman ="11 LAVABOA SA 11 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 8 WC ŠOLJA 8 PISOARA 15 TUŠ KABINA";
         TotalMan.setText(totalman);
         
       } else if(man1>=160&&man1<=164)
       {
         String totalman ="11 LAVABOA SA 11 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 9 WC ŠOLJA 9 PISOARA 16 TUŠ KABINA";
         TotalMan.setText(totalman);
         
       } else if(man1>=165&&man1<=169)
       {
         String totalman ="12 LAVABOA SA 12 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 9 WC ŠOLJA 9 PISOARA 16 TUŠ KABINA";
         TotalMan.setText(totalman);
         
       } else if(man1>=170&&man1<=179)
       {
         String totalman ="12 LAVABOA SA 12 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 9 WC ŠOLJA 9 PISOARA 17 TUŠ KABINA";
         TotalMan.setText(totalman);
         
       }  else if(man1>=180&&man1<=189)
       {
         String totalman ="13 LAVABOA SA 13 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 10 WC ŠOLJA 10 PISOARA 18 TUŠ KABINA";
         TotalMan.setText(totalman);
         
       } else if(man1>=190&&man1<=194)
       {
         String totalman ="13 LAVABOA SA 13 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 10 WC ŠOLJA 10 PISOARA 19 TUŠ KABINA ";
         TotalMan.setText(totalman);
         
        }else if(man1>=195&&man1<=199)
       {
         String totalman ="14 LAVABOA SA 14 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 10 WC ŠOLJA 10 PISOARA 19 TUŠ KABINA";
         TotalMan.setText(totalman);
         
        }else if(man1>=200&&man1<=209)
       {
         String totalman ="14 LAVABOA SA 14 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 11 WC ŠOLJA 11 PISOARA 20 TUŠ KABINA";
         TotalMan.setText(totalman);
         
        }else if(man1>=210&&man1<=219)
       {
         String totalman ="15 LAVABOA SA 15 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 11 WC ŠOLJA 11 PISOARA 21 TUŠ KABINA";
         TotalMan.setText(totalman);
         
        }else if(man1>=220&&man1<=224)
       {
         String totalman ="15 LAVABOA SA 15 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 12 WC ŠOLJA 12 PISOARA 22 TUŠ KABINE";
         TotalMan.setText(totalman);
         
        }else if(man1>=225&&man1<=229)
       {
         String totalman ="16 LAVABOA SA 16 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 12 WC ŠOLJA 12 PISOARA 22 TUŠ KABINE";
         TotalMan.setText(totalman);
         
        }else if(man1>=230&&man1<=239)
       {
         String totalman ="16 LAVABOA SA 16 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 12 WC ŠOLJA 12 PISOARA 23 TUŠ KABINE";
         TotalMan.setText(totalman);
         
        }else if(man1>=240&&man1<=249)
       {
         String totalman ="17 LAVABOA SA 17 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 13 WC ŠOLJA 13 PISOARA 24 TUŠ KABINE";
         TotalMan.setText(totalman);
         
        }else if(man1>=250&&man1<=254)
       {
         String totalman ="17 LAVABOA SA 17 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 13 WC ŠOLJA 13 PISOARA 25 TUŠ KABINE";
         TotalMan.setText(totalman);
         
        }else if(man1>=255&&man1<=259)
       {
         String totalman ="18 LAVABOA SA 18 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 13 WC ŠOLJA 13 PISOARA 25 TUŠ KABINE";
         TotalMan.setText(totalman);
         
        }else if(man1>=260&&man1<=269)
       {
         String totalman ="18 LAVABOA SA 18 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 14 WC ŠOLJA 14 PISOARA 26 TUŠ KABINE " ;
         TotalMan.setText(totalman);
         
        }else if(man1>=270&&man1<=279)
       {
         String totalman ="19 LAVABOA SA 19 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 14 WC ŠOLJA 14 PISOARA 27 TUŠ KABINE";
         TotalMan.setText(totalman);
         
        }else if(man1>=280&&man1<=284)
       {
         String totalman ="19 LAVABOA SA 19 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 15 WC ŠOLJA 15 PISOARA 28 TUŠ KABINE";
         TotalMan.setText(totalman);
         
        }else if(man1>=285&&man1<=289)
       {
         String totalman =" 20 LAVABOA SA 20 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 15 WC ŠOLJA 15 PISOARA 28 TUŠ KABINE";
         TotalMan.setText(totalman);
         
        }else if(man1>=290&&man1<=299)
       {
         String totalman ="20 LAVABOA SA 20 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 15 WC ŠOLJA 15 PISOARA 29 TUŠ KABINE";
         TotalMan.setText(totalman);
         
        }else if(man1>=300&&man1<=309)
       {
         String totalman ="21 LAVABOA SA 21 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 16 WC ŠOLJA 16 PISOARA 30 TUŠ KABINE";
         TotalMan.setText(totalman);
         
        }else if(man1>=310&&man1<=314)
       {
         String totalman ="21 LAVABOA SA 21 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 16 WC ŠOLJA 16 PISOARA 31 TUŠ KABINE";
         TotalMan.setText(totalman);
         
        }else if(man1>=315&&man1<=319)
       {
         String totalman ="22 LAVABOA SA 22 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 16 WC ŠOLJA 16 PISOARA 31 TUŠ KABINE";
         TotalMan.setText(totalman);
         
        }else if(man1>=320&&man1<=329)
       {
         String totalman ="22 LAVABOA SA 22 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 17 WC ŠOLJA 17 PISOARA 32 TUŠ KABINE";
         TotalMan.setText(totalman);
         
        }else if(man1>=330&&man1<=339)
       {
         String totalman ="23 LAVABOA SA 23 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 17 WC ŠOLJA 17 PISOARA 33 TUŠ KABINE";
         TotalMan.setText(totalman);
         
        }else if(man1>=340&&man1<=344)
       {
         String totalman ="23 LAVABOA SA 23 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 18 WC ŠOLJA 18 PISOARA 34 TUŠ KABINE";
         TotalMan.setText(totalman);
         
        }else if(man1>=345&&man1<=349)
       {
         String totalman ="24 LAVABOA SA 24 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 18 WC ŠOLJA 18 PISOARA 34 TUŠ KABINE";
         TotalMan.setText(totalman);
         
        }else if(man1>=350&&man1<=359)
       {
         String totalman ="24 LAVABOA SA 24 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 18 WC ŠOLJA 18 PISOARA 35 TUŠ KABINE";
         TotalMan.setText(totalman);
         
        }else if(man1>=360&&man1<=369)
       {
         String totalman ="25 LAVABOA SA 25 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 19 WC ŠOLJA 19 PISOARA 36 TUŠ KABINE";
         TotalMan.setText(totalman);
         
        }else if(man1>=370&&man1<=374)
       {
         String totalman ="25 LAVABOA SA 25 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 19 WC ŠOLJA 19 PISOARA 37 TUŠ KABINE";
         TotalMan.setText(totalman);
         
        }else if(man1>=375&&man1<=379)
       {
         String totalman ="26 LAVABOA SA 26 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 19 WC ŠOLJA 19 PISOARA 37 TUŠ KABINE";
         TotalMan.setText(totalman);
         
        }else if(man1>=380&&man1<=389)
       {
         String totalman ="26 LAVABOA SA 26 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 20 WC ŠOLJA 20 PISOARA 38 TUŠ KABINE";
         TotalMan.setText(totalman);
         
        }else if(man1>=390&&man1<=399)
       {
         String totalman ="27 LAVABOA SA 27 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 20 WC ŠOLJA 20 PISOARA 39 TUŠ KABINE";
         TotalMan.setText(totalman);
         
        }else if(man1>=400&&man1<=404)
       {
         String totalman ="27 LAVABOA SA 27 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 21 WC ŠOLJA 21 PISOARA 40 TUŠ KABINE";
         TotalMan.setText(totalman);
         
        }else if(man1>=405&&man1<=409)
       {
         String totalman ="28 LAVABOA SA 28 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 21 WC ŠOLJA 21 PISOARA 40 TUŠ KABINE";
         TotalMan.setText(totalman);
         
        }else if(man1>=410&&man1<=419)
       {
         String totalman ="28 LAVABOA SA 28 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 21 WC ŠOLJA 21 PISOARA 41 TUŠ KABINE";
         TotalMan.setText(totalman);
         
        }else if(man1>=420&&man1<=429)
       {
         String totalman ="29 LAVABOA SA 29 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 22 WC ŠOLJA 22 PISOARA 42 TUŠ KABINE";
         TotalMan.setText(totalman);
         
        }else if(man1>=430&&man1<=434)
       {
         String totalman ="29 LAVABOA SA 29 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 22 WC ŠOLJA 22 PISOARA 43 TUŠ KABINE";
         TotalMan.setText(totalman);
         
        }else if(man1>=435&&man1<=439)
       {
         String totalman ="30 LAVABOA SA 30 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 22 WC ŠOLJA 22 PISOARA 43 TUŠ KABINE";
         TotalMan.setText(totalman);
         
        }else if(man1>=440&&man1<=449)
       {
         String totalman ="30 LAVABOA SA 30 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 23 WC ŠOLJA 23 PISOARA 44 TUŠ KABINE";
         TotalMan.setText(totalman);
         
        }else if(man1>=450&&man1<=459)
       {
         String totalman ="31 LAVABOA SA 31 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 23 WC ŠOLJA 23 PISOARA 45 TUŠ KABINE";
         TotalMan.setText(totalman);
         
        }else if(man1>=460&&man1<=464)
       {
         String totalman ="31 LAVABOA SA 31 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 24 WC ŠOLJA 24 PISOARA 46 TUŠ KABINE";
         TotalMan.setText(totalman);
         
        }else if(man1>=465&&man1<=469)
       {
         String totalman ="32 LAVABOA SA 32 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 24 WC ŠOLJA 24 PISOARA 46 TUŠ KABINE";
         TotalMan.setText(totalman);
         
        }else if(man1>=470&&man1<=479)
       {
         String totalman ="32 LAVABOA SA 32 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 24 WC ŠOLJA 24 PISOARA 47 TUŠ KABINE";
         TotalMan.setText(totalman);
         
        }else if(man1>=480&&man1<=489)
       {
         String totalman ="33 LAVABOA SA 33 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 25 WC ŠOLJA 25 PISOARA 48 TUŠ KABINE";
         TotalMan.setText(totalman);
         
        }else if(man1>=490&&man1<=494)
       {
         String totalman ="33 LAVABOA SA 33 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 25 WC ŠOLJA 25 PISOARA 49 TUŠ KABINE";
         TotalMan.setText(totalman);
         
        }else if(man1>=495&&man1<=499)
       {
         String totalman ="34 LAVABOA SA 34 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 25 WC ŠOLJA 25 PISOARA 49 TUŠ KABINE";
         TotalMan.setText(totalman);
         
        }else if(man1>=500&&man1<=509)
       {
         String totalman ="34 LAVABOA SA 34 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 26 WC ŠOLJA 26 PISOARA 50 TUŠ KABINA";
         TotalMan.setText(totalman);
        }                                                                                                                                                           
                                                                                                                                                                  
        else
       {
         String totalman ="Greška, podaci nisu dostupni za ovaj broj zaposlenih!";
         TotalMan.setText(totalman);
       }  
         
         
          if( women1 >=1&&women1<=9){
         String totalwomen ="1 LAVABO SA DRŽAČEM ZA PAPIR(SUŠAČ ZA RUKE) 1 WC ŠOLJA";
         TotalWomen.setText(totalwomen); 
         
     }   else if( women1 >=10&&women1 <=14){
         String totalwomen ="1 LAVABO SA 1 DRŽAČEM ZA PAPIR(SUŠAČ ZA RUKE) 1 WC ŠOLJA 1 TUŠ KABINA ";
         TotalWomen.setText(totalwomen);  
         
     } else if( women1 >=15&&women1 <=19){
         String totalwomen ="2 LAVABOA SA 2 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 1 WC ŠOLJA  1 TUŠ KABINA";
         TotalWomen.setText(totalwomen);    
     }
         else if(women1>=20&&women1<=29)
       {
         String totalwomen="2 LAVABOA SA 2 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 2 WC ŠOLJE  2 TUŠ KABINE ";
          TotalWomen.setText(totalwomen);
         
      } else if(women1>=30&&women1 <=39)
       {
          String totalwomen ="3 LAVABOA SA 3 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 2 WC ŠOLJE 3 TUŠ KABINE";
          TotalWomen.setText(totalwomen);
        }  
         else if(women1>=40&&women1<=44)
       {
         String totalwomen ="3 LAVABOA SA 3 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 3 WC ŠOLJE  4 TUŠ KABINE ";
         TotalWomen.setText(totalwomen);
        } 
          else if(women1 >=45&&women1 <=49)
       {
          String totalwomen ="4 LAVABOA SA 4 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 3 WC ŠOLJE 4 TUŠ KABINE ";
          TotalWomen.setText(totalwomen);
          
       }else if(women1>=50&&women1<=59)
       {
          String totalwomen ="4 LAVABOA SA 4 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 3 WC ŠOLJE  5 TUŠ KABINA 1 BIDE ";
          TotalWomen.setText(totalwomen);
       }  
         else if(women1>=60&&women1<=69)
       {
         String totalwomen =" 5 LAVABOA SA 5 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 4 WC ŠOLJE  6 TUŠ KABINA  1 BIDE ";
         TotalWomen.setText(totalwomen);
         
          
       }else if(women1>=70&&women1<=74)
       {
         String totalwomen ="5 LAVABOA SA 5 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 4 WC ŠOLJE  7 TUŠ KABINA 1 BIDE";
         TotalWomen.setText(totalwomen);
         
       }
         
         else if(women1>=75&&women1<=79)
       {
         String totalwomen ="6 LAVABOA SA 6 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 4 WC ŠOLJE  7 TUŠ KABINA 1 BIDE";
         TotalWomen.setText(totalwomen);
         
       } else if(women1>=80&&women1<=89)
       {
         String totalwomen ="6 LAVABOA SA 6 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 5 WC ŠOLJA  8 TUŠ KABINA 1 BIDE";
         TotalWomen.setText(totalwomen);
         
       }  else if(women1>=90&&women1<=99)
       {
         String totalwomen ="7 LAVABOA SA 7 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 5 WC ŠOLJA  9 TUŠ KABINA 1 BIDE";
         TotalWomen.setText(totalwomen);
         
       } else if(women1>=100&&women1<=104)
       {
         String totalwomen ="7 LAVABOA SA 7 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 6 WC ŠOLJA  10 TUŠ KABINA 2 BIDEA";
         TotalWomen.setText(totalwomen);
         
       } else if(women1>=105&&women1<=109)
       {
         String totalwomen ="8 LAVABOA SA 8 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 6 WC ŠOLJA  10 TUŠ KABINA  2 BIDEA";
         TotalWomen.setText(totalwomen);
         
       }
       else if(women1>=110&&women1<=119)
       {
         String totalwomen ="8 LAVABOA SA 8 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 6 WC ŠOLJA  11 TUŠ KABINA 2 BIDEA ";
         TotalWomen.setText(totalwomen);
         
       } else if(women1>=120&&women1<=129)
       {
         String totalwomen ="9 LAVABOA SA 9 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 7 WC ŠOLJA 12 TUŠ KABINA 2 BIDEA ";
         TotalWomen.setText(totalwomen);
         
       } else if(women1>=130&&women1<=134)
       {
         String totalwomen ="9 LAVABOA SA 9 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 7 WC ŠOLJA  13 TUŠ KABINA 2 BIDEA";
         TotalWomen.setText(totalwomen);
         
       } else if(women1>=135&&women1<=139)
       {
         String totalwomen ="10 LAVABOA SA 10 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 7 WC ŠOLJA  13 TUŠ KABINA 2 BIDEA";
         TotalWomen.setText(totalwomen);
         
       } else if(women1>=140&&women1<=149)
       {
         String totalwomen ="10 LAVABOA SA 10 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 8 WC ŠOLJA  14 TUŠ KABINA 2 BIDEA";
         TotalWomen.setText(totalwomen); 
         
       } else if(women1>=150&&women1<=159)
       {
         String totalwomen ="11 LAVABOA SA 11 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 8 WC ŠOLJA  15 TUŠ KABINA 3 BIDEA";
         TotalWomen.setText(totalwomen);
         
       } else if(women1>=160&&women1<=164)
       {
         String totalwomen ="11 LAVABOA SA 11 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 9 WC ŠOLJA  16 TUŠ KABINA 3 BIDEA";
         TotalWomen.setText(totalwomen);
         
       } else if(women1>=165&&women1<=169)
       {
         String totalwomen ="12 LAVABOA SA 12 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 9 WC ŠOLJA  16 TUŠ KABINA 3 BIDEA";
         TotalWomen.setText(totalwomen);
         
       } else if(women1>=170&&women1<=179)
       {
         String totalwomen ="12 LAVABOA SA 12 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 9 WC ŠOLJA  17 TUŠ KABINA 3 BIDEA";
         TotalWomen.setText(totalwomen);
         
       }  else if(women1>=180&&women1<=189)
       {
         String totalwomen ="13 LAVABOA SA 13 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 10 WC ŠOLJA  18 TUŠ KABINA 3 BIDEA";
         TotalWomen.setText(totalwomen);
         
       } else if(women1>=190&&women1<=194)
       {
         String totalwomen ="13 LAVABOA SA 13 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 10 WC ŠOLJA  19 TUŠ KABINA 3 BIDEA ";
         TotalWomen.setText(totalwomen);
         
        }else if(women1>=195&&women1<=199)
       {
         String totalwomen ="14 LAVABOA SA 14 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 10 WC ŠOLJA  19 TUŠ KABINA 3 BIDEA";
         TotalWomen.setText(totalwomen);
         
        }else if(women1>=200&&women1<=209)
       {
         String totalwomen ="14 LAVABOA SA 14 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 11 WC ŠOLJA 20 TUŠ KABINA 4 BIDEA";
         TotalWomen.setText(totalwomen);
         
        }else if(women1>=210&&women1<=219)
       {
         String totalwomen ="15 LAVABOA SA 15 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 11 WC ŠOLJA 21 TUŠ KABINA 4 BIDEA";
         TotalWomen.setText(totalwomen);
         
        }else if(women1>=220&&women1<=224)
       {
         String totalwomen ="15 LAVABOA SA 15 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 12 WC ŠOLJA  22 TUŠ KABINE 4 BIDEA";
         TotalWomen.setText(totalwomen);
         
        }else if(women1>=225&&women1<=229)
       {
         String totalwomen ="16 LAVABOA SA 16 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 12 WC ŠOLJA 22 TUŠ KABINE 4 BIDEA";
         TotalWomen.setText(totalwomen);
         
        }else if(women1>=230&&women1<=239)
       {
         String totalwomen="16 LAVABOA SA 16 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 12 WC ŠOLJA 23 TUŠ KABINE 4 BIDEA";
         TotalWomen.setText(totalwomen);
         
        }else if(women1>=240&&women1<=249)
       {
         String totalwomen ="17 LAVABOA SA 17 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 13 WC ŠOLJA  24 TUŠ KABINE 4 BIDEA";
         TotalWomen.setText(totalwomen);
         
        }else if(women1>=250&&women1<=254)
       {
         String totalwomen ="17 LAVABOA SA 17 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 13 WC ŠOLJA  25 TUŠ KABINE 5 BIDEA";
         TotalWomen.setText(totalwomen);
         
        }else if(women1>=255&&women1<=259)
       {
         String totalwomen ="18 LAVABOA SA 18 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 13 WC ŠOLJA 25 TUŠ KABINE 5 BIDEA";
         TotalWomen.setText(totalwomen);
         
        }else if(women1>=260&&women1<=269)
       {
         String totalwomen ="18 LAVABOA SA 18 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 14 WC ŠOLJA 26 TUŠ KABINE 5 BIDEA " ;
         TotalWomen.setText(totalwomen);
         
        }else if(women1>=270&&women1<=279)
       {
         String totalwomen ="19 LAVABOA SA 19 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 14 WC ŠOLJA 27 TUŠ KABINE 5 BIDEA";
         TotalWomen.setText(totalwomen);
         
        }else if(women1>=280&&women1<=284)
       {
         String totalwomen ="19 LAVABOA SA 19 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 15 WC ŠOLJA  28 TUŠ KABINE 5 BIDEA";
         TotalWomen.setText(totalwomen);
         
        }else if(women1>=285&&women1<=289)
       {
         String totalwomen =" 20 LAVABOA SA 20 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 15 WC ŠOLJA 28 TUŠ KABINE 5 BIDEA";
         TotalWomen.setText(totalwomen);
         
        }else if(women1>=290&&women1<=299)
       {
         String totalwomen ="20 LAVABOA SA 20 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 15 WC ŠOLJA 29 TUŠ KABINE 5 BIDEA";
         TotalWomen.setText(totalwomen);
         
        }else if(women1>=300&&women1<=309)
       {
         String totalwomen ="21 LAVABOA SA 21 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 16 WC ŠOLJA 30 TUŠ KABINE 6 BIDEA";
         TotalWomen.setText(totalwomen);
         
        }else if(women1>=310&&women1<=314)
       {
         String totalwomen ="21 LAVABOA SA 21 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 16 WC ŠOLJA 31 TUŠ KABINE 6 BIDEA";
         TotalWomen.setText(totalwomen);
         
        }else if(women1>=315&&women1<=319)
       {
         String totalwomen ="22 LAVABOA SA 22 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 16 WC ŠOLJA  31 TUŠ KABINE 6 BIDEA";
         TotalWomen.setText(totalwomen);
         
        }else if(women1>=320&&women1<=329)
       {
         String totalwomen ="22 LAVABOA SA 22 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 17 WC ŠOLJA 32 TUŠ KABINE 6 BIDEA";
         TotalWomen.setText(totalwomen);
         
        }else if(women1>=330&&women1<=339)
       {
         String totalwomen ="23 LAVABOA SA 23 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 17 WC ŠOLJA  33 TUŠ KABINE 6 BIDEA";
         TotalWomen.setText(totalwomen);
         
        }else if(women1>=340&&women1<=344)
       {
         String totalwomen ="23 LAVABOA SA 23 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 18 WC ŠOLJA  34 TUŠ KABINE 6 BIDEA";
         TotalWomen.setText(totalwomen);
         
        }else if(women1>=345&&women1<=349)
       {
         String totalwomen ="24 LAVABOA SA 24 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 18 WC ŠOLJA  34 TUŠ KABINE 6 BIDEA";
         TotalWomen.setText(totalwomen);
         
        }else if(women1>=350&&women1<=359)
       {
         String totalwomen ="24 LAVABOA SA 24 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 18 WC ŠOLJA  35 TUŠ KABINE 7 BIDEA";
         TotalWomen.setText(totalwomen);
         
        }else if(women1>=360&&women1<=369)
       {
         String totalwomen ="25 LAVABOA SA 25 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 19 WC ŠOLJA 36 TUŠ KABINE 7 BIDEA";
         TotalWomen.setText(totalwomen);
         
        }else if(women1>=370&&women1<=374)
       {
         String totalwomen ="25 LAVABOA SA 25 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 19 WC ŠOLJA 37 TUŠ KABINE 7 BIDEA";
         TotalWomen.setText(totalwomen);
         
        }else if(women1>=375&&women1<=379)
       {
         String totalwomen ="26 LAVABOA SA 26 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 19 WC ŠOLJA 37 TUŠ KABINE 7 BIDEA";
         TotalWomen.setText(totalwomen);
         
        }else if(women1>=380&&women1<=389)
       {
         String totalwomen ="26 LAVABOA SA 26 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 20 WC ŠOLJA  38 TUŠ KABINE 7 BIDEA";
         TotalWomen.setText(totalwomen);
         
        }else if(women1>=390&&women1<=399)
       {
         String totalwomen ="27 LAVABOA SA 27 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 20 WC ŠOLJA 39 TUŠ KABINE 7 BIDEA";
         TotalWomen.setText(totalwomen);
         
        }else if(women1>=400&&women1<=404)
       {
         String totalwomen ="27 LAVABOA SA 27 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 21 WC ŠOLJA 40 TUŠ KABINE 8 BIDEA";
         TotalWomen.setText(totalwomen);
         
        }else if(women1>=405&&women1<=409)
       {
         String totalwomen ="28 LAVABOA SA 28 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 21 WC ŠOLJA 40 TUŠ KABINE 8 BIDEA";
         TotalWomen.setText(totalwomen);
         
        }else if(women1>=410&&women1<=419)
       {
         String totalwomen ="28 LAVABOA SA 28 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 21 WC ŠOLJA  41 TUŠ KABINE 8 BIDEA";
         TotalWomen.setText(totalwomen);
         
        }else if(women1>=420&&women1<=429)
       {
         String totalwomen ="29 LAVABOA SA 29 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 22 WC ŠOLJA  42 TUŠ KABINE 8 BIDEA";
         TotalWomen.setText(totalwomen);
         
        }else if(women1>=430&&women1<=434)
       {
         String totalwomen ="29 LAVABOA SA 29 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 22 WC ŠOLJA  43 TUŠ KABINE 8 BIDEA";
         TotalWomen.setText(totalwomen);
         
        }else if(women1>=435&&women1<=439)
       {
         String totalwomen ="30 LAVABOA SA 30 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 22 WC ŠOLJA 43 TUŠ KABINE 8 BIDEA";
         TotalWomen.setText(totalwomen);
         
        }else if(women1>=440&&women1<=449)
       {
         String totalwomen ="30 LAVABOA SA 30 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 23 WC ŠOLJA 44 TUŠ KABINE 8 BIDEA";
         TotalWomen.setText(totalwomen);
         
        }else if(women1>=450&&women1<=459)
       {
         String totalwomen ="31 LAVABOA SA 31 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 23 WC ŠOLJA 45 TUŠ KABINE 9 BIDEA";
         TotalWomen.setText(totalwomen);
         
        }else if(women1>=460&&women1<=464)
       {
         String totalwomen ="31 LAVABOA SA 31 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 24 WC ŠOLJA 46 TUŠ KABINE 9 BIDEA";
         TotalWomen.setText(totalwomen);
         
        }else if(women1>=465&&women1<=469)
       {
         String totalwomen ="32 LAVABOA SA 32 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 24 WC ŠOLJA  46 TUŠ KABINE 9 BIDEA";
         TotalWomen.setText(totalwomen);
         
        }else if(women1>=470&&women1<=479)
       {
         String totalwomen ="32 LAVABOA SA 32 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 24 WC ŠOLJA  47 TUŠ KABINE 9 BIDEA";
         TotalWomen.setText(totalwomen);
         
        }else if(women1>=480&&women1<=489)
       {
         String totalwomen ="33 LAVABOA SA 33 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 25 WC ŠOLJA  48 TUŠ KABINE 9 BIDEA";
         TotalWomen.setText(totalwomen);
         
        }else if(women1>=490&&women1<=494)
       {
         String totalwomen ="33 LAVABOA SA 33 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 25 WC ŠOLJA  49 TUŠ KABINE 9 BIDEA";
         TotalWomen.setText(totalwomen);
         
        }else if(women1>=495&&women1<=499)
       {
         String totalwomen ="34 LAVABOA SA 34 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 25 WC ŠOLJA  49 TUŠ KABINE 9 BIDEA";
         TotalWomen.setText(totalwomen);
         
        }else if(women1>=500&&women1<=509)
       {
         String totalwomen ="34 LAVABOA SA 34 DRŽAČA ZA PAPIR(SUŠAČ ZA RUKE) 26 WC ŠOLJA 50 TUŠ KABINA 10 BIDEA";
         TotalWomen.setText(totalwomen);
        }                                                                                                                                                           
                                                                                                                                                                  
        else
       {
         String totalwomen ="Greška, podaci nisu dostupni za ovaj broj zaposlenih!";
         TotalWomen.setText(totalwomen);
       }  
         
         
         
         } 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Man = new javax.swing.JTextField();
        Women = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TotalMan = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TotalWomen = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(250, 250));
        setSize(new java.awt.Dimension(500, 250));

        jLabel1.setText("Unesite broj zaposlenih muškaraca");

        jLabel2.setText("Unesite broj zaposlenih žena");

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel3.setText("Sanitarni kalkulator");

        jButton1.setText("EXIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("IZRAČUNAJ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        Man.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManActionPerformed(evt);
            }
        });

        Women.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WomenActionPerformed(evt);
            }
        });

        jLabel4.setText("MUŠKARCI");

        TotalMan.setEditable(false);
        TotalMan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalManActionPerformed(evt);
            }
        });

        jLabel5.setText("ŽENE");

        TotalWomen.setEditable(false);
        TotalWomen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalWomenActionPerformed(evt);
            }
        });

        jLabel6.setText("LugalJoshua");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Man, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Women, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addGap(38, 38, 38)
                                .addComponent(jButton2))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(TotalWomen))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(TotalMan, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(44, 44, 44)
                        .addComponent(jLabel6)
                        .addGap(34, 34, 34))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(280, 280, 280))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel3)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Man, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Women, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TotalMan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TotalWomen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
     
    private void ManActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManActionPerformed
    
    }//GEN-LAST:event_ManActionPerformed

    private void WomenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WomenActionPerformed
       
    }//GEN-LAST:event_WomenActionPerformed

    private void TotalManActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalManActionPerformed

    }//GEN-LAST:event_TotalManActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      sanitarni_kalkulator();     
    }//GEN-LAST:event_jButton2ActionPerformed

    private void TotalWomenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalWomenActionPerformed
             
    }//GEN-LAST:event_TotalWomenActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new NewJFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Man;
    private javax.swing.JTextField TotalMan;
    private javax.swing.JTextField TotalWomen;
    private javax.swing.JTextField Women;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
