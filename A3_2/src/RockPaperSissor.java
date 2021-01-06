import java.util.*;

public class RockPaperSissor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input1;
		String input2;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("가위 바위 보 게임입니다. 가위,바위,보 중에서 입력하세요");
		System.out.print("User A >> ");
		input1 = sc.next();
		System.out.print("User B >> ");
		input2 = sc.next();
		
		if (input1.equals("가위")&input2.equals("가위")) {
			System.out.print("비겼습니다.");
		}
		else if (input1.equals("바위")&input2.equals("바위")) {
			System.out.print("비겼습니다.");
		}
		else if (input1.equals("보")&input2.equals("보")) {
			System.out.print("비겼습니다.");
		}
		else if (input1.equals("가위")&input2.equals("보")) {
			System.out.print("A가 이겼습니다.");
		}
		else if (input1.equals("바위")&input2.equals("가위")) {
			System.out.print("A가 이겼습니다.");
		}
		else if (input1.equals("보")&input2.equals("바위")) {
			System.out.print("A가 이겼습니다.");
		}
		else if (input1.equals("가위")&input2.equals("바위")) {
			System.out.print("B가 이겼습니다.");
		}
		else if (input1.equals("바위")&input2.equals("보")) {
			System.out.print("B가 이겼습니다.");
		}
		else {
			System.out.print("B가 이겼습니다.");
		}
		
	}

}
