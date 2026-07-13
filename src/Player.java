import java.util.Scanner;
public class Player{

	//direction and decisions inputs
	public String decision = "";
	static Scanner sc = new Scanner(System.in);
	public static int Row = 0;
	public static int Col = 1;

	public void Direction(){
		System.out.println("");
		System.out.println("Where would you like to go? (w,a,s,d)");
		decision = sc.nextLine();
	}
}