import java.util.*;

public class ConsonantVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input;
		
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("���ڸ� �Է��ϼ���: ");
			input = sc.next();
		
			switch (input) {
				case "a":
				case "A":
					case "e":
					case "E":
					case "i":
					case "I":
					case "o":
					case "O":
					case "u":
					case "U":
						System.out.println("�����Դϴ�");
						break;
					default :
						if(!(input.equals("quit")))
							System.out.println("�����Դϴ�");
						else
							break;
			}
			if(input.equals("quit"))
				break;
		}
		System.out.println("���α׷� ����!");
	}
}
// str1.equals(str2)