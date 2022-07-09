package lab;
import java.util.*;

public class String_buff {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String inp = S.nextLine();
		StringBuffer sb = new StringBuffer(inp);
		int flag = 0;
		while(flag != 15)
		{
			System.out.println("choose an option: ");
			System.out.println("0. Display the string \n1. append a string to another string \n2. insert substring \n3. replace \n4. delete string for range \n5. reverse the string"
					+ "\n6. capacity of string \n7. add capacity \n8. length of string \n9. set length \n10. charAt "
					+ "\n11. setCharAt \n12. getChars \n13. delele range \n14. deleteCharAt \n15. quit");
			int choice = S.nextInt();
			
			switch(choice)
			{
			case 0:
				System.out.println(sb);
				break;
			case 1:
				System.out.print("Enter the string to append: ");
				S.nextLine();
				String str = S.nextLine();
				sb.append(str);
				System.out.println("String appended");
				System.out.println(sb);
				break;
			case 2:
				System.out.print("Enter substring: ");
				S.nextLine();
				String substr = S.nextLine();
				System.out.print("Enter index position: ");
				int indx = S.nextInt();
				sb.insert(indx, substr);
				System.out.println(sb);
				break;
			case 3:
				System.out.print("Enter start index: ");
				int strtindx = S.nextInt();
				System.out.print("Enter ending index: ");
				int charnum = S.nextInt();
				System.out.print("Enter the substring: ");
				S.nextLine();
				substr = S.nextLine();
				sb.replace(strtindx, charnum, substr);
				System.out.println(sb);
				break;
			case 4:
				System.out.print("Enter starting index to delete: ");
				strtindx = S.nextInt();
				System.out.print("Enter ending index to delete: ");
				int endindx = S.nextInt();
				sb.delete(strtindx, endindx);
				System.out.println(sb);
				break;
			case 5:
				sb.reverse();
				System.out.println("String reversed");
				System.out.println(sb);
				break;
			case 6:
				int i = sb.capacity();
				System.out.println(i);
				break;
			case 7:
				System.out.print("Enter the min capacity to update: ");
				int mincap = S.nextInt();
				sb.ensureCapacity(mincap);
				System.out.println(sb.capacity()+" is the new capacity");
				break;
			case 8:
				System.out.println("Length of string is "+sb.length());
				break;
			case 9:
				System.out.print("Enter the updated length: ");
				int updlen = S.nextInt();
				sb.setLength(updlen);
				System.out.println("new length is "+updlen);
				break;
			case 10:
				System.out.print("Enter the index position: ");
				indx = S.nextInt();
				char ch = sb.charAt(indx);
				System.out.println(ch);
				break;
			case 11:
				System.out.print("Enter the index position: ");
				indx = S.nextInt();
				System.out.print("Enter the updated character: ");
				ch = S.next().charAt(0);
				sb.setCharAt(indx, ch);
				System.out.println("updated string "+sb);
				break;
			case 12:
				System.out.print("Enter the starting index: ");
				strtindx = S.nextInt();
				System.out.print("Enter the ending index: ");
				endindx = S.nextInt();
				System.out.print("Enter the character array length: ");
				int charlen = S.nextInt();
				char arch[] = new char[charlen];
				System.out.print("Enter Arraystart index: ");
				int arrstrindx = S.nextInt();
				sb.getChars(strtindx, endindx, arch, arrstrindx);
				System.out.println(arch);
				break;
			case 13:
				System.out.print("Enter the starting index: ");
				strtindx = S.nextInt();
				System.out.print("Enter the ending index: ");
				endindx = S.nextInt();
				sb.delete(strtindx, endindx);
				System.out.println(sb);
				break;
			case 14:
				System.out.print("Enter the index: ");
				indx = S.nextInt();
				sb.deleteCharAt(indx);
				System.out.println(sb);
				break;
			case 15:
				System.out.println("quitting the program");
				flag = 15;
				System.out.println("Exited");
				break;
			default:
				System.out.println("Invalid input entered");
			}
		}
			
		
	}

}
