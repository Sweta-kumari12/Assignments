package Assignment2;

import java.util.ArrayList;


class CurrentAccount extends Assignment2Q3 {
    int totalDeposits = 10000;
    int creditLimit = 2000;
   	@Override
    public int getCash() {
    	return totalDeposits+creditLimit;
    }
}
class SavingsAccount extends Assignment2Q3 {
    int totalDeposits = 10000;
    int fixedDepositAmount = 5000;
    	@Override
    public int getCash() {
		return totalDeposits+fixedDepositAmount;
	}
}

public class Assignment2Q3 {

	public int totalCashInBank(ArrayList<Integer> accounts){
		int total=0;
		for(int account: accounts) {
			total=total+account;
			
		}
		return total;
		
	}
    public int getCash(){
    	return 0;
    }
    public static void main(String[] args) {
    	ArrayList<Integer>accounts=new ArrayList<>();
    	Assignment2Q3 obj1=new CurrentAccount();
    	Assignment2Q3 obj2=new SavingsAccount();
    	accounts.add(obj1.getCash());
    	accounts.add( obj2.getCash());
    	Assignment2Q3 bank = new Assignment2Q3();
    	int total_cash=bank.totalCashInBank(accounts);
    	System.out.println("Total cash in bank"+total_cash);
    }
	
	

}
