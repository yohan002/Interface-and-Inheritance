import java.util.Scanner;

public class Main {

	Scanner scan = new Scanner(System.in);
	
	public static void Fail(){
		
		System.out.printf("tidak bisa melakukan hal ini");
		System.out.println("");
	}
	
	public Main() {
		// TODO Auto-generated constructor stub
		int choose;
		
		do{
			System.out.println("1. Chef" );
			System.out.println("2. Worker");
			System.out.println("3. Driver");
			System.out.println("4. Artist");
			System.out.println("5. trained");
			System.out.println("6. Untrained");
			System.out.println("0. Exit");
			System.out.print("Input : ");
			choose = scan.nextInt(); scan.nextLine();
		}while(choose != 0);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
