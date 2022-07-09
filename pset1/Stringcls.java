package lab;
import java.util.*;

public class Stringcls {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		Scanner S = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String inp = S.nextLine();
		String val = new String(inp);
		int flag = 0;
		while(flag!=19)
		{
			System.out.println("choose an option: ");
			System.out.println(" 0.display \n 1.length \n 2.concatination \n 3.character extraction \n 4.compareTo \n 5.compareToIgnoreCase"
					+ "\n 6.equals \n 7.equalsIgnoreCase \n 8.indexOf \n 9.lastIndexOf \n 10.startsWith \n 11.endsWith \n 12.substring"
					+ "\n 13.trim \n 14.toUpperCase \n 15.toLowerCase \n 16.split \n 17.join \n 18.replace \n 19.quit");
			int option = S.nextInt();
			switch(option)
			{
			case 0:
				System.out.println(val);
				break;
			case 1:
				System.out.println("length of string is: "+val.length());
				break;
			case 2:
				System.out.print("Enter a string to concat: ");
				S.nextLine();
				String str = S.nextLine();
				val = val.concat(str);
				System.out.println(val);
				break;
			case 3:
				System.out.print("Enter the index: ");
				int indx = S.nextInt();
				System.out.println(val.charAt(indx));
				break;
			case 4:
				System.out.print("Enter a string to compare: ");
				S.nextLine();
				str = S.nextLine();
				int bl = val.compareTo(str);
				System.out.println(bl);
				break;
			case 5:
				System.out.print("Enter a string to compare ignoring cases: ");
				S.nextLine();
				str = S.nextLine();
				bl = val.compareToIgnoreCase(str);
				System.out.println(bl);
				break;
			case 6:
				System.out.print("Enter a string to equals: ");
				S.nextLine();
				str = S.nextLine();
				System.out.println(val.equals(str));
				break;
			case 7:
				System.out.print("Enter a string to equals ignoring case: ");
				S.nextLine();
				str = S.nextLine();
				System.out.println(val.equalsIgnoreCase(str));
				break;
			case 8:
				System.out.print("Enter character to get index of: ");
				char ch = S.next().charAt(0);
				System.out.println(val.indexOf(ch));
				break;
			case 9:
				System.out.print("Enter character to get last index of: ");
				ch = S.next().charAt(0);
				System.out.println(val.lastIndexOf(ch));
				break;
			case 10:
				System.out.print("Enter a substring: ");
				S.nextLine();
				str = S.nextLine();
				System.out.println(val.startsWith(str));
				break;
			case 11:
				System.out.print("Enter a substring: ");
				S.nextLine();
				str = S.nextLine();
				System.out.println(val.endsWith(str));
				break;
			case 12:
				System.out.print("Enter starting index: ");
				int strtindx = S.nextInt();
				System.out.print("Enter ending index: ");
				int endindx = S.nextInt();
				System.out.println(val.substring(strtindx,endindx));
				break;
			case 13:
				val.trim();
				System.out.println("String trimmed");
				break;
			case 14:
				val = val.toUpperCase();
				System.out.println(val);
				break;
			case 15:
				val = val.toLowerCase();
				System.out.println(val);
				break;
			case 16:
				System.out.print("Enter a substring to split: ");
				S.nextLine();
				str = S.nextLine();
				String[] arr = val.split(str);
				for(int i=0; i<arr.length;i++)
				{
					System.out.println(arr[i]);
				}
				break;
			case 17:
				System.out.print("Enter the common delimiter: ");
				S.nextLine();
				str = S.nextLine();
				System.out.print("How many string you want to join: ");
				int cnt = S.nextInt();
				String Sarr[] = new String[cnt];
				S.nextLine();
				for(int i=0;i<cnt;i++)
				{
					System.out.print("Enter element no "+i+": ");
					Sarr[i] = S.nextLine();
				}
				String Sresult = String.join(str, Sarr);
				System.out.println(Sresult);
				break;
			case 18:
				System.out.print("Enter the old char or substring to replace: ");
				S.nextLine();
				String str1 = S.nextLine();
				System.out.print("Enter the new char or substring to replace: ");
				String str2 = S.nextLine();
				val = val.replace(str1,str2);
				System.out.println(val);
				break;
			case 19:
				System.out.println("quitting program");
				flag = 19;
				System.out.println("exited");
				break;
			default:
				System.out.println("Invalid input entered");
				break;
				
			}
		}
	}

}
