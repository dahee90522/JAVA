import java.util.*;
import java.util.Random;
interface starcraft{
	int max = 100;
	int min = 0;
	
	public void moveable(String color);
	public void attackable(String point);
}
class Jurg implements starcraft{
	 Random rand = new Random(); 
	String color;
		int x=rand.nextInt(100)+1;
		int y=rand.nextInt(100)+1;
	public void moveable(String color){
		this.color = color;
		System.out.println("\n"+color+"좌표는 요기");
		System.out.print(color);
		System.out.println(" = ("+x+","+y+")");
		System.out.println("\n");
	}
	public void attackable(String point){
		Scanner sc = new Scanner(System.in);//앞으로 이동하기
		while(true){
			if(point.equals("a")){--x;}
			else if(point.equals("d")){++x;}
			else if(point.equals("s")){--y;}
			else if(point.equals("w")){++y;}
			if(x>max||x<min||y>max||y<min){
				System.out.println("초과!!!!!!!다시!!!");
				if(x>max) x--;
				if(x<min) x++;
				if(y>max) y--;
				if(y<min) y++;
				String point1 = sc.next();
				point = point1;
			}
			else 
				break;
		}
				System.out.print(color + "의 좌표는 : ");
				System.out.println("("+x+","+y+")");
		
	}
}
class Teran implements starcraft{
	 Random rand = new Random(); 
	String color;
	int x1=1+rand.nextInt(100);
	int y1=1+rand.nextInt(100);
	public void moveable(String color){
		this.color = color;
		System.out.println("\n"+color+"좌표는 요기 : ");
		System.out.print(color);
		System.out.println(" = ("+x1+","+y1+")");
		System.out.println("\n");
	}
	public void attackable(String point){
		Scanner sc = new Scanner(System.in);//앞으로 이동하기
		while(true){
			if(point.equals("j")){--x1;}
			else if(point.equals("l")){++x1;}
			else if(point.equals("k")){--y1;}
			else if(point.equals("i")){++y1;}
			if(x1>max||x1<min||y1>max||y1<min){
				System.out.println("초과!!!!!!!다시!!!");
				if(x1>max) x1--;
				if(x1<min) x1++;
				if(y1>max) y1--;
				if(y1<min) y1++;
				String point1 = sc.next();
				point = point1;
			}
			else 
				break;
		}
				System.out.print(color + "의 좌표는 : ");
				System.out.println("("+x1+","+y1+")");
	}
}
class starcraft_Test{
	public static void main(String ar[]){
		Scanner sc = new Scanner(System.in);
		Random rand = new Random(); 
		String o;
		Jurg joo = new Jurg();
		Teran daa = new Teran();

		System.out.print("Player 1의 이름 입력 : ");
		String jurg = sc.next();
		joo.moveable(jurg);
		System.out.print("Player 2의 이름 입력 : ");
		String teran = sc.next();
		daa.moveable(teran);
		System.out.println("\n");
		
		while(true){
			int z = 1;
			while(z<=5){
				System.out.print(jurg+" : a←, d→, s↓, w↑ : ");
				String j = sc.next();
				joo.attackable(j);
				//
				System.out.print(teran + " : j←, l→, k↓, i↑ : ");
				String h = sc.next();
				daa.attackable(h);
				System.out.println("메모??(없다면 없음)");
				String babo = sc.next();
				if(babo .equals("황다희")){System.out.println("박은수 바보\n");}
				else if(babo.equals("없음")){System.out.print("");}
				else{System.out.println("==>\t"+babo+"\t<==");}
				System.out.println("\n");
				z++;

			}
			System.out.print("끝내고 싶으면 0을 누르시오(그 외 계속) : ");
			o = sc.next();
			if(o.equals("0"))break;
			else continue;
		}
	}
}