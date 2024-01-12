import java.util.Scanner;
public class SwitchExample {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("******** MENU ***********");
		System.out.println("A or a Means Ada");
		System.out.println("C or c Means C Language");
		System.out.println("F or f Means Fortran");
		System.out.println("P or p Means Python");
		System.out.println("J or j Means Java");
		System.out.println("V or v Means Visual C++");
		System.out.println("*******************");
		System.out.println("Enter Your Choice");
		char choice = input.next().charAt(0);
		switch(choice) {
		    case 'a':
		    case 'A':
		    	System.out.println("Ada");
		    	break;
		    case 'c':
		    case 'C':
		    	System.out.println("C Language");
		    	break;
		    case 'p':
		    case 'P':
		    	System.out.println("Python");
		    	break;
		    case 'f':
		    case 'F':
		    	System.out.println("Fortran");
		    	break;
		    case 'j':
		    case 'J':
		    	System.out.println("Java");
		    	break;
		    case 'v':
		    case 'V':
		    	System.out.println("Visual C++");
		    	break;
		    default:
		    	System.out.println("Invalid Choice");
		}
		input.close();
	}
}
