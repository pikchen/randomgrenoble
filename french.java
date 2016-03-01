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
	public static boolean runEtre(
		Scanner sc,
		ArrayList<String> etreList,
		boolean isRandomCategories
	){
		return false;
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
			if(rand==0){ //TODO : refactor into a getDay() method
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
			if(rand==0){ //TODO : refactor into a getMonth() method
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
	
	public static ArrayList<String> getNumbersList()
	{
		ArrayList<String> numbersList = new ArrayList<String>();
		numbersList.add("zero");
		numbersList.add("un");
		numbersList.add("deux");
		numbersList.add("trois");
		numbersList.add("quatre");
		numbersList.add("cinq");
		numbersList.add("six");
		numbersList.add("sept");
		numbersList.add("huit");
		numbersList.add("neuf");
		numbersList.add("dix");
		numbersList.add("onze");
		numbersList.add("douze");
		numbersList.add("treize");
		numbersList.add("quatorze");
		numbersList.add("quinze");
		numbersList.add("seize");
		numbersList.add("dix sept");
		numbersList.add("dix huit");
		numbersList.add("dix neuf");
		numbersList.add("vingt");
		numbersList.add("vingt et un");
		numbersList.add("vingt deux");
		numbersList.add("vingt trois");
		numbersList.add("vingt quatre");
		numbersList.add("vingt cinq");
		numbersList.add("vingt six");
		numbersList.add("vingt sept");
		numbersList.add("vingt huit");
		numbersList.add("vingt neuf");
		numbersList.add("trente");
		numbersList.add("trente et un");
		numbersList.add("trente deux");
		numbersList.add("trente trois");
		numbersList.add("trente quatre");
		numbersList.add("trente cinq");
		numbersList.add("trente six");
		numbersList.add("trente sept");
		numbersList.add("trente huit");
		numbersList.add("trente neuf");
		numbersList.add("quarante");
		numbersList.add("quarante et un");
		numbersList.add("quarante deux");
		numbersList.add("quarante trois");
		numbersList.add("quarante quatre");
		numbersList.add("quarante cinq");
		numbersList.add("quarante six");
		numbersList.add("quarante sept");
		numbersList.add("quarante huit");
		numbersList.add("quarante neuf");
		numbersList.add("cinquante");
		numbersList.add("cinquante et un");
		numbersList.add("cinquante deux");
		numbersList.add("cinquante trois");
		numbersList.add("cinquante quatre");
		numbersList.add("cinquante cinq");
		numbersList.add("cinquante six");
		numbersList.add("cinquante sept");
		numbersList.add("cinquante huit");
		numbersList.add("cinquante neuf");
		numbersList.add("soixante");
		numbersList.add("soixante et un");
		numbersList.add("soixante deux");
		numbersList.add("soixante trois");
		numbersList.add("soixante quatre");
		numbersList.add("soixante cinq");
		numbersList.add("soixante six");
		numbersList.add("soixante sept");
		numbersList.add("soixante huit");
		numbersList.add("soixante neuf");
		numbersList.add("soixante dix");
		numbersList.add("soixante et onze");
		numbersList.add("soixante douze");
		numbersList.add("soixante treize");
		numbersList.add("soixante quatorze");
		numbersList.add("soixante quinze");
		numbersList.add("soixante seize");
		numbersList.add("soixante dix sept");
		numbersList.add("soixante dix huit");
		numbersList.add("soixante dix neuf");
		numbersList.add("quatre vingt");
		numbersList.add("quatre vingt un");
		numbersList.add("quatre vingt deux");
		numbersList.add("quatre vingt trois");
		numbersList.add("quatre vingt quatre");
		numbersList.add("quatre vingt cinq");
		numbersList.add("quatre vingt six");
		numbersList.add("quatre vingt sept");
		numbersList.add("quatre vingt huit");
		numbersList.add("quatre vingt neuf");
		numbersList.add("quatre vingt dix");
		numbersList.add("quatre vingt onze");
		numbersList.add("quatre vingt douze");
		numbersList.add("quatre vingt treize");
		numbersList.add("quatre vingt quatorze");
		numbersList.add("quatre vingt quinze");
		numbersList.add("quatre vingt seize");
		numbersList.add("quatre vingt dix sept");
		numbersList.add("quatre vingt dix huit");
		numbersList.add("quatre vingt dix neuf");
		numbersList.add("cent");
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

	public static ArrayList<String> getEtreList()
	{
		ArrayList<String> etreList = new ArrayList<String>();
		etreList.add("suis");
		etreList.add("es");
		etreList.add("est");
		etreList.add("est");
		etreList.add("sommes");
		etreList.add("etes");
		etreList.add("sont");
		etreList.add("sont");
		return etreList;
	}
}