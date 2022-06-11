import com.globalpayex.bank.exceptions.MinBalanceException;
import com.golbalpayex.bank.entities.Account;

public class AccountMgr {
	public static void main(String[] args)
	{
		Account a1 = new Account("Savings","ABC1234",10000.00);
		try {
			System.out.println(a1.withDrawAmount(500000.0));
		} catch (MinBalanceException e) 
		{
			System.out.println(e);
			
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		/*System.out.println(a1.getAccountDetails());*/
		//System.out.println(a1.depositAmount(583.445));
		//System.out.println(a1.getAccountDetails());
	}

}
