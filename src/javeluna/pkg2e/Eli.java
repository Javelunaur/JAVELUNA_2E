package javeluna.pkg2e;
public class Eli {
    
        int id;
        String name;
        double mnth, cred, loan;
        
    public void add(int lid, String nm, double month, double credit, double loans){
        this.id = lid;
        this.name= nm; 
        this.mnth=month;
        this.cred=credit;
        this.loan=loans;             
    }
    
    public void view(){
        
       System.out.printf("%-10S %-10s %-10s    %-10s    %-10s    %-10s\n",
               "ID", "NAME", "MONTHLY INCOME", "CREDIT SCORES", "EXISTING LOANS", "STATUS");
       
       System.out.printf("%-10d %-10s %-10.2f    %-10.2f    %-10.2f\n",
               this.id, this.name, this.mnth, this.cred, this.loan);
        
    }
}
