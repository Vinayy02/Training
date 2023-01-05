package inhertance;

import java.util.Scanner;
public class bankbranch extends bnk
{  
    String name;
    int ID;
    long Phone;
     float loanAmount;
     private float branchInterest;

    
  

    public bankbranch(long bankTotalFund, float bankInterest, String name, int iD, long phone, float loanAmount, int branchInterest) 
    {
        super(bankTotalFund, bankInterest);
        this.name = name;
        ID = iD;
        Phone = phone;
        this.loanAmount = loanAmount;
        this.branchInterest = branchInterest;
    }

    void Loan()
     {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Amount Of Loan to  approved ");
         int amount= sc.nextInt(); 
        float b= checkLoan(amount);
        if(b == -1)
        {   
            System.out.println("Not approved");    

        }
        else
        {
            System.out.println("Loan is approved");
            
            System.out.println(name);
            System.out.println("intrest "+(b+branchInterest));
        }

         
     }
     
 public static  void main(String[]args)
 {  

    bankbranch B1= new bankbranch(50000 , 3, "Axis", 105, 98989758, 5000, 7);

    B1.Loan();

 }
}