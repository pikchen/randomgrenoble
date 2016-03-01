import java.util.*;
public class french
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String choice = "";
		ArrayList<String> numbers = getNumbers();
		ArrayList<String> months = getMonths();
		ArrayList<String> days = getDays();
		while(!choice.equalsIgnoreCase("quit")){
			System.out.println("Select the course you would like to practice:");
			System.out.println("1. Numbers");
			System.out.println("2. Days");
			System.out.println("3. Months");
			System.out.println("0. Random from Any Category");
			System.out.print("Choice: ");
			choice = sc.nextLine();
			if(choice==null){
				System.out.println("Please enter a correct choice [1, 2, 3, or 4");
			}else if("".equals(choice)){
				System.out.println("Please enter a correct choice [1, 2, 3, or 4]");
			}else if("1".equals(choice)){
				numbers(sc,numbers,false);
			}else if("2".equals(choice)){
				days(sc,days,false);
			}else if("3".equals(choice)){
				months(sc,months,false);
			}else if("0".equals(choice)){
				randCat(sc, numbers, days, months);
			}
		}
		
		//closes and clears all data before quitting
		sc.close();
		numbers.clear();
		days.clear();
		months.clear();
	}

	public static void randCat(
		Scanner sc,
		ArrayList<String> numbers,
		ArrayList<String> days,
		ArrayList<String> months
	){
		boolean doQuitRandom = false;
		Random dice = new Random();
		while(!doQuitRandom){
			int rand = dice.nextInt(9);
			if (rand < 2){
				doQuitRandom = days(sc,days,true);
			}else if (rand < 6){
				doQuitRandom = months(sc,months,true);
			}else doQuitRandom = numbers(sc,numbers,true);
		}
		System.out.println("");
	}
	
	/**
	 * @return whether or not to 'quit' was issued
	 */
	public static boolean numbers(
		Scanner sc,
		ArrayList<String> list,
		boolean isRandomCategories
	){
		Random dice = new Random();
		String answer = "";
		int rand = 0;

		while(!answer.trim().equalsIgnoreCase("QUIT")){
			rand = dice.nextInt(101);
			System.out.println("What is " + rand + " in French? [omit dashes]");
			answer = sc.nextLine();			
			if(answer==null){
			System.out.println("Please try again.");
			}
			if(answer!=null && answer.equalsIgnoreCase("QUIT")){
				if (isRandomCategories) return true;
			}else{
				while(!answer.trim().equals(list.get(rand)))
				{
					if(answer.trim().equalsIgnoreCase("QUIT")) return true;
					System.out.println("Wrong! Please try again: ");
					answer = sc.nextLine();
				}
			}
			if(answer.trim().equals(list.get(rand))) System.out.println("You got it right!");
			System.out.println("");
			if(isRandomCategories) return false;
			rand = dice.nextInt(101);
		}
		return true;
	}
	
	/**
	 * @return whether or not to 'quit' was issued
	 */
	public static boolean days(
		Scanner sc,
		ArrayList<String> list,
		boolean isRandomCategories
	){
		Random dice = new Random();
		String answer = "";
		int rand = 0;
			
		while(!answer.trim().equalsIgnoreCase("QUIT")){
			rand = dice.nextInt(7);
			String day = "";
			if(rand==0){
				day = "Monday";
			}else if(rand==1){
				day = "Tuesday";
			}else if(rand==2){
				day = "Wednesday";
			}else if(rand==3){
				day = "Thursday";
			}else if(rand==4){
				day = "Friday";
			}else if(rand==5){
				day = "Saturday";
			}else if(rand==6){
				day = "Sunday";
			}
			System.out.println("What is " + day + " in French?");
			answer = sc.nextLine();
			if(answer==null){
				System.out.println("Please try again.");
			}
			if(answer!=null && answer.equalsIgnoreCase("QUIT")){
				if (isRandomCategories) return true;
			}else{
				while(!answer.trim().equalsIgnoreCase((String)list.get(rand)))
				{
					if(answer.trim().equalsIgnoreCase("QUIT")) return true;
					System.out.println("Wrong! Please try again: ");
					answer = sc.nextLine();
				}
			}
			if(answer.trim().equalsIgnoreCase((String)list.get(rand)))System.out.println("You got it right!");
			System.out.println("");
			if(isRandomCategories) return false;
		}
		return true;
	}
	
	/**
	 * @return whether or not to 'quit' was issued
	 */
	public static boolean months(
		Scanner sc,
		ArrayList<String> list,
		boolean isRandomCategories
	){
		Random dice = new Random();
		String answer = "";
		int rand = 0;
			
		while(!answer.trim().equalsIgnoreCase("QUIT")){
			rand = dice.nextInt(12);
			String month = "";
			if(rand==0){
				month = "January";
			}else if(rand==1){
				month = "February";
			}else if(rand==2){
				month = "March";
			}else if(rand==3){
				month = "April";
			}else if(rand==4){
				month = "May";
			}else if(rand==5){
				month = "June";
			}else if(rand==6){
				month = "July";
			}else if(rand==7){
				month = "August";
			}else if(rand==8){
				month = "September";
			}else if(rand==9){
				month = "October";
			}else if(rand==10){
				month = "November";
			}else if(rand==11){
				month = "December";
			}
			System.out.println("What is " + month + " in French?");
			answer = sc.nextLine();
			if(answer==null){
				System.out.println("Please try again.");
			}
			if(answer!=null && answer.equalsIgnoreCase("QUIT")){
				if (isRandomCategories) return true;
			}else{
				while(!answer.trim().equalsIgnoreCase((String)list.get(rand)))
				{
					if(answer.trim().equalsIgnoreCase("QUIT")) return true;
					System.out.println("Wrong! Please try again: ");
					answer = sc.nextLine();
				}
				if(answer.trim().equalsIgnoreCase((String)list.get(rand))) System.out.println("You got it right!");
				System.out.println("");
				if(isRandomCategories) return false;
			}
		}
		return true;
	}
	
	public static ArrayList<String> getNumbers()
	{
		ArrayList<String> list = new ArrayList<String>();
		list.add("zero");
		list.add("un");
		list.add("deux");
		list.add("trois");
		list.add("quatre");
		list.add("cinq");
		list.add("six");
		list.add("sept");
		list.add("huit");
		list.add("neuf");
		list.add("dix");
		list.add("onze");
		list.add("douze");
		list.add("treize");
		list.add("quatorze");
		list.add("quinze");
		list.add("seize");
		list.add("dix sept");
		list.add("dix huit");
		list.add("dix neuf");
		list.add("vingt");
		list.add("vingt et un");
		list.add("vingt deux");
		list.add("vingt trois");
		list.add("vingt quatre");
		list.add("vingt cinq");
		list.add("vingt six");
		list.add("vingt sept");
		list.add("vingt huit");
		list.add("vingt neuf");
		list.add("trente");
		list.add("trente et un");
		list.add("trente deux");
		list.add("trente trois");
		list.add("trente quatre");
		list.add("trente cinq");
		list.add("trente six");
		list.add("trente sept");
		list.add("trente huit");
		list.add("trente neuf");
		list.add("quarante");
		list.add("quarante et un");
		list.add("quarante deux");
		list.add("quarante trois");
		list.add("quarante quatre");
		list.add("quarante cinq");
		list.add("quarante six");
		list.add("quarante sept");
		list.add("quarante huit");
		list.add("quarante neuf");
		list.add("cinquante");
		list.add("cinquante et un");
		list.add("cinquante deux");
		list.add("cinquante trois");
		list.add("cinquante quatre");
		list.add("cinquante cinq");
		list.add("cinquante six");
		list.add("cinquante sept");
		list.add("cinquante huit");
		list.add("cinquante neuf");
		list.add("soixante");
		list.add("soixante et un");
		list.add("soixante deux");
		list.add("soixante trois");
		list.add("soixante quatre");
		list.add("soixante cinq");
		list.add("soixante six");
		list.add("soixante sept");
		list.add("soixante huit");
		list.add("soixante neuf");
		list.add("soixante dix");
		list.add("soixante et onze");
		list.add("soixante douze");
		list.add("soixante treize");
		list.add("soixante quatorze");
		list.add("soixante quinze");
		list.add("soixante seize");
		list.add("soixante dix sept");
		list.add("soixante dix huit");
		list.add("soixante dix neuf");
		list.add("quatre vingt");
		list.add("quatre vingt un");
		list.add("quatre vingt deux");
		list.add("quatre vingt trois");
		list.add("quatre vingt quatre");
		list.add("quatre vingt cinq");
		list.add("quatre vingt six");
		list.add("quatre vingt sept");
		list.add("quatre vingt huit");
		list.add("quatre vingt neuf");
		list.add("quatre vingt dix");
		list.add("quatre vingt onze");
		list.add("quatre vingt douze");
		list.add("quatre vingt treize");
		list.add("quatre vingt quatorze");
		list.add("quatre vingt quinze");
		list.add("quatre vingt seize");
		list.add("quatre vingt dix sept");
		list.add("quatre vingt dix huit");
		list.add("quatre vingt dix neuf");
		list.add("cent");
		return list;
	}
	
	public static ArrayList<String> getMonths()
	{
		ArrayList<String> list = new ArrayList<String>();
		list.add("janvier");
		list.add("fevrier");
		list.add("mars");
		list.add("avril");
		list.add("mai");
		list.add("juin");
		list.add("juillet");
		list.add("aout");
		list.add("septembre");
		list.add("octobre");
		list.add("novembre");
		list.add("decembre");
		return list;
		
	}
	
	public static ArrayList<String> getDays()
	{
		ArrayList<String> list = new ArrayList<String>();
		list.add("lundi");
		list.add("mardi");
		list.add("mercredi");
		list.add("jeudi");
		list.add("vendredi");
		list.add("samedi");
		list.add("dimanche");
		return list;
	}

	public static ArrayList<String> getEtre()
	{
		ArrayList<String> list = new ArrayList<String>();
		list.add("suis");
		list.add("es");
		list.add("est");
		list.add("est");
		list.add("sommes");
		list.add("etes");
		list.add("sont");
		return list;
	}
}