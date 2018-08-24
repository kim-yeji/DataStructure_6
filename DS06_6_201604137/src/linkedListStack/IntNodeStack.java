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

	//마지막에 들어온 데이터 삭제
	@Override
	public int pop() {
		int target=0;
		Node currNode = this.head; // currentNode
		
		if(isEmpty()) return -1;
		//변수 target에 마지막 노드 데이터값 저장
		//새로운노드.getNaxt를 head에 넣어줌(연결끊김)
		//target반환
		target=currNode.getData();
		this.head=currNode.getNext();
		size--;
		return target;
		
		
	}

	//처음으로 들어온 데이터 삭제
	@Override
	public int popBottom() {
		Node prevNode=null;
		Node currNode = this.head;
		int target=0;
		
		if(isEmpty()) return -1;
		
		while(currNode!=null) {//널일 때 까지 (끝까지)탐색
			if(currNode.getNext()==null) { //마지막 바로 전 노드에 도착하면
				target=currNode.getData(); //현재 노드의 데이터를 target에 저장하고
				prevNode.setNext(null); // 현재노드를 null로 만듦으로써 prev노드를 마지막 노드로 만들어줌
				break;
			}
			//마지막 노드의 전노드가 아닐 경우에는
			
			prevNode=currNode;
			currNode=currNode.getNext();
		}
		size--;
		return target;
	}

	//데이터 삽입
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
	
	// 노드를 움직이면서 노드에 있는 데이터를 반환해줌
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
