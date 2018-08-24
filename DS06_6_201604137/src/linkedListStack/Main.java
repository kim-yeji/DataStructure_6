package linkedListStack;

import java.util.Scanner;

public class Main {

	IntNodeStack ins = new IntNodeStack();
	
	public void run() {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("1.스택에 내용 추가");
			System.out.println("2.스택에 마지막으로 들어온 내용 삭제");
			System.out.println("3.스택에 처음 들어온 내용 삭제");
			System.out.println("4.사이즈 출력");
			System.out.println("5.내용 출력");
			System.out.println("6.종료");
			
			int menu = scan.nextInt();
			if(menu==6) break;
			
			switch(menu) {
				case 1:
					System.out.print("추가 할 값을 입력하세요:");
					int addData = scan.nextInt();
					ins.push(addData);
					break;
				case 2:
					
					System.out.println("삭제한 노드 값:"+ins.pop());
					System.out.println("삭제 한 결과: "+ins.checkNode());
					break;
				case 3:
					
					System.out.println("삭제한 노드 값:"+ins.popBottom());
					System.out.println("삭제 한 결과: "+ins.checkNode());
					break;
				case 4:
					System.out.print("사이즈:");
					System.out.println(ins.size());
					break;
				case 5:
					System.out.println(ins.checkNode());
					break;
			}
			
		}
	}
	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

}
