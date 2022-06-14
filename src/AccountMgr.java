import com.globalpayex.bank.exceptions.MinBalanceException;
import com.golbalpayex.bank.entities.AccType;
import com.golbalpayex.bank.entities.Account;
import static com.golbalpayex.bank.entities.BankConstants.*;

public class AccountMgr {
	public static void main(String[] args)
	{
		Account a1 = new Account(AccType.SAVINGS,"abc1234",10000.00);
		System.out.println(a1.getDetails());
		/*try {
			System.out.println(a1.withDrawAmount(500000.0));
		} catch (MinBalanceException e) 
		{
			System.out.println(e);
			
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}*/
		/*System.out.println(a1.getAccountDetails());*/
		//System.out.println(a1.depositAmount(583.445));
		//System.out.println(a1.getAccountDetails());
		 
		//System.out.println(a1.getDetails());
		/* Account empty = new Account(AccType.SAVINGS,null,0.0);
		 empty.setAccType(AccType.CURRENT);
		 empty.setAccNumber("Axc154");
		 empty.setAccBalance(1500.0);
		 empty.getDetails()
		 	  .ifPresentOrElse
		 	  (details -> System.out.println(details),
		 	  ()-> System.out.println("Account unitialized"));*/
		 
		 
		
	}

}
