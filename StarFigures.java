public class StarFigures {
	public static void starline() {//Prints star horizontal line
		System.out.println("*****");
		System.out.println("*****");
	}

	public static void starstar() {//Prints star x's
		System.out.println(" * *");
		System.out.println("  *");
		System.out.println(" * *");
	}
	public static void starpole() {//Prints star vertical line
		System.out.println("  *");
		System.out.println("  *");
		System.out.println("  *");
	}
	
	public static void main(String[] args) {//Prints all in order of expectation
		starline();
		starstar();
		System.out.println();
		starline();
		starstar();
		starline();
		System.out.println();
		starpole();
		starline();
		starstar();
		
	}	
		
}


