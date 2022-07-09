package lab;
import java.util.*;

public class Stringbufft1 {

	public static void main(String[] args) {
		
		Scanner S = new Scanner(System.in);
		int flag = 0;
		while(flag != 15)
		{
			System.out.println("choose an option: ");
			System.out.println("1. append \n2. insert \n3. replace \n4. delete \n5. reverse"
					+ "\n6. capacity \n7. ensurecapacity \n8. length \n9. setlength \n10. charAt "
					+ "\n11. setCharAt \n12. getChars \n13. delete \n14. deleteCharAt \n15. quit");
			int choice = S.nextInt();
			
			switch(choice)
			{
			case 1:
				System.out.print("Enter 1st string to append: ");
				S.nextLine();
				String str1 = S.nextLine();
				System.out.print("Enter 2nd string to append: ");
				String str2 = S.nextLine();
				StringBuffer sb = new StringBuffer(str1);
				sb = sb.append(str2);
				System.out.println("String appended");
				System.out.println(sb);
				break;
			case 2:
				System.out.print("Enter a string: ");
				S.nextLine();
				String str = S.nextLine();
				System.out.print("Enter substring: ");
				String substr = S.nextLine();
				System.out.print("Enter index position: ");
				int indx = S.nextInt();
				sb = new StringBuffer(str);
				sb = sb.insert(indx, substr);
				System.out.println(sb);
				break;
			case 3:
				System.out.print("Enter a string: ");
				S.nextLine();
				str = S.nextLine();
				sb = new StringBuffer(str);
				System.out.print("Enter start index: ");
				int strtindx = S.nextInt();
				System.out.print("Enter ending index: ");
				int charnum = S.nextInt();
				System.out.print("Enter the substring: ");
				S.nextLine();
				substr = S.nextLine();
				sb = sb.replace(strtindx, charnum, substr);
				System.out.println(sb);
				break;
			case 4:
				System.out.print("Enter a string: ");
				S.nextLine();
				str = S.nextLine();
				sb = new StringBuffer(str);
				System.out.print("Enter starting index to delete: ");
				strtindx = S.nextInt();
				System.out.print("Enter ending index to delete: ");
				int endindx = S.nextInt();
				sb = sb.delete(strtindx, endindx);
				System.out.println(sb);
				break;
			case 5:
				System.out.print("Enter a string: ");
				S.nextLine();
				str = S.nextLine();
				sb = new StringBuffer(str);
				sb = sb.reverse();
				System.out.println("String reversed");
				System.out.println(sb);
				break;
			case 6:
				System.out.print("Enter a string: ");
				S.nextLine();
				str = S.nextLine();
				sb = new StringBuffer(str);
				int i = sb.capacity();
				System.out.println(i);
				break;
			case 7:
				System.out.print("Enter a string: ");
				S.nextLine();
				str = S.nextLine();
				sb = new StringBuffer(str);
				System.out.println("Current capacity of string is "+sb.capacity());
				System.out.print("Enter the capacity to be added: ");
				int mincap = S.nextInt();
				sb.ensureCapacity(mincap);
				System.out.println(sb.capacity()+" is the new capacity");
				break;
			case 8:
				System.out.print("Enter a string: ");
				S.nextLine();
				str = S.nextLine();
				sb = new StringBuffer(str);
				System.out.println("Length of string is "+sb.length());
				break;
			case 9:
				System.out.print("Enter a string: ");
				S.nextLine();
				str = S.nextLine();
				sb = new StringBuffer(str);
				System.out.println("The current lenght of string is "+sb.length());
				System.out.print("Enter the updated length: ");
				int updlen = S.nextInt();
				sb.setLength(updlen);
				System.out.println("new length is "+sb.length());
				break;
			case 10:
				System.out.print("Enter a string: ");
				S.nextLine();
				str = S.nextLine();
				sb = new StringBuffer(str);
				System.out.print("Enter the index position: ");
				indx = S.nextInt();
				char ch = sb.charAt(indx);
				System.out.println(ch);
				break;
			case 11:
				System.out.print("Enter a string: ");
				S.nextLine();
				str = S.nextLine();
				sb = new StringBuffer(str);
				System.out.print("Enter the index position: ");
				indx = S.nextInt();
				System.out.print("Enter the updated character: ");
				ch = S.next().charAt(0);
				sb.setCharAt(indx, ch);
				System.out.println("updated string : "+sb);
				break;
			case 12:
				System.out.print("Enter a string: ");
				S.nextLine();
				str = S.nextLine();
				sb = new StringBuffer(str);
				System.out.print("Enter the starting index: ");
				strtindx = S.nextInt();
				System.out.print("Enter the ending index: ");
				endindx = S.nextInt();
				System.out.print("Enter the character array length: ");
				int charlen = S.nextInt();
				char arch[] = new char[charlen];
				System.out.print("Enter Arraystart index in char array: ");
				int arrstrindx = S.nextInt();
				sb.getChars(strtindx, endindx, arch, arrstrindx);
				System.out.println(arch);
				break;
			case 13:
				System.out.print("Enter a string: ");
				S.nextLine();
				str = S.nextLine();
				sb = new StringBuffer(str);
				System.out.print("Enter the starting index: ");
				strtindx = S.nextInt();
				System.out.print("Enter the ending index: ");
				endindx = S.nextInt();
				sb.delete(strtindx, endindx);
				System.out.println(sb);
				break;
			case 14:
				System.out.print("Enter a string: ");
				S.nextLine();
				str = S.nextLine();
				sb = new StringBuffer(str);
				System.out.print("Enter the index to delete: ");
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
