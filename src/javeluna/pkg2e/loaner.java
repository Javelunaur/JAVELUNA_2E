package javeluna.pkg2e;
import java.util.*;
public class loaner {
    
    public void getLoan(){
      Scanner n = new Scanner (System.in);
      
      Eli[] el = new Eli[100];
      
        System.out.println("Enter number of Applications:  ");
        int num=n.nextInt();
        
         for (int i = 0;i < num; i++){
            System.out.println("\nEnter details of Application "+(i+1));
           System.out.println("ID: ");
            int id = n.nextInt();
            System.out.println("Name: ");
            String name= n.next();
            System.out.println("Monthly Income: ");
            double mnth = n.nextDouble();
              if (mnth < 30000){
                String app = "Denied";
              }else{
                String app = "Accepted";
              }
            System.out.println("Credit Scores: ");
            double score = n.nextDouble();
             if ( score < 650){
                 String app = "Denied";
             }else{
                String app = "Accepted";
              }
             
            System.out.println("Existing Loans: ");
            double exist = n.nextDouble();
            if (exist > 500000){
                String app = "Denied";
              }else{
                String app = "Accepted";
              }
            
            el[i] = new Eli();
            el[i].add(id, name, mnth, score, exist);
    }
    
    for (int i = 0;i < num; i++){
        el[i].view();
    }
}
}


//        double tpg = 0;
//        for(int i = 0; i < np; i++){
//        tpg = tpg + (pr[i].price * pr[i].sold);
//        pr[i].viewProducts();
//    }
//        
//        for (int i=0; i < np; i++){
//            pr[i].viewProducts();
//        }
