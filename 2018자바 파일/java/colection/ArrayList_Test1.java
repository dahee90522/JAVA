//arraylist�� �޼���
//add()			������ ����
//addAll()     
//get()          ���� ������ ��������
//remove()   ������ ����
//indexOf()   �ε��� ��ġ ��������
//clear()       ��� ������ �����
//size()         �迭�� ũ��
import java.util.*;
class ArrayList_Test1{
	public static void main(String ar[]){
		ArrayList<String> list = new ArrayList<String>();
		list.add("apple");
		list.add("mango");
		list.add("melon");
		list.add("grape");
		list.add(null);
		list.add(2, "strawberry");//index 2���� ����(3��°�� ����)

		System.out.println(list.get(3));
		list.remove(3);
		System.out.println(list.size());
		System.out.println(list.indexOf("mango"));
		//System.out.println(list);

		/*for(String fruit:list){
			System.out.println(fruit);
		}//for-each ��*/

		Iterator<String> it = list.iterator();
		while(it.hasNext()){//���� �����Ͱ� ������
			String s = it.next();//�����͸� s�� ����
			System.out.println(s+"\t");
		}//���� ���� ���̴� ���� 3-2-1
		System.out.println("\n");
		list.clear();
		
	}
}