package day12;

public class AccountMain {

	public static void main(String[] args) {
		
		Account acc=new Account();
		
		acc.setAccno(101);
		acc.setName("kareem");
		acc.setAmount(50000);
		System.out.println(acc.getAccno());	
		System.out.println(acc.getName());	
		System.out.println(acc.getAmount());	
		
	}

}
