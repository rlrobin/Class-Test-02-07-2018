import java.util.Scanner;
public class Instance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phonetest phone1=new Phonetest("IPhone8","Apple",2018, 1200.00);
		Phonetest phone2=new Phonetest("Samsung 3","Android",2014, 180.00);
		Phonetest phone3=new Phonetest("IPhone 5", "Apple", 2012, 130.00);
		
		System.out.println("The first phone is :\n"+phone1.Name+" " +phone1.Brand +" Released in "+ phone1.Released);
		System.out.println("The Second phone is :\n"+phone2.Name+" " +phone2.Brand +" Released in "+ phone2.Released);
		System.out.println("The Third phone is :\n"+phone3.Name+" " +phone3.Brand +" Released in "+ phone3.Released);
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Key in 1, 2 , or 3 for which phone you'd be interested in? ");
		int num = scan.nextInt();
		
		if (num==1)
		{
			System.out.println(phone1.Name +"\n"+phone1.Brand+ "\n"+ "Released in :"+phone1.Released+"\nPricing: "+phone1.Price);
		}
		else if (num==2)
		{
			System.out.println(phone2.Name +"\n"+phone2.Brand+ "\n"+ "Released in :"+phone2.Released+"\nPricing: "+phone2.Price);
		}
		else if (num==3)
		{
			System.out.println(phone3.Name +"\n"+phone3.Brand+ "\n"+ "Released in :"+phone3.Released+"\nPricing: "+phone3.Price);
		}
		else
		{
			System.out.print("Wrong Entry");
		}
	}

}
