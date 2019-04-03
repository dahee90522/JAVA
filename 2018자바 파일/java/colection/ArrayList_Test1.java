//arraylist의 메서드
//add()			데이터 삽입
//addAll()     
//get()          방의 데이터 가져오기
//remove()   데이터 삭제
//indexOf()   인덱스 위치 가져오기
//clear()       모든 데이터 지우기
//size()         배열의 크기
import java.util.*;
class ArrayList_Test1{
	public static void main(String ar[]){
		ArrayList<String> list = new ArrayList<String>();
		list.add("apple");
		list.add("mango");
		list.add("melon");
		list.add("grape");
		list.add(null);
		list.add(2, "strawberry");//index 2번에 삽입(3번째에 삽입)

		System.out.println(list.get(3));
		list.remove(3);
		System.out.println(list.size());
		System.out.println(list.indexOf("mango"));
		//System.out.println(list);

		/*for(String fruit:list){
			System.out.println(fruit);
		}//for-each 문*/

		Iterator<String> it = list.iterator();
		while(it.hasNext()){//다음 데이터가 있으면
			String s = it.next();//데이터를 s에 대입
			System.out.println(s+"\t");
		}//가장 많이 쓰이는 순서 3-2-1
		System.out.println("\n");
		list.clear();
		
	}
}