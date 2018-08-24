package linkedListStack;

import java.util.Scanner;

public class Main {

	IntNodeStack ins = new IntNodeStack();
	
	public void run() {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("1.���ÿ� ���� �߰�");
			System.out.println("2.���ÿ� ���������� ���� ���� ����");
			System.out.println("3.���ÿ� ó�� ���� ���� ����");
			System.out.println("4.������ ���");
			System.out.println("5.���� ���");
			System.out.println("6.����");
			
			int menu = scan.nextInt();
			if(menu==6) break;
			
			switch(menu) {
				case 1:
					System.out.print("�߰� �� ���� �Է��ϼ���:");
					int addData = scan.nextInt();
					ins.push(addData);
					break;
				case 2:
					
					System.out.println("������ ��� ��:"+ins.pop());
					System.out.println("���� �� ���: "+ins.checkNode());
					break;
				case 3:
					
					System.out.println("������ ��� ��:"+ins.popBottom());
					System.out.println("���� �� ���: "+ins.checkNode());
					break;
				case 4:
					System.out.print("������:");
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
