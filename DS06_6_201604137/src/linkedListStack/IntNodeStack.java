package linkedListStack;

public class IntNodeStack implements IntStack{
	private Node head;
	private int size;
	

	public IntNodeStack() {
		this.head = null;
		this.size = 0;
	}

	@Override
	public boolean isEmpty() {
		return (size==0);
	}

	//�������� ���� ������ ����
	@Override
	public int pop() {
		int target=0;
		Node currNode = this.head; // currentNode
		
		if(isEmpty()) return -1;
		//���� target�� ������ ��� �����Ͱ� ����
		//���ο���.getNaxt�� head�� �־���(�������)
		//target��ȯ
		target=currNode.getData();
		this.head=currNode.getNext();
		size--;
		return target;
		
		
	}

	//ó������ ���� ������ ����
	@Override
	public int popBottom() {
		Node prevNode=null;
		Node currNode = this.head;
		int target=0;
		
		if(isEmpty()) return -1;
		
		while(currNode!=null) {//���� �� ���� (������)Ž��
			if(currNode.getNext()==null) { //������ �ٷ� �� ��忡 �����ϸ�
				target=currNode.getData(); //���� ����� �����͸� target�� �����ϰ�
				prevNode.setNext(null); // �����带 null�� �������ν� prev��带 ������ ���� �������
				break;
			}
			//������ ����� ����尡 �ƴ� ��쿡��
			
			prevNode=currNode;
			currNode=currNode.getNext();
		}
		size--;
		return target;
	}

	//������ ����
	@Override
	public void push(int data) {
		Node newNode = new Node(data);
		newNode.setNext(this.head);
		this.head=newNode;
		this.size++;
		
	}

	@Override
	public int size() {
		return this.size;
	}
	
	// ��带 �����̸鼭 ��忡 �ִ� �����͸� ��ȯ����
		public String checkNode() {
			String content = "";
			Node searchNode = this.head;
			while (searchNode != null) {
				content += searchNode.getData();
				content += " ";
				searchNode = searchNode.getNext();
			}
			return content;
		}

}
