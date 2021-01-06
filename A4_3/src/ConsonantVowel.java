import java.util.*;

public class ConsonantVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input;
		
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("문자를 입력하세요: ");
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
						System.out.println("모음입니다");
						break;
					default :
						if(!(input.equals("quit")))
							System.out.println("자음입니다");
						else
							break;
			}
			if(input.equals("quit"))
				break;
		}
		System.out.println("프로그램 종료!");
	}
}
// str1.equals(str2)