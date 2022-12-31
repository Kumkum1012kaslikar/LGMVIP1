import java.util.*;
import java.text.DecimalFormat;
 
public class CurrecyConvertor
{
   public static void main(String[] args)
   {
      double amount;
      double rupee, dollar, pound, euro, yen, ringgit;
      int choice;
 
      DecimalFormat f = new DecimalFormat("##.##");
 
      Scanner sc = new Scanner(System.in);
      while(true)
      {
      System.out.println("                                           WELCOME TO CURRENCY CONVERTOR");
            System.out.println("                                           *****************************");
            System.out.println("");
            System.out.println("                                             --------------------------");
            System.out.println("                                             | 1. RUPEE               |");
            System.out.println("                                             --------------------------");
            System.out.println("                                             | 2. DOLLAR              |");
            System.out.println("                                             --------------------------");
            System.out.println("                                             | 3. POUND               |");
            System.out.println("                                             --------------------------");
            System.out.println("                                             | 4. EURO                |");
            System.out.println("                                             --------------------------");
            System.out.println("                                             | 5. YEN                 |");
            System.out.println("                                             --------------------------");
            System.out.println("                                             | 6. RINGGGIT            |");
            System.out.println("                                             --------------------------");
            System.out.println("                                             | 7. EXIT                |");
            System.out.println("                                             --------------------------");
            System.out.println("");
            System.out.println("");
            System.out.println("                                 *******************************************************");
            System.out.println("");
            System.out.println("                                               : ENTER THE OPTION :");
            System.out.println("");
            System.out.println("                                 *******************************************************");
 
      choice = sc.nextInt();
      System.out.println("");
      
      System.out.println("");
      System.out.println("                                          : ENTER THE AMOUNT YOU WANT TO CONVERT :");
      System.out.println("");
      

 
      

      amount = sc.nextFloat();
 
      switch (choice)
      {
         case 1:  // Ruppe Conversion
            dollar = amount / 70;
            System.out.println("                                 *******************************************************");
            System.out.println("                                    "+amount + " Rupee = " + f.format(dollar) + " Dollar");
 
            pound = amount / 88;
            System.out.println("                                    "+amount + " Rupee = " + f.format(pound) + " Pound");
 
            euro = amount / 80;
            System.out.println("                                    "+amount + " Rupee = " + f.format(euro) + " Euro");
 
            yen = amount / 0.63;
            System.out.println("                                    "+amount + " Rupee = " + f.format(yen) + " Yen");
 
            ringgit = amount / 16;
            System.out.println("                                    "+amount + " Rupee = " + f.format(ringgit) + " ringgit");
            System.out.println("                                 *******************************************************");
            break;
 
         case 2:  // Dollar Conversion
            rupee = amount * 70;
            System.out.println("                                 *******************************************************");
            System.out.println("                                     "+amount + " Dollar = " + f.format(rupee) + " Ruppes");
 
            pound = amount *0.78;
            System.out.println("                                     "+amount + " Dollar = " + f.format(pound) + " Pound");
 
            euro = amount *0.87;
            System.out.println("                                     "+amount + " Dollar = " + f.format(euro) + " Euro");
 
            yen = amount *111.087;
            System.out.println("                                     "+amount + " Dollar = " + f.format(yen) + " Yen");
 
            ringgit = amount *4.17;
            System.out.println("                                     "+amount + " Dollar = " + f.format(ringgit) + " ringgit");
            System.out.println("                                 *******************************************************");
            break;
 
         case 3:  // Pound Conversion
            rupee = amount * 88;
            System.out.println("                                 *******************************************************");
            System.out.println("                                     "+amount + " pound = " + f.format(rupee) + " Ruppes");
 
            dollar = amount *1.26;
            System.out.println("                                     "+amount + " pound = " + f.format(dollar) + " Dollar");
 
            euro = amount *1.10;
            System.out.println("                                     "+amount + " pound = " + f.format(euro) + " Euro");
 
            yen = amount *140.93;
            System.out.println("                                     "+amount + " pound = " + f.format(yen) + " Yen");
 
            ringgit = amount *5.29;
            System.out.println("                                     "+amount + " pound = " + f.format(ringgit) + " ringgit");
            System.out.println("                                 *******************************************************");
            break;
 
         case 4:  // Euro Conversion
            rupee = amount * 80;
            System.out.println("                                 *******************************************************");
            System.out.println("                                       "+amount + " euro = " + f.format(rupee) + " Ruppes");
 
            dollar = amount *1.14;
            System.out.println("                                       "+amount + " euro = " + f.format(dollar) + " Dollar");
 
            pound = amount *0.90;
            System.out.println("                                       "+amount + " euro = " + f.format(pound) + " Pound");
 
            yen = amount *127.32;
            System.out.println("                                       "+amount + " euro = " + f.format(yen) + " Yen");
 
            ringgit = amount *4.78;
            System.out.println("                                       "+amount + " euro = " + f.format(ringgit) + " ringgit");
            System.out.println("                                 *******************************************************");
            break;
 
         case 5:  // Yen Conversion
            rupee = amount *0.63;
            System.out.println("                                 *******************************************************");
            System.out.println("                                       "+amount + " yen = " + f.format(rupee) + " Ruppes");
 
            dollar = amount *0.008;
            System.out.println("                                       "+amount + " yen = " + f.format(dollar) + " Dollar");
 
            pound = amount *0.007;
            System.out.println("                                       "+amount + " yen = " + f.format(pound) + " Pound");
 
            euro = amount *0.007;
            System.out.println("                                       "+amount + " yen = " + f.format(euro) + " Euro");
 
            ringgit = amount *0.037;
            System.out.println("                                       "+amount + " yen = " + f.format(ringgit) + " ringgit");
            System.out.println("                                 *******************************************************");
            break;
 
         case 6:  // Ringgit Conversion
            rupee = amount *16.8;
            System.out.println("                                 *******************************************************");
            System.out.println("                                       "+amount + " ringgit = " + f.format(rupee) + " Ruppes");
 
            dollar = amount *0.239;
            System.out.println("                                       "+amount + " ringgit = " + f.format(dollar) + " dollar");
 
            pound = amount *0.188;
            System.out.println("                                       "+amount + " ringgit =: " + f.format(pound) + " pound");
 
            euro = amount *0.209;
            System.out.println("                                       "+amount + " ringgit = " + f.format(euro) + " euro");
 
            yen = amount *26.63;
            System.out.println("                                       "+amount + " ringgit = " + f.format(yen) + " yen");
            System.out.println("                                 *******************************************************");
            break;

            case 7:
            System.exit(0);
            break;
 
          //Default case
         default:
            System.out.println("Invalid Input");
            
      }
   }
}
}