import java.util.*;
public class Reserve{
    public static void main(String ar[]) {
        Scanner sc = new Scanner(System.in);
        String name;
        int numb, num;
        int s1=0;
        int a1=0, b1=0;

        String ss[] = new String[10];
        for(int i = 0;i<10;i++) {
            ss[i]="--- ";
        }
        String as[] = new String[20];
        for(int i = 0;i<20;i++) {
            as[i]="--- ";
        }
        String bs[] = new String[15];
        for(int i = 0;i<15;i++) {
            bs[i]="--- ";
        }
        while(true) {
            System.out.print("예약<1>, 조회<2>, 취소<3>, 끝내기<4>");
            int type = sc.nextInt();
            if(type ==1) {
                System.out.print("좌석 구분 S(1)["+s1+"], A(2)["+a1+"], B(3)["+b1+"] : ");
                int seatType = sc.nextInt();
                if(seatType==1) {
                    System.out.print("S>> ");
                    for(int j = 0;j<ss.length;j++)
                        System.out.print(ss[j]);
                    System.out.println("");
                    System.out.print("이름 >> ");
                    name = sc.next();

                    System.out.print("좌석 번호 >> ");
                    num = sc.nextInt();
                    ss[num-1]=name+" ";
                    s1++;
                }
                if(seatType==2) {
                    System.out.print("A>> ");
                    for(int j = 0;j<as.length;j++)
                        System.out.print(as[j]);
                    System.out.println("");
                    System.out.print("이름 >> ");
                    name = sc.next();
                    System.out.print("좌석 번호 >> ");
                    num = sc.nextInt();
                    as[num-1]=name+" ";
                    a1++;

                }
                if(seatType==3) {
                    System.out.print("B>> ");
                    for(int j = 0;j<bs.length;j++)
                        System.out.print(bs[j]);
                    System.out.println("\n");

                    System.out.print("이름 >> ");
                    name = sc.next();
                    System.out.print("좌석 번호 >> ");
                    num = sc.nextInt();
                    bs[num-1]=name+" ";
                    b1++;
                }

            }
            else if(type==2) {
                System.out.print("S >> ");
                for(int i = 0;i<ss.length;i++)
                    System.out.print(ss[i]);
                System.out.println("\n");
                System.out.print("A >> ");
                for(int i = 0;i<as.length;i++)
                    System.out.print(as[i]);
                System.out.println("\n");
                System.out.print("B >> ");
                for(int i = 0;i<bs.length;i++)
                    System.out.print(bs[i]);
                System.out.println("\n");

            }
            else if(type==3) {
                System.out.print(" S(1)["+s1+"], A(2)["+a1+"], B(3)["+b1+"] : ");
                int ga = sc.nextInt();
                
                if(ga==1) {
                    System.out.print("S>> ");
                    for (int j = 0; j < ss.length; j++)
                        System.out.print(ss[j]);
                    System.out.println("");
                    System.out.print("취소할 칸 번호(왼쪽부터 1) >> ");
                    numb = sc.nextInt();
                    if (!ss[numb - 1].equals("--- ")) {
                        ss[numb - 1] = "--- ";
                        s1--;
                    }
                }
                if(ga==2) {
                    System.out.print("A>> ");
                    for(int j = 0;j<as.length;j++)
                        System.out.print(as[j]);
                    System.out.println("");;
                    System.out.print("취소할 칸 번호(왼쪽부터 1) >> ");
                    numb = sc.nextInt();
                    if(!as[numb-1].equals("--- ")) {
                        as[numb-1]="--- ";
                        a1--;
                    }
                }

                if(ga==3) {
                    System.out.print("B>> ");
                    for(int j = 0;j<bs.length;j++)
                        System.out.print(bs[j]);
                    System.out.println("");
                    System.out.print("취소할 칸 번호(왼쪽부터 1) >> ");
                    numb = sc.nextInt();
                    if(!bs[numb-1].equals("--- ")) {
                        bs[numb-1]="--- ";
                        b1--;
                    }

                }
			}
			else if(type==4) {
				System.exit(0); 
                
            }
        }
    }
}
